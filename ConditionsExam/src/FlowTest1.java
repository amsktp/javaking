//3일차
/**
 *60점 이상이면 합격입니다.
 *60점 미만이면 불합격 입니다라고 출력하는 프로그램
 * */
import java.util.Scanner;
public class FlowTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 0;
		
		score = 60;
		System.out.println("점수: " + score);		

//		Scanner input = new Scanner(System.in);
//		System.out.println("점수를 입력해주세요.");
//		score = input.nextInt();
		
		if(score >= 60) {
			System.out.println("합격입니다");
		}
		if(score < 60) {
			System.out.println("불합격입니다");
		}
		
	}

}
