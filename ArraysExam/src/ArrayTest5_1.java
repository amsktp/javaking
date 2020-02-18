//6일차 17.02.17 (월)
/**
 * 사용자의 숫자를 입력받는다ㅓ
 * 순서는 국어, 영어, 수학이다.
 * 국영수 중에 점수가 제일 높은 순으로 출력해라
 * ======================
 * 점수 입력 값: 100, 81, 93
 * 점수 정렬한 값 : 100, 93, 81
 */
import java.util.Scanner;
public class ArrayTest5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] scoreArr = new int[5];
		String[] objArr = {"국어", "영어", "수학", "사회", "과학"};
		int temp = 0;
		int cnt = 0;
		String tempStr = "";

		//입력 받는 부분
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(objArr[i] + "의 점수를 입력해주세요 ==>   ");
			scoreArr[i] = scan.nextInt();			
		}
		
		for (int i = 0; i < scoreArr.length; i++) {
			for (int j = 0; j < scoreArr.length-1; j++) {
				if (scoreArr[j] < scoreArr[j+1]) {
					temp = scoreArr[j];
					scoreArr[j] = scoreArr[j+1];
					scoreArr[j+1] = temp;	
				
					//문자열도 같은 순서로 정렬
					tempStr = objArr[i];
					objArr[i] = objArr[j];
					objArr[j] = tempStr;
					
				}
				cnt++;
			}
		}
		
		
		 for (int i = 0; i < scoreArr.length; i++) {
			 System.out.print(objArr[i] + " : " + scoreArr[i] + "  " );
		}
			System.out.println("정렬 돌아간 횟수 : " + cnt);
			//이런 경우는 값이 3개이상이면 이상한 값이 나올듯
	}
}