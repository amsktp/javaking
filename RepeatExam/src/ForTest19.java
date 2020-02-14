//5일차
/**
 * 
 **/

import java.util.Scanner;
public class ForTest19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "n";
				
		if(str == "y" || str == "n") {
			System.out.println("ㅇㅇㅇ");
		} 
		
		else {
			System.out.println("asd");
		}
		
		//위에 프로그램을 else 말고 else if 로 짜기
		
		if(str == "y" || str == "n") {  //y 거나 n 일때
			System.out.println("ㅇㅇㅇ");
		} 
		
		else if(str != "y" && str != "n") { //y가 아니고 n이 아닐때
			System.out.println("asd");
		}
	}
}