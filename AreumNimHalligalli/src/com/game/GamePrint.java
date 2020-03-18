package com.game;

import java.util.Scanner;

 

public class GamePrint extends GameSetting {

	void intro() {
		System.out.println("☆★☆★☆★ 할리갈리 게임에 오신 것을 환영합니다 ☆★☆★☆★");
	}
	
	void createUser() {
		String name = "";
		String id = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("------------ 유저를 새로 생성합니다 ------------");
		System.out.print("이름을 입력해주세요. >>  ");
		name = scan.nextLine();
		user.setName(name);
		System.out.print("아이디를 입력해주세요. >>  ");
		id = scan.nextLine();
		user.setId(id);
		System.out.println("-----------------------------------------");
	}
	
	void menu() {
		System.out.println("1.게임시작    2.설명듣기    3.사용자정보    4.제작자정보    5.게임종료");
	}
	
	void start() {
		System.out.println("☆★☆★☆★ 게임을 시작합니다 ☆★☆★☆★");
	}
	
	void explain() {
		System.out.println("☆★☆★☆★ <할리갈리 ver.1>게임 방법은 다음과 같습니다 ☆★☆★☆★");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("1. 카드에는 ♥, ◆, ♠, ♣ 4종류의 모양이 등장합니다.");
		System.out.println("      모양은 1개에서 5개까지 그려져 있습니다.");
		System.out.println("2. 먼저, 카드를 잘 섞은 뒤 모두 똑같이 카드를 나눠 가집니다.");
		System.out.println("      플레이어들은 각자 나눠 받은 카드를 그림이 보이지 않게 뒤집어둡니다.");
		System.out.println("      잘 섞은 다음 카드 더미를 만들어 자기 앞에 둡니다.");
		System.out.println("3. 순서에 따라 돌아가면서 차례인 플레이어는 자기 카드 더미에서 맨 위에 있는 카드를 1장 펼칩니다.");
		System.out.println("4. 한 종류의 모양이 딱! 5개가 되면 누구나 종을 칠 수 있습니다.");
		System.err.println("      턴을 넘기려면 x를, 종을 치려거든 z를 눌러주세요.(처음 시작도 x를 눌러주세요.)");
		System.out.println("5. 종을 가장 먼저 친 플레이어는 그때까지 펼쳐진 카드들을 가져가 자기 카드 더미 밑으로 가져갑니다.");
		System.out.println("6. 5개가 아닌, 종을 잘못 친 경우에는 다른 플레이어 모두에게 자기 카드 더미에 있는 카드를 1장씩 나눠줘야 합니다.");
		System.out.println("7. 게임을 진행하다가 자기 차례에 더 이상 펼칠 카드가 없는 플레이어는 게임에서 탈락합니다.");
		System.out.println("   <할리갈리 ver.1>에서는 한 명의 탈락자가 나오면 게임이 끝이 납니다.");
		System.out.println("8. 최종적으로 가장 카드를 많이 가진 플레이어가 승리합니다.");
		System.out.println("--------------------------------------------------------------------------------");
	}
	
	void userInfo() {
		System.out.println("---------------------------------------------");
		System.out.println("\t\t이름 : " + user.getName());
		System.out.println("\t\t아이디 : "+ user.getId());
		if(user.getWin() != 0) {
			System.out.println("\t\t연승기록 : " + user.getWin() + "연승");
		}else {
			System.out.println("\t\t아직 연승한 적이 없습니다.");
		}
		System.out.println("---------------------------------------------");
	}
	
	void makerInfo() {
		System.out.println("------------ HalliGalli 제작 ------------");
		System.out.println("제작 : 원아름");
		System.out.println("Ver1 : 2020-03-02");
		System.out.println("-----------------------------------------");
	}
	
	void end() {
		System.out.println("☆★☆★☆★ 게임을 종료합니다 ☆★☆★☆★");
	}
	
	void randomize() {	//유저의 랜덤순서 정하기
		System.out.println("-----------------------------------------");
		System.out.println(user.getId()+"의 순서를 정합니다.");
	
		int userOrder = (int)(Math.random() * 4);
		
		System.out.println(user.getId()+ "의 순서는 "+ (userOrder+1)+"번째 입니다.");
		System.out.println("-----------------------------------------");
		user.setOrder(userOrder);	
	}
	
	void infoOrder(int order){		//순서 안내
		//System.out.println();
		if(order == user.getOrder()) {
			System.out.println(user.getId()+"님의 차례입니다.");
		}else {
			System.out.println((order+1) + "번째 플레이어 차례입니다.");
		}
	}
	
}
