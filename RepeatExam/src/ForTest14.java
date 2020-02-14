//5일차
/**
 * while 문 구구단 2번
 **/
public class ForTest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dan = 0;
		int num = 0;
		dan = 1;
		num = 2;
		int result = 0;
		String str = "";
		
		while (dan <= 9) {
			while (num <= 9) {
				result = dan * num;
				str = String.format("%d * %d = %-2d\t", num, dan, result);
				System.out.print(str);
				num++;
			}
			dan++;		
			num = 2;
			System.out.println();
			
		}
	}
}