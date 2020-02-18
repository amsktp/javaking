//6일차 17.02.17 (월)
/**
 * 최소값을 구하시오
 * ======================
 * 
 */
public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] scoreArr = {79, 88, 91, 33, 100, 55, 95};

//		int max =  Integer.MIN_VALUE; //int에서 표현할수 있는 가장 낮은값 = 대충 -21억
//		int min = Integer.MAX_VALUE; //int에서 표현할수 있는 가장 높은값 = 대충 +21억
		int max = scoreArr[0];
		int min = scoreArr[0];
		
		int maxPos = 0;
		int minPos = 0;
		int temp = 0;
		
		for (int i = 0; i < 7; i++) {
			if (scoreArr[i] > max) {
				max = scoreArr[i];
				maxPos = i+1;
			}
			if (scoreArr[i] < min) {
				min = scoreArr[i];
				minPos = i+1;
			}
		}

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		System.out.println("최대값의 위치는 " + maxPos);
		System.out.println("최소값의 위치는 " + minPos);
		System.out.println();
		
		
		//선택정렬
		for (int i = 0; i < scoreArr.length; i++ ) {
			for (int j = i+1; j < scoreArr.length; j++) {
				if (scoreArr[i] < scoreArr[j]) {
					temp = scoreArr[i];
					scoreArr[i] = scoreArr[j];
					scoreArr[j] = temp;
				}
			}	
			System.out.println(scoreArr[i]);
		}
	
	}
}