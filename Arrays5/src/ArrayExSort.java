//6일차 17.02.17 (월)
//배열
public class ArrayExSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//최대값 찾기

		int[] scoreArr = {79, 88, 91, 33, 100, 55, 95};

		int num = 0; 
		int temp = 0;

		for (int i = 0; i < 7; i++) {
			for (int j = i+1; j<7; j++) {
				if(scoreArr[i] < scoreArr[j]) {
					temp = scoreArr[i];
					scoreArr[i] = scoreArr[j];
					scoreArr[j] = temp;
				}
			}
		}

		for (int i = 0; i < 7; i++) {
			System.out.println(scoreArr[i]);
		}



	}

}
