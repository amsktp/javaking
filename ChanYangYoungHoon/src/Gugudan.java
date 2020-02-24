//11일차 20 02 24
//스마트구구단

//시작값 ~ 끝 값
//2, 4를 입력하면 2~4단이 출력된다
//4,2는 출력안됨
import java.util.Scanner;
public class Gugudan {
	//이찬양
	String name = "";
	int dan1 = 0;
	int dan2 = 0;
	boolean flag = false;

	Gugudan() {

	}

	Gugudan(String name) {
		this.name = name;
	}

	void info() {
		System.out.println("안녕하세요~ " + name + " 입니다!!" );
	}

	void input() {
		Scanner scan = new Scanner(System.in);

		System.out.println("첫 단을 입력해주세요~~ =>>");
		dan1 = scan.nextInt();
		System.out.println("끝 단을 입력해주세요~~ =>>");
		dan2 = scan.nextInt();

	}

	void calc () {

		flag = true;
		while (flag) { 
			
			if(dan2 < dan1) {
				System.out.println("다시 입력해주세요~~");
				input();
			
			} else {
				flag = false;
			}
		}

		System.out.println(dan1 + " ~ " + dan2 + "의 구구단 결과입니다");

		for(int i = dan1; i <= dan2; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + j*i + "\t");
			}
			System.out.println();
		}
	}

}
