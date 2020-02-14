//5일차
/**
 * 윤년
 * while문 사용 금지
 * ======================================
 * 
 * 
 **/

import java.util.Scanner;
public class ForTest20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 0;
		int cnt = 0;
		for (int i = 1600; i<=2020; i++) {

			if(i%4==0) {
				if(i%100!=0) {
					year = i;
					System.out.println(year + "년은 윤년입니다.");
					cnt++;
				} else if (i%400==0) {
					year = i;
					System.out.println(year + "년은 윤년입니다.");
					cnt++;
				}
			}
		}
		System.out.println("윤년은 총 " + cnt + " 번 있었습니다");
	}
}
