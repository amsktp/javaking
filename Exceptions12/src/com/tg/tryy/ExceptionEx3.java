//13일차 20 02 26 수
package com.tg.tryy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = 0;

		try {
			System.out.println("숫자를 입력");
			n = scan.nextInt();
			System.out.println(n);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("0");
			System.out.println(e);
			e.printStackTrace();
			System.out.println("예외 메시지 : " + e.getMessage());
		}
		scan.close();
	}

}
