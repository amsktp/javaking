//4일차
/**
 * 2의 배수 출력
 * 2의 배수의 합계를 구한다
 * 범위 0~10까지
 * 0 : 0
 * ==========================================
 * 2 : 2
 * 4 : 6
 * .
 * .
 * .
 * 10 : 30
 * 총합 : 30
 **/
public class ForTest5 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for (int i = 0; i <= 10 ; i = i + 2) {
			sum += i;
			System.out.println(i + " : " + sum);			
		}
		System.out.println("총합 : " + sum);
		
	}
}