//3일차
/**
 * 성적 처리 프로그램
 * 100 ~ 90점 이상이면 A학점
 * 90점 미만 80점 이상이면 B학점
 * 79점 이하 70점 이상이면 C학점
 * 그외는 F학점
 * if로 사용, 사용자 입력으로 점수를 받는다
 * ====================
 * 당신의 점수는 70 학점은
 * C입니다.
 * */
import java.util.Scanner;
public class FlowTest5 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		int scoreNum = 0;
		Scanner scan = new Scanner(System.in);
		scoreNum = scan.nextInt();
		
	
		
		System.out.println("당신의 점수는 " + scoreNum + " 학점은");
		if(scoreNum <= 100 && scoreNum >= 90) {
			System.out.println("A입니다.");
		}
		else if(scoreNum < 90 && scoreNum >= 80) {
			System.out.println("B입니다.");
		}
		else if(scoreNum <= 79 && scoreNum >= 70) {
			System.out.println("C입니다.");
		}
		else {
			System.out.println("F입니다.");
		}
		
	}

}
