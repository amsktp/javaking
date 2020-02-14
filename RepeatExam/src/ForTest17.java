//5일차
/**
 * 1~100 까지 중 홀수만 10번 더해지면 종료하게끔 되는 프로그램
 * =====================================
 * 
 * 
 **/

import java.util.Scanner;
public class ForTest17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int count = 1;

		for(int i = 1; i <= 100; i++) {
			
			if (i%2==1) {
				System.out.print(count + " 번째 누적값 : " + sum +  " + " + i + " = ");
				sum = sum + i;		
				System.out.println(sum);
				count ++;
				if(count > 10) {
					break;
				}
			}
		}		
	}
}