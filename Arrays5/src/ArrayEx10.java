//7일차 17.02.18 (화)
//배열
//관련 있는것들의 묶음
public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다차원 배열
		
		//2차원 배열
		
		int[][] scoreArr = new int[3][3];
				
		for (int i = 0; i < scoreArr.length; i++) {
			for (int n = 0; n < scoreArr.length; n++) {
				scoreArr[i][n] = (i+1) * 10;
			}
		}
		scoreArr[1][1] = 5;
		scoreArr[2][2] = 100;
		

		System.out.println(scoreArr[2][2]);
		
//		for (int i = 0; i < scoreArr.length; i++) {
//			for (int n = 0; n < scoreArr.length; n++) {
//				System.out.print(scoreArr[i][n] + ", ");				
//			}
//			System.out.println();
//		}
		
	}
}