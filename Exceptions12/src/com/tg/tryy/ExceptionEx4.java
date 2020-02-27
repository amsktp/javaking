//13일차 20 02 26 수
package com.tg.tryy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx4 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);

		Scanner scan = new Scanner(System.in);
		try {
			int n = scan.nextInt();
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);

		} catch (ArithmeticException ae) {

			System.out.println("ArithmeticException");

		} catch (InputMismatchException e) {

			System.out.println("InputMismatchException");

		} catch (Exception e) {

			System.out.println("Exception");
		}
		System.out.println(6);

	}

}
