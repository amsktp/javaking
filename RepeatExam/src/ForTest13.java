//5일차
/**
 * while 문 구구단 1번
 **/
public class ForTest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dan = 0;
		int num = 0;
		dan = 2;
		num = 1;
		int result = 0;
		
		while (dan <= 9) {
			while (num <= 9) {
				result = dan * num;
				System.out.print(dan + " * " + num + " = " + result + "\t");
				num++;
			}
			dan++;		
			num = 1;
			System.out.println();
			
		}
	}
}