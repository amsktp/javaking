//5일차
/**
 * 
 **/

import java.util.Scanner;
public class ForTest16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userSelectNum = 0;
		int answer = 0;
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		
		answer = (int)(Math.random() * 100) + 1;
		System.out.println("상대방이 숫자를 선택했습니다");
		System.out.println("1~100사이니 맞춰보세요~");

		
		
		while(flag) {
			System.out.print("1과 100 사이의 정수를 입력해 주세요 ===>  ");
			userSelectNum = scan.nextInt();
			if (userSelectNum != 0) {
				if(userSelectNum < answer) {
					System.out.println("UP");
				} else if(userSelectNum > answer) {
					System.out.println("DOWN");
				} else if(userSelectNum == answer) {
					System.out.println("정답입니다~~");
					flag = false;
				} else {
					System.out.println("오류입니다 다시 입력해주세요");
				}
			} else {
				System.out.println("종료했습니다");
				flag = false;
			}
		
		}	
		
	}
}