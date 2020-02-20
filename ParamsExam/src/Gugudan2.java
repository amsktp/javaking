//9일차 17.02.20 (목)
/**
 * 단을 입력받을 수 있다.
 * 입력된 단을 출력한다
 */
import java.util.Scanner;
public class Gugudan2 {

	int dan = 0;
	String logo = "";

	
	Gugudan2 (String logo) {
		this.logo = logo;
//		System.out.println("안녕하세요! " + logo + "입니다!");
	}

	void inputDan() {
		System.out.print("단을 입력해주세요 = >");
		Scanner scan = new Scanner(System.in);
		dan = scan.nextInt();
	}

	//구구단 연산
	int[] gugudan() {
		int[] gugudan = new int[9]; 
		int cnt = 0;
		for (int i = 1; i <= 9; i++) {
			gugudan[cnt] = dan * i;
			cnt++;
		}
		return gugudan;
	}

	//구구단 출력
	void gugudanOut(int[] gugudanResult) {
		int[] gugudan = new int[9];
		gugudan = gugudanResult;
		int cnt = 0;
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + gugudan[cnt] + "\t");
			cnt++;
		}
	}	
	String powerInput() {
		String power = "";
		System.out.print("끝내고 싶다면 y 아니라면 아무키나 누르고 엔터  =>");
		Scanner scan = new Scanner(System.in);
		power = scan.next();
		return power;
		
	}
	
}