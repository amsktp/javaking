//3일차
/**
 * 봄 여름 가을 겨울을 표시하시오
 *===================
 * 달을 입력해주세요 1
 * 1월은 겨울입니다
 * */
import java.util.Scanner;
public class FlowTest7 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int input = 0;
		System.out.print("달을 입력해주세요  ");
		input = scan.nextInt();
		
		switch (input) {
			case 12 :
			case 1 :
			case 2 :
				System.out.println(input + "월은 겨울입니다");
				break;
			case 3 :
			case 4 :
			case 5 :
				System.out.println(input + "월은 봄입니다");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println(input + "월은 여름입니다");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println(input + "월은 가을입니다");
				break;
			default :
				System.out.println("잘못 입력하셨습니다");
				break;
			
		}
	}

}
