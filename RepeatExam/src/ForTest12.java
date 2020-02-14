//5일차
/**
 * For 문
 * while 문
 *누적 활용
 *1~100까지 더하는데
 *만약 100을 넘지않는 제일 큰 수를 출력한다
 *=============================
 * 1 - 1
 * 2 - 3
 * 3 - 6
 * 4 - 10
 * 5 - 15
 * .....
 * 13 - 91
 **/
public class ForTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for를 사용함
		int sum = 0;
		
		for(int i = 1; i < 100; i++) {
			sum = sum + i;
			
			if(sum <= 100) {
				System.out.println(i + " - " + sum);
			} else {
				break;
			}					
		}
		
		System.out.println("================");
		
		//while을 사용함
		int count = 0;
		sum = 0;
		
		while (count <= 100) {
			count++;
			sum = sum + count;
			
			if (sum <= 100) {
			System.out.println(count + " - " + sum);
			} else {
				break;
			}
		}
	}
}