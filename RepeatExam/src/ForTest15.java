//5일차
/**
 * 구구단인데 사용자가 원하는 구구단만 보여주기
 * ==================================
 * 
 * 
 **/

import java.util.Scanner;

public class ForTest15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int inputNum = 0;
		int resultNum = 0;
		boolean flag = true;
		String resultStr = "";
		
		while (flag) {
			System.out.print("구구단을 원하는 숫자를 입력해주세요 (0을 누르면 종료) ==>  ");
			inputNum = scan.nextInt();
			
			if (inputNum != 0) {
				System.out.println(inputNum + " 단");
				for(int i = 1 ; i <= 9 ; i++) {
					if(i % 5 == 1) { 
						System.out.println();
					}
					resultNum = inputNum * i;
					resultStr = String.format("%d * %d = %d\t", inputNum, i, resultNum);
					System.out.print(resultStr);
				}
				System.out.println();
				System.out.println();
			} else {
				flag = false;
			}
		}
		System.out.println("★☆★종료했습니다★☆★");
		
	}
}