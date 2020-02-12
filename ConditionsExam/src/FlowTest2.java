//3일차
/**
 * 1인지 0인지 판단하는 프로그램
 * */
import java.util.Scanner;
public class FlowTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNum = 0;
		inputNum = 1;
				
//		Scanner scan = new Scanner(System.in);
//		System.out.println("값을 입력해주세요 => ");
//		inputNum = scan.nextInt();
		
		System.out.println("입력하신 값은 " + inputNum);
		
		if (inputNum != 0) {
			System.out.println("전원을 켰습니다");
		} 
		else {
			System.out.println("전원을 종료합니다");
		}	
		
		
	}

}
