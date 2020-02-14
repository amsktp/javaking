//5일차
/**
 * break
 **/
import java.util.Scanner;
public class ForEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String inputStr = "";	

		while (true) {
			System.out.println("안녕");
			System.out.println("입력 (y는 종료) >>>>>");
			inputStr = scan.nextLine();

			System.out.println("y" == "y");
			System.out.println("y" == inputStr);

			if(inputStr.equals("y")) {
				break;
			}

			System.out.println(inputStr);
		}
		System.out.println("잘가세요");
	}
}