//7일차 17.02.18 (화)
/**
 * 
 * 구구단 만들기
 * 2차원 배열
 * 결과만 2차원 배열에 넣는다
 * 그걸 출력한다.
 * 
 * 결과 값을 2차원 배열에 넣으면 됩니다.
 */
public class GugudanVer2Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//		2 * 1 = mulNumArr[0][0] 2 * 2 = 4
		//		3 * 1 = 3 3 * 2 = 6  ,,,,,,,   3 * 9 = 27		
		//		,
		//		,
		//		,
		//		9 * 1 = 9 9 * 2 = 18 ,,,,,,    9 * 9 = mulNumArr[?][?]

		int[][] mulNumArr = new int[9][9];

		int cnt1 = 0;
		int cnt2 = 0;

		for (int i = 2; i <= 9; i++) {
			cnt2=0;
			for (int j = 1; j <= 9; j++) {
				mulNumArr[cnt1][cnt2] = i*j; 
				cnt2++;
			}
			cnt1++;
		}
		cnt1 = 0;
		
		for (int i = 2; i <= 9; i++) {
			cnt2=0;
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + mulNumArr[cnt1][cnt2] + "\t");
				cnt2++;
			}
			System.out.println();
			cnt1++;
		}
	}

}
