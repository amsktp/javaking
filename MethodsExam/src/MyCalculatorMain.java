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
public class MyCalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCalculator calc = new MyCalculator();
		
		int sumResult = 0;
		int timesResult = 0;
		int minusResult = 0;		
		double divideResult = 0;
		
		sumResult = calc.add(3, 5);
		System.out.println("3" + " + " +  "5 = " + sumResult);
		System.out.println();
		
		minusResult = calc.subtract(sumResult, 7);
		System.out.println(sumResult + " - 7 = " + minusResult);
		System.out.println();
		
		timesResult = calc.times(minusResult, -2);
		System.out.println(minusResult + " * -2 = " + timesResult);
		System.out.println(	);
		
		divideResult = calc.divide(timesResult, 0.6);
		System.out.println(timesResult + " / 0.6 = " + divideResult);
	
	}
}
