//7일차 17.02.18 (화)
/**
 * 
 * @author TJ
 * 구구단 만들기
 * 1차원 배열
 * 결과만 1차원 배열에 넣는다
 * 그걸 출력한다.
 * 
 */
public class GugudanVer1Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] mulNumArr = new int[0];

		//		2 + "*" + = (2 * i)
		//		2 * 1 = mulNumArr[0] 3 * 1 = mulNumArr[1]  ,,, 	9 * 1 = mulNumArr[8]
		//		2 * 2 = 4 3 * 2 = 6  ,,, 	9 * 2 = 18
		//		2 * 3 = 6 3 * 3 = 9  ,,, 	9 * 3 = 27
		//		
		//		
		//		2 * 9 = 18 3 * 9 = 27  ,,, 	9 * 9 = mulNumArr[??]

		//결과 값을 넣을 배열
		
		int[] mulNumArr = new int[81];
		int cnt = 0;
		 for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				mulNumArr[cnt] = i * j;
				cnt++;
			}
		}
		 cnt = 0;
		 for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + mulNumArr[cnt] + "\t");
				cnt++;
			}
			System.out.println();
		}
		 
	}
}







