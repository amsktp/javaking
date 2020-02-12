//2일차
package operation2;

import java.util.Scanner;

public class OperatorEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사용자가 입력할 변수
		int userInput = 0;
		// 임시 결과
		int tempNum = 0;
		//사용자가 입력한 값에 대한 홀짝 결과
		String result = "";
		String name = "";
		//키보드 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("홀짝 판별 프로그램 시작\n");
		System.out.println("성함 알려줘");
		
		name = scan.nextLine();
		//판별을 위한 과정
		System.out.println("숫자 넣어줘");
		//userInput = 15;
		userInput = scan.nextInt();
		
		tempNum = userInput%2;
		
		//사용자가 입력한 값에 대한 홀짝 판별 결과
		//홀짝 판별 결과 false 이면 짝, true 이면 홀
		result = (tempNum == 0) ? "짝" : "홀";
		
		result = ( userInput%2 == 0) ? "짝수군요" : "저런 홀수군요";
		
		System.out.println("당신이 입력하신 값은 => " + userInput + " ");
		System.out.println(result);
		
		}
}

