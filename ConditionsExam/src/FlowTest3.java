//3일차
/**
 * 홀짝 판별 프로그램
 * if else문만 사용 
 * */
import java.util.Scanner;
public class FlowTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNum = 0;
		inputNum = 4;
		
//		System.out.println("숫자를 입력해 주세요 ==>  ");
//		Scanner scan = new Scanner(System.in);
//		inputNum = scan.nextInt();
		
		System.out.println("입력하신 값은 " + inputNum);
		
		if (inputNum % 2 == 0) {
			System.out.println("짝입니다");
		}
		
		else {
			System.out.println("홀입니다");
		}
			
	}

}
