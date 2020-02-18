//6일차 17.02.17 (월)
/**
 * 최소값을 구하시오
 * ======================
 * 
 */
public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 10;
		int youNum = 0;
		int tempNum = 0;
		
//		치환
//		youNum = myNum;
//		myNum = youNum;
		
		tempNum = youNum;
		youNum = myNum;
		myNum = tempNum;
		
		System.out.println("myNum : " + myNum + "\t" + "youNum : " + youNum);
	
	}
}