//3일차
//다중 If 문
import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
				
		String grade = "";
		int scoreNum = 0;
		
		System.out.println("점수를 입력하세요 : ");
		scoreNum = scan.nextInt();
		
		if (scoreNum >= 90) {
			grade = "A";
			if(scoreNum >= 98) {
				grade += "+";
			}
		}
		else if (scoreNum >= 80) {
			grade = "B";
			if(scoreNum >= 88) {
				grade += "+";
			}
			else if(scoreNum < 84) {
				grade += "-";
			}
		}
		
		//위와 동일한 코드
//		if (scoreNum >= 98) {
//			grade = "A+";
//		}
//		else if (scoreNum >= 90) {
//			grade = "A";
//		}
//		else if (scoreNum >= 88) {
//			grade = "B+";
//		}
//		else if (scoreNum >= 84) {
//			grade = "B";
//		}
//		else if (scoreNum >= 80) {
//			grade = "B-";
//		}
		
		else if (scoreNum >= 70) {
			grade = "C";
		}
		else {
			grade = "F";
		}
		
		System.out.println("당신의 점수는 " + scoreNum);
		System.out.println("학점은 " + grade);
		
	}

}
