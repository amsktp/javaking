//7일차 17.02.18 (화)
/**
 * numberArr에 임의의 5,4,3,2,1 값을 넣는다
 * 이 값을 섞어서 출력한다
 * 단 배열 변수를 하나 더 생성한다.
 * ======================
 * 초기값: 5, 4, 3, 2, 1
 * 셔플값: 2, 3, 5, 1, 4
 */
import java.util.Scanner;
public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numberArr = new int[5];
		int[] shuffleArr = new int[5];
		int tempNum = 0;
		int randomNum = 0;

		System.out.print("초기값: ");
		//배열에 값을 넣는것
		for (int i = 0; i < numberArr.length; i++) {
			numberArr[i] = numberArr.length-i;
			shuffleArr[i] = numberArr[i];
		}
		
//		//하나의 배열을 다른 배열에 넣기 ★☆★☆★☆★☆ 이렇게 하면 큰일남 numberArr 도 카피가되어버림
//		shuffleArr = numberArr; 

		//초기값 출력 부분
		for (int i = 0; i < shuffleArr.length; i++) {
			if ( i == shuffleArr.length-1) {
				System.out.print(numberArr[i]);	
			} else {
				System.out.print(numberArr[i] + ", ");
			}
		}

		//순서 섞는 부분
		for (int i = 0; i < numberArr.length; i++) {
			randomNum = (int)(Math.random() * numberArr.length);

			tempNum = shuffleArr[0];
			shuffleArr[0] = shuffleArr[randomNum];
			shuffleArr[randomNum] = tempNum;
		}

		//셔플값 출력 부분
		System.out.println();
		System.out.print("셔플값: ");
		for (int i = 0; i < shuffleArr.length; i++) {
			if ( i == shuffleArr.length-1) {
				System.out.print(shuffleArr[i]);	
			} else {
				System.out.print(shuffleArr[i] + ", ");
			}
		}
	}
}
