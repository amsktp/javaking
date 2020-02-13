//4일차
/**
 * 1부터 10까지 더하는 프로그램을 짜시오(for문 사용)
 * 단 10은 변수명으로 하고 언제든지 바꾸면 결과가 바뀔수 있도록 하시오
 * ======================
 * 10까지의 합 : 55
 */
public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int max = 10;
		for (int i = 1 ; i <= max ; i ++) {
			sum += i;
		}
		System.out.println(max + " 까지의 합 : " + sum);
	}
}