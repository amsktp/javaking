//4일차
/**
 * 가위바위보
 * ==========================================
 **/
import java.util.Scanner;
public class ForTest4 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		int ai = 0;
		int win = 0;
		int defeat = 0;
		int draw = 0;
		
		String me = "";
		String com = "";
		System.out.println("★☆★☆★☆★☆가위바위보 게임입니다!★☆★☆★☆★☆");
		for(int i = 1 ; i < 4 ; i++) {
			System.out.println("\t\t\t\t\t        최대횟수/남은횟수");
			System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요>>>\t\t3 / " + i);
			input = scan.nextInt();
			
			
			ai = (int)(Math.random()*3) + 1;
			
			if (input == 1) me = "가위";
			else if (input == 2) me = "바위";
			else if (input == 3) me = "보";
			else System.out.println("잘못 입력하셨습니다");
			if (ai == 1) com = "가위";
			else if (ai == 2) com = "바위";
			else if (ai == 3) com = "보";
			
			if(me != "") {
				System.out.println("컴퓨터도 선택 했습니다.");
				System.out.println("당신은 \"" + me + "\" 상대는 \"" + com + "\" 을 선택했습니다");
			
				switch (input - ai) {
				case -1 : case 2 : 
					System.out.println("★☆저런~~ 졌네요★☆\n"); defeat += 1; 
					System.out.println("전적 => 승리 [ " + win + " ]\t패배 [ " + defeat + " ]\t무승부 [ " + draw + " ]");
					break;
					
				case -2 : case 1 : 
					System.out.println("★☆오~~ 이겼네요★☆\n"); win += 1; 
					System.out.println("전적 => 승리 [ " + win + " ]\t패배 [ " + defeat + " ]\t무승부 [ " + draw + " ]");
					break;
					
				case 0 : 
					System.out.println("★☆이런! 비겼네요★☆\n"); draw += 1;
					System.out.println("전적 => 승리 [ " + win + " ]\t패배 [ " + defeat + " ]\t무승부 [ " + draw + " ]");
					break;
					
				default : System.out.println("오류 입니다"); 
				}
				System.out.println("");
			}
		}
		if(win==defeat) {
			System.out.println("최종 결과 => 무승부 입니다");
		} else if(win > defeat) {
			System.out.println("최종 결과 => 당신의 승리입니다");
		} else if(win < defeat) {
			System.out.println("최종 결과 => 당신의 패배입니다");
		} else {
			System.out.println("오류 입니다");
		}
		
		
	}
}