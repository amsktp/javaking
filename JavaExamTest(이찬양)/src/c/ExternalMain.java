package c;

import util.keyboard.Keyboard;

// 주사위 숫자 맞추기
public class ExternalMain {

	public static void main(String[] args) {

		Keyboard.getInstance();

		int diceNum = 0;
		int userNum = 0;

		System.out.println("===  주사위 맞추기  ===");
		diceNum = (int) (Math.random() * 6 + 1);
		System.out.println("주사위가 던져졌습니다.");
		System.out.println("주사위 숫자는 무엇일까요?");
		System.out.println("기회는 한 번 뿐이니 신중히 입력해주세요!!");
		System.out.println();
		System.out.print("숫자를 입력해주세요(1~6)>>      ");
		userNum = Keyboard.getInstance().getInt();
		System.out.println("주사위 숫자:유저의 숫자");
		System.out.println(diceNum + "\t:" + userNum);
		if (diceNum == userNum) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
	}
}
