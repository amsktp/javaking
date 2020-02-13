//4일차
/**
 * 도형을 출력하라
 * ======================
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 **/
public class ForTest8 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		int repeat = 7;
		
		for (int i = 1 ; i<=repeat ; i++) {
			
			for (int j = repeat ; j>i ; j--) {
				System.out.print(" ");
			}

			for(int k = 0 ; k < (i*2)-1 ; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}