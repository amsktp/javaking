//5일차
/**
 * 
 **/

import java.util.Scanner;
public class ForTest18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userSelectNum = 0;
		int answer = 0;
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		String inputStr = "";

		while(flag) {
			//랜덤 수 만드는 곳
			System.out.println("상대방이 숫자를 선택했습니다");
			System.out.println("1~100사이니 맞춰보세요~");
			answer = (int)(Math.random() * 100) + 1;

			//게임 시작되는 부분
			while(true) {
				
				//숫자를 입력받는 곳
				System.out.print("1과 100 사이의 정수를 입력해 주세요 (0이면 종료) ===>  " +answer);
				userSelectNum = scan.nextInt();

				//사용자가 0이외의 수를 입력 했을 경우
				if (userSelectNum != 0) {

					//입력한 수가 답보다 높을 경우
					if(userSelectNum < answer) {
						System.out.println("UP");

						//입력한 수가 답보다 낮을 경우
					} else if(userSelectNum > answer) {
						System.out.println("DOWN");

						//정답일 경우

					} else if(userSelectNum == answer) {
						System.out.println("정답입니다~~");
						System.out.println();
						scan.nextLine();
						
						while(true) {
							System.out.println("더 하시겠습니까~~~? ( y / n ) =====>  ");

							inputStr = scan.nextLine();
							//사용자가 y눌렀을때 랜덤 수 창출부터 다시
							if (inputStr.equals("y") || inputStr.equals("Y")) {
								break;

								//사용자가 n 눌렀을때 나가지는 곳
							} else if(inputStr.equals("n") || inputStr.equals("N")) {
								flag = false;
								break;
							} else {
								System.out.println("다시 입력해주세요");
							}
						}
						break;
						//혹시모를 오류 대비
					} else {
						System.out.println("오류입니다 다시 입력해주세요");
					}
					// 사용자가 0 입력했을때 종료하기 위한 부분
				} else {
					flag = false;
					break;
				}
			}
		}	
		System.out.println("종료했습니다");
	}
}