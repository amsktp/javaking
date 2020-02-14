//5일차
/**
 * while 문
 *=============================
 *4 - I can do it.
 *3 - I can do it.
 *2 - I can do it.
 *1 - I can do it.
 *0 - I can do it.
 **/
public class ForTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " - I can do it.";
		int count = 4;
		
		while (count >= 0) {
			System.out.println(count + str);
			count--;
		}
		
	}
}