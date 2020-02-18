//6일차 17.02.17 (월)
/**
 * 총합과 평균을 구하시오
 * 평균은 소수점 3째 자리에서
 * ======================
 * 점수 : 100, 81, 100, 100, 93, 17
 * 81.833333
 */
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreArr = {100, 81, 100, 100, 93, 17};
		int sum = 0;
		double num = 0;
		double aaa = 0;
		double ever = 0;

		//점수부분 출력문
		System.out.print("점수 : ");
		for (int i = 0; i < 6; i++) {
			if (i==5) {
				System.out.print(scoreArr[i]);	
			} else {
				System.out.print(scoreArr[i] + ", ");			
			}
			//총점 구하는 부분
			sum = sum + scoreArr[i];
		}
		System.out.println();
		System.out.println("총점 : 평균");

		
//		aaa = (int)((double)sum / 6 *100);
		
		//반올림으로 만드는 과정
//		if( aaa % 10 >= 5) {
//			num = aaa + 1 / 100.0;
//		} else if ( aaa % 10 < 5) {
//			num = aaa / 100.0;
//		}

//		올바른 방법
		
		num = (int)((double)sum / 6  * 100 + 0.5) / 100.d;
//		마지막에 100.d가 온 이유는 float으로 하면 형 차이 때문에 이상한 결과값이 나옴
		
		
//		위와 동일하지만 분리 설계 한것
//		ever = (double)sum / 6;
//		ever = ever * 100;
//		ever = ever + 0.5;
//		ever = (int)ever;
//		ever = ever / 100;
		
		
		
		
		System.out.println(sum + " : " + num);
	}
}