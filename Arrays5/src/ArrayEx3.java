//6일차 17.02.17 (월)
//배열
public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//최대값 찾기
		
		int[] scoreArr = {79, 88, 91, 33, 100, 55, 95};
		
		int max = 0; 
		
		for (int i = 0; i < 7; i++) {
			if (scoreArr[i] > max) {
				max = scoreArr[i];
			}
			
		}
		
		System.out.println("최대값은 : " + max);
		
		
	}

}
