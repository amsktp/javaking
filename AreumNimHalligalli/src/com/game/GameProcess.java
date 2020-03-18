package com.game;

import java.util.Scanner;

import com.util.PrintCard;
 

/**
 * 
 * @author dkfma
 * 1. 잘 섞은 카드를 플레이어수(4명) 만큼 모두 똑같이 나눠 갖는다.
 * 2. 카드더미를 플레이어는 볼 수 없다. 
 * 3. 플레이어 순서에 따라 카드 1장씩 오픈한다. 
 * 4. 오픈한 카드의 같은모양의 총 개수가 딱! 5개일때 땡(hitPoint)을을 친다. 
 * 5. 5개가 나오지 않으면 나올때까지 계속 누적해서 오픈한다. 
 * 6. 5개를 맞춘 플레이어가 누적된 카드를 모두 가져간다.
 * 7. 틀리게 땡을 친 플레이어는 다른 플레이어들에게 1장씩 나눠준다.(누적카드는 계속 이어서 진행한다.)
 * 8. 이를 계속 반복하다가 자신의 카드가 다 사라지면 게임에서 탈락한다.
 * 9. 최종적으로 가장 카드를 많이 가진 플레이어가 승리한다. (1명 탈락이 나오면 집계)
 */
public class GameProcess extends GameSetting {
	
	
	boolean bell = false;	//종 - 숫자5인지 확인할때 
	int userOrder = 0;		//유저순서
	
	// 일반적인 Class 호출 위한 객체 선언
	GamePrint gp = new GamePrint();
	PrintCard pc = new PrintCard();
	 
	private void playGame(){		// 게임 한번 진행
		
		GameRules rules = new GameRules();
		rules.personNum = 4;	//게임인원 지정
		
		int turnCount =0;	//게임턴 횟수
		int order = 0; 		//플레이어순서
		
		//유저의 순서정하기 
		gp.randomize();	
		int userOrder = user.getOrder(); 	//유저가 몇번째 차례인지
		
		rules.divideCards();	//카드 나눠줌
		
		rules.drawPlayDeck();	//플레이어들의 카드덱 출력
		System.out.println("턴을 넘기려면 x를, 종을 치려거든 z를 눌러주세요.(처음 시작도 x를 눌러주세요.)");
		
		//한 명의 탈락자가 나올때까지
		while(rules.makePlayers.getPlayerCardMap().get(0).isEmpty() != true &&
				rules.makePlayers.getPlayerCardMap().get(1).isEmpty() != true &&
				rules.makePlayers.getPlayerCardMap().get(2).isEmpty() != true &&
				rules.makePlayers.getPlayerCardMap().get(3).isEmpty() != true ) {
			
			gp.infoOrder(order); //순서를 알려줌
			
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();		//종칠거니? z:true x:false
			if(input.equals("z")) {
				if(turnCount != 0) {	//첫 턴이 아닐때 
					hitBell();
				}else {		//시작일때 
					System.err.println("아직 오픈된 카드가 없습니다.");
					System.err.println("카드를 오픈합니다.");
					pass();
				}
			}else if(input.equals("x")) {
				pass();
			}else {
				System.err.println("종을 맞추지 못했습니다.");
				bell = false;
			}
			
			
			boolean failCheck = false;	//5개임을 틀린경우 체크
			boolean check = rules.checkFive();	//위에 다섯개인지 체크
			
			if(bell == true) {	 
				if(check == true) {	//5개임을 맞추면
					rules.success(userOrder);
				}else {		//5개임을 틀리면
					rules.fail(userOrder);
					failCheck = true;
				}
			}
			//다섯개인데 내가 종을 안친경우
			if(check == true && bell == false && userOrder != order) {
				rules.success(order);	//order차례의 컴퓨터가 가져감 
			}
			
			//벨을 쳤는데 5개임을 틀린경우에는 자신의 패를 한장 오픈하지 않는다. 
			if(bell == true && failCheck == true) {
				rules.noOpen();
			}else {
				rules.open(order);
			}
			turnCount++;
			order = turnCount % rules.personNum;
			

			bell = false; //리셋
			
			//TEST inBoard 출력
//			for(int i =0; i<rules.inBoard.size();i++) {
//				rules.inBoard.get(i);
//			}
		}
		
		
		boolean result = rules.result();
		if(result == true) {
			System.out.println("승리하셨습니다.");
			System.out.println("연승기록에 1연승이 추가됩니다.");
			user.setWin(user.getWin()+1);
		}else {
			System.out.println("패배하셨습니다.");
			System.out.println("연승기록이 원점으로 돌아갑니다.");
			user.setWin(0);
		}
		
		
	}
	
	public void loopGame(){		//게임 반복
		
		gp.intro();
		
		gp.createUser();
		
		while(true) {
			System.out.println();
			gp.menu();
			System.out.println("메뉴를 선택해주세요.");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			
			switch (input) {
			default:
				while(input >= 4 || input <= 0) {
					System.err.println("================== 잘 못 누르셨습니다 ==================");
					System.out.println("1.게임시작    2.설명듣기    3.사용자정보    4.제작자정보    5.게임종료");
					input = scan.nextInt();
				}
			case 1:
				gp.start();
				playGame();
				break;
			case 2:
				gp.explain();
				System.out.println("다시 메뉴창으로 돌아갑니다.");
				break;
			case 3:
				gp.userInfo();
				System.out.println("다시 메뉴창으로 돌아갑니다.");
				break;
			case 4:
				gp.makerInfo();
				System.out.println("다시 메뉴창으로 돌아갑니다.");
				break;
			case 5:
				gp.end();
				return;
			}
		}

	}
	
	
	public void pass() {	//종 패스
		bell = false;
	}
	
	public void hitBell() {	//종을 침
		bell = true;
	}
	
	
	
	
}
