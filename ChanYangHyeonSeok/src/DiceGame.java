//11일일차 20 02 24
public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dice d = new Dice();
		Player p1 = new Player("이찬양");
		Player p2 = new Player("오현석");

		int setRound = 10;
		
		//p1의 주사위 값의 합
		int sumP1 = 0;

		//p2의 주사위 값의 합
		int sumP2 = 0;

		//p1의 주사위값 저장하는 변수
		int p1Dice = 0;

		//p2의 주사위값 저장하는 변수
		int p2Dice = 0;

		//몇번째 판인지 알려주는 변수
		int cnt = 1;

		//이긴 사람 판별하는거 true일떄 p2 승리, false 일때 p1승리
		boolean win = false;

		//한명이라도 이기게 된다면 false로 게임이 끝나버림
		boolean flag = false;

		System.out.println("주사위 게임입니다!! " + p1.name + " VS " + p2.name);
		System.out.println();
		flag = true;
		while(flag) {

			//p1의 주사위 굴리기
			System.out.println(p1.name + "님의 " + cnt + "번째 판");
			p1Dice = d.throwDice();
			System.out.println(p1.name + "님이 주사위를 던졌습니다");
			System.out.println("주사위의 값 : " + p1Dice);
			sumP1 = sumP1 + p1Dice;
			System.out.println("현재 위치 : " + sumP1 + "번째 칸");
			System.out.println();
			
			//p1이 이길 시 게임 끝
			if(sumP1 >= setRound) {
				win = false;
				break;	
			}
			
			//p2의 주사위 굴리기
			System.out.println(p2.name + "님의 " + cnt + "번째 판");
			p2Dice = d.throwDice();
			System.out.println(p2.name + "님이 주사위를 던졌습니다");
			System.out.println("주사위의 값 : " + p2Dice);
			sumP2 = sumP2 + p2Dice;
			System.out.println("현재 위치 : " + sumP2 + "번째 칸");
			System.out.println();
			
			//p2가 이길 시 게임 끝
			if(sumP2 >= setRound) {
				win = true;
				break;
			}
			
			//몇번째 판인지 카운트
			cnt++;
		}

		//win이 true면 p2 승리
		if(win) {
			System.out.println("최종 위치 : " + sumP2 + "번쨰 칸");
			System.out.println("결과 : " + p2.name + "님의 승리입니다.");
		}else {
			System.out.println("최종 위치 : " + sumP1 + "번째 칸");
			System.out.println("결과 : " + p1.name + "님의 승리입니다.");
		//win이 false면 p1 승리
		}
	}
}