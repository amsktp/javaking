package a;

import java.util.Scanner;

// 스마트 구구단
public class GugudanMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		GugudanVo g = new GugudanVo();
		String endGugudan = "";
		int result = 0;
		boolean flag = false;

		flag = true;
		g.setCount(1);

		while (flag) {
			System.out.print(g.getCount() + ". 보고싶은 단을 입력하세요.(숫자만입력해주세요): ");
			g.setDan(scan.nextInt());
			System.out.println(g.getDan() + "단");
			for (int i = 1; i <= 9; i++) {
				result = g.getDan() * i;
				System.out.print(g.getDan() + " * " + i + " = " + result + " | ");
			}

			g.setCount(g.getCount() + 1);
			System.out.println();
			System.out.println();
			System.out.print("계속 진행을 원하시면 y, 종료를 원하시면 n을 눌러주세요        ");
			endGugudan = scan.next();

			System.out.println();

			if (endGugudan.equals("n")) {
				flag = false;
			}
		}
		System.out.println("이용해주셔서 감사합니다.");

	}
}
