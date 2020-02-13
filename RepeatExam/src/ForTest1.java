//4일차
/**
 * 1부터 10까지 더하는 프로그램을 작성하시오 (for문  사용)
 * =======================
 * 1부터 10까지의 합 : 55
 */
public class ForTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		누적의 방법
//		1~n까지의 합
//		int sum = 0;
//		for (int i=1 ; i<=n ; i++)  {
//		sum = sum + 1
//		}
		
		
		int sum = 0;
		for ( int i=1 ; i<=10 ; i++) {
			sum += i;
			System.out.println(i + "번째:\t" + (sum-i) + " + " + i + "\t" + " = " + sum);
		}
			System.out.println("1부터 10까지의 합: " + sum);
	}
}