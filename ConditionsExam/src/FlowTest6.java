//3일차
/**
 * 주사위 프로그램
 * */
import java.util.Scanner;
public class FlowTest6 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		int dice = 0;
		dice = (int)(Math.random()*6) + 1;
		
 		System.out.println(dice + " 칸");
 		
		switch(dice) {
			case 1:
				System.out.println("한칸 전진");
				break;
			case 2:
				System.out.println("두칸 전진");
				break;
			case 3:
				System.out.println("세칸 전진");
				break;
			case 4:
				System.out.println("네칸 전진");
				break;
			case 5:
				System.out.println("다섯칸 전진");
				break;
			case 6:
				System.out.println("여섯칸 전진");
				break;		
			default:
				System.out.println("에러났어요");
				break;
		}
		
		
	}

}
