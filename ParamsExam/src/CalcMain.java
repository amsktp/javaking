//9일차 17.02.20 (목)
public class CalcMain {

	public static void main(String[] args) {
		
		
		Calc c = new Calc();

		int[] numArr = new int[10];
		
		for (int n = 0; n < 4; n++) {
			numArr[n] = n+1;
		}
		
		numArr[7] = 60;
		
		c.add(numArr);
		
//		c.add();
//		c.division();
		
	}	
}
