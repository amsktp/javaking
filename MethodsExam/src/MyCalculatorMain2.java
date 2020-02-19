//8일차 17.02.19 (수)
/**
 * 더하기, 빼기, 곱하기, 나누기
 * 기능을 구하십시오
 * 나누었을 때 소수점은 전부 표현한다.
 * =================================
 * 3,5
 * 더하기
 * 7
 * 빼기
 * -2
 * 곱하기
 * 0.6
 * 나누기
 */
public class MyCalculatorMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculator2 calc = new MyCalculator2();
		
		calc.add(3, 5);
			
		calc.subtract(8, 7);
			
		calc.times(1, -2);
			
		calc.divide(-2, 0.6);
			
		calc.namuge(5, 3);
	
	}
}
