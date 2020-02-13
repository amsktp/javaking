//4일차
/**
 * 음수 양수 구분 프로그램
 * 사용자가 입력한 숫자에 대해 판단해준다
 * 4번 시도할 수 있다.
 * ==========================================
 * 사용자가 입력한 숫자 ?
 * 음수
 * or
 * 양수 
 **/
import java.util.Scanner;
public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int inputNum = 0;
		
		for (int i = 1 ; i <= 4 ; i ++) {
			System.out.println("값을 입력해주세요");
			
			inputNum = scan.nextInt();
			System.out.println("\t\t\t   남은횟수\t/최대횟수");
//			System.out.println("사용자가 입력한 숫자 == " + inputNum + "\t" + i + "\t/4");
			System.out.printf("사용자가 입력한 숫자 == %d\t%8d/%d\n", inputNum, i , 4);
			
			if(inputNum < 0) {
				System.out.println("음수");
			} else if(inputNum > 0) {
				System.out.println("양수");
			} else if(inputNum ==0) {
				System.out.println("0이군요");
			} else {
				System.out.println("잘못 입력하셨습니다");
			}	
		}
		System.out.println("수고하셨습니다");
	}
}