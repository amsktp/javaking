//8일차 17.02.19 (수)
public class MyCalculator2 {

	
	//더하기
	void add(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
	//빼기
	void subtract(int num1, int num2) {
		int minus = 0;
		minus = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + minus);	
	}
	//곱하기
	void times(int num1, int num2) {
		int times = 0;
		times = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + times);
	}
	//나누기
	void divide(int num1, int num2) {
		double divide = 0.0;
		divide = (double)num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + divide);		
	}
	void divide(int num1, double num2) {
		double divide = 0.0;
		divide = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + divide);		
	}
	void divide(double num1, int num2) {
		double divide = 0.0;
		divide = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + divide);		
	}
	void divide(double num1, double num2) {
		double divide = 0.0;
		divide = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + divide);		
	}
	//나머지
	void namuge(int num1, int num2) {
		int namuge = 0;
		namuge = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + namuge);	
	}
}
