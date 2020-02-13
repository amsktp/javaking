//3일차
//Switch case문
import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		표현식
//		switch (key) {
//		case value:
//			break;	
//		
//		default:
//			break;
//		}
		
		int hi = (int)(Math.random() * 10);
		int score = hi + 1 ;
		score = score * 100;
		
		System.out.println(hi);
		System.out.println(score);
		switch (score) {
			case 100:
				System.out.println("당신의 점수는 100이고, 상품은 자전거입니다.");
				break;
			case 200:
				System.out.println("당신의 점수는 200이고, 상품은 노트북입니다.");
				break;
			case 300:
				System.out.println("당신의 점수는 300이고, 상품은 자동차입니다.");
				break;
			default:
				System.out.println("죄송하지만 당신의 점수에 해당상품이 없습니다.");
				break;
		}
				
		
		
		
	}

}
