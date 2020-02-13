//4일차
//for문
public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//구구단
		int sum = 0;
				
		for (int j = 1 ; j <= 9 ; j++) {
			for (int i = 2 ; i <= 9 ; i++) {
				sum = i * j;
				System.out.printf(i + " * " + j + " = " + sum + "\t");
			}
			System.out.println();
		}
	}
}
