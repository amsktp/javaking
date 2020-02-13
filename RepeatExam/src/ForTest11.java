//4일차
/**
 * 구구단 새로로
 **/
public class ForTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//구구단
		int sum = 0;
		String str = "";
		for (int j = 1 ; j <= 9 ; j++) {
			for (int i = 2 ; i <= 9 ; i++) {
				sum = i * j;
				str = i + " * " + j + " = " + sum + "\t";
				System.out.printf(str);
			}
			System.out.println();
		}
	}
}