//13일차 20 02 26 수
package com.tg.tryy;

public class ExceptionEx2 {

	
	
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(5);

		}
		System.out.println(6);

	}

}
