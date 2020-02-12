//3일차
/**
 * 성적 처리 프로그램
 * 90점 이상이면 A학점
 * 80점 이상이면 B학점
 * 70점 이상이면 C학점
 * 그 외에는 F학점
 * 
 * if문 사용
 * 사용자 입력을 점수로 받는다.
 * ===============
 * 당신의 점수는 70
 * 당신의 학점은 C입니다.
 * */
import java.util.Scanner;
public class FlowTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int scoreNum = 0;
		Scanner scan = new Scanner(System.in);
		scoreNum = scan.nextInt();
		
		System.out.println("당신의 점수는 " + scoreNum);
		
		if (scoreNum >= 90) {
			System.out.println("학점은 A입니다.");
		}
		else if (scoreNum >= 80) {
			System.out.println("학점은 B입니다.");
		}
		else if (scoreNum >= 70) {
			System.out.println("학점은 C입니다.");
		}
		else {			
			System.out.println("학점은 F입니다.");
		}
			
	}

}
