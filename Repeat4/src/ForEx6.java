import java.util.Scanner;

//5일차
/**
 * while 문 
 **/
public class ForEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		
		boolean flag = true;
		
		System.out.println("합계를 구할 숫자를 입력하세요(끝낸려면 0을 입력) ");
		
		while (flag) {
			System.out.print(">> ");
			num = scan.nextInt();
			
			if (num != 0) {
				sum = sum + num;
				
			} else {
				flag = false;
			}	
		}	
		
		System.out.println("합계 : " + sum);
	}
}