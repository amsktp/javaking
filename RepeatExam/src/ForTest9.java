//4일차
/**
 * 도형을 출력하라
 * ======================
 * *****
 * ****
 * ***
 * **
 * *
 **/
public class ForTest9 {
	public static void main(String[] args) {

		
		int row = 5;
		
		
		// TODO Auto-generated method stub
//		for (int i = 1; i<=row; i++) {
//			for (int j = row; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();	
//		}

//		for (int i = 1; i<=row; i++) {
//			for (int j = 1; j <= row-i+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();	
//		}
		
		for(int i = row-1; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}