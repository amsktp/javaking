//13일차 20 02 26 수
package com.tg.tryy;

import net.mega.MyInputUtil;

public class ExceptionEx7 {
//사용자가 잘못입력하면 0으로 무조건 출력하게끔 해라
	public static void main(String[] args) {
		
		
//		try {
//			Exception e = new Exception("고의로 발생시킴");
//			throw e;			
//		} catch (Exception e) {
//			System.out.println("에러 메시지 : " + e.getMessage());
//			e.printStackTrace();
//		}

		
		try {
			IndexOutOfBoundsException a = new IndexOutOfBoundsException();
			throw a;
		} catch (Exception e) {

			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료됨");
	}
}
