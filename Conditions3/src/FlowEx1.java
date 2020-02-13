//3일차

//Scanner(사용자 입력)을 사용하기 위해 필요함
import java.util.Scanner;

public class FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if문
//		expression(표현식)
//		if(조건식) {
//			조건식이 true일 때 수행할 문장들을 적는다
//		}
		Scanner visit = new Scanner(System.in);
		
		System.out.println("몇번 방문하셨나요??");
		
		int visitCount = 0;
		visitCount = visit.nextInt();
		
		//블럭 block	
		if(visitCount < 1 && visitCount >=0) {
			System.out.println("처음 오셨군요! 방문해 주셔서 감사합니다.");
		}
		
		//첫 if문이 참이 아닐경우 두번째 else if문으로 간다
		else if(visitCount >= 1){
			System.out.println("여러번 방문하셨군요.");
		}
		
		//두번째 if문까지 참이 아닐경우 다른 모든경우가 else 문으로 간다
		else {
			System.out.println("잘못된 수를 입력하셨습니다.");
		}
		
		//무조건 수행되는 부분
		System.out.println("감사합니다");
		
	}

}
