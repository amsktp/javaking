//2일차
public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//형변환 type casting
		//byte < short < int < long
		//  1	  2	 	  4		 8
		
		
		int score = (byte)(float)85.9;
		byte b = (byte)score;
		
		System.out.println(score);
		System.out.println(b);
		
	}

}
