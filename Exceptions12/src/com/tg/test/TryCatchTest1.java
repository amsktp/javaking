//13일차 20 02 26

//사용자의 입력을 받아서
//주사위 숫자를 맞추는 프로그램을 만드시오
//예외 발생시 잘못 입력했습니다.
//프로그램이 종료됩니다.
package com.tg.test;

import java.util.Scanner;

public class TryCatchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int dice = 0;
		int userNum = 0;

		try {
			dice = (int)(Math.random() * 6) + 1;
			System.out.println(dice);
			System.out.println("숫자를 입력하세요 => ");
			userNum = scan.nextInt();
			
			if (userNum == dice) {
				System.out.println("맞았습니다");
			} else {
				System.out.println("틀렸습니다");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("잘못 입력했습니다");

		} finally {
			System.out.println("프로그램이 종료됩니다.");
		}

	}

}
