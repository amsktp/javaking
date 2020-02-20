////9일차 17.02.20 (목)
///**
// * 단을 입력받을 수 있다.
// * 입력된 단을 출력한다
// */
//import java.util.Scanner;
//public class Gugudan {
//
//	int dan = 0;
//	String logo = "";
//
//	
//	Gugudan (String logo) {
//		this.logo = logo;
////		System.out.println("안녕하세요! " + logo + "입니다!");
//	}
//
//	void inputDan() {
//		System.out.print("단을 입력해주세요 = >");
//		Scanner scan = new Scanner(System.in);
//		dan = scan.nextInt();
//	}
//
//	//구구단 연산
//	int[] gugudan() {
//		int[] gugudan = new int[9]; 
//		int cnt = 0;
//		for (int i = 1; i <= 9; i++) {
//			gugudan[cnt] = dan * i;
//			cnt++;
//		}
//		return gugudan;
//	}
//
//	//구구단 출력
//	void gugudanOut(int[] gugudanResult) {
//		int[] gugudan = new int[9];
//		gugudan = gugudanResult;
//		int cnt = 0;
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan + " * " + i + " = " + gugudan[cnt] + "\t");
//			cnt++;
//		}
//	}
//}


//정경님 답
import java.util.Scanner;
//구구단이 존재한다
//생성자를 통해 단을 입력한다
//입력된 단을 출력한다
//입력된 단을 출력한다
public class Gugudan {

	int dan = 0;
	String title = "";
		
	Gugudan(String title){           //생성자
		this.title = title;	
	}
	
	void input(){             //메서드
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해 주세요");
		dan = sc.nextInt();	
	}
	
	void output(){
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}		
	}
	
}