//9일차 17.02.20 (목)
import java.util.Scanner;

public class Calc {

	static double num1 = 0.0;
	static double num2 = 0.0;
	static int num3 = 0;
	static int num4 = 0;
	
	static double sum = 0.0;
	static int sum1 = 0;
	static double division = 0.0;	
	
	
	void input() {
		Scanner scan = new Scanner(System.in);
		num3 = 0;
		num4 = 0;
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		if ((int)num1 == num1) {
			num3 = (int)num1;
		} 
		if ((int)num2 == num2) {
			num4 = (int)num2;
		} 
		
		
	}
	
	int add(int a, int b) {
		int result = 0;
		result = a + b;
		System.out.println("i : i");
		return result;
	}
	
	double add(double a, int b) {
		double result = 0;
		result = a + b;
		System.out.println("d : i");
		return result;
	}
	double add(int a, double b) {
		double result = 0;
		result = a + b;
		System.out.println("i : d");
		return result;
	}
	double add(double a, double b) {
		double result = 0;
		result = a + b;
		System.out.println("d : d");
		return result;
	}	
	
	void add() {
		System.out.println("더할 숫자 두개를 입력해 주세요");
		input();
		
		if(num3 == 0 && num4 ==0) {
			sum = add(num1, num2);	
			System.out.println(num1 + " + " + num2 + " = " + sum);
		} else if (num3 != 0 && num4 ==0) {
			sum = add(num3, num2);
			System.out.println(num3 + " + " + num2 + " = " + sum);
		} else if (num3 == 0 && num4 !=0) {
			sum = add(num1, num4);
			System.out.println(num1 + " + " + num4 + " = " + sum);
		} else if (num3 != 0 && num4 !=0) {
			sum1 = add(num3, num4);
			System.out.println(num3 + " + " + num4 + " = " + sum1);
		}
		
	}
	
	double division(int a, int b) {
		double result = 0;
		result = (double)a / b;
		System.out.println("i : i");
		return result;
	}
	double division(int a, double b) {
		double result = 0;
		result = a / b;
		System.out.println("i : d");
		return result;
	}
	double division(double a, int b) {
		double result = 0;
		result = a / b;
		System.out.println("d : i");
		return result;
	}
	double division(double a, double b) {
		double result = 0;
		result = a / b;
		System.out.println("d : d");
		return result;
	}
	
	void division() {
		System.out.println("나눌 숫자 두개를 입력해 주세요");
		
		input();
		
		
		if(num3 == 0 && num4 ==0) {
			division = division(num1, num2);	
			System.out.println(num1 + " / " + num2 + " = " + division);
		} else if (num3 != 0 && num4 ==0) {
			division = division(num3, num2);
			System.out.println(num3 + " / " + num2 + " = " + division);
		} else if (num3 == 0 && num4 !=0) {
			division = division(num1, num4);
			System.out.println(num1 + " / " + num4 + " = " + division);
		} else if (num3 != 0 && num4 !=0) {
			division = division(num3, num4);
			System.out.println(num3 + " / " + num4 + " = " + division);
		}	
	}
	
	
	void add(int[] numArr) {
		
		int sum5 = 0;
		for (int i = 0; i < numArr.length; i++) {
			sum5 = sum5 + numArr[i];
		}
		System.out.println("void add(int[] numArr) 결과");
		System.out.println(sum5);
		
	}
	
	
	
	
}
