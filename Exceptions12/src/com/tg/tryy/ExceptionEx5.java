//13일차 20 02 26 수
package com.tg.tryy;

public class ExceptionEx5 {

	public static void main(String[] args) {

		
		
		
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
//			System.out.println(0 / 0);
			System.out.println(4);

		} catch (ArithmeticException ae) {
			System.out.println(5);
			
//		} catch (Exception e) {
//			System.out.println("Exception");
	
		} finally {
			System.out.println(6);
		}
		System.out.println(7);

	}
}