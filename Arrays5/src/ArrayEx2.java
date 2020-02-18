//6일차 17.02.17 (월)
//배열
public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		명명 규칙
//		s, List 이런식으로 회사에서 사용하지만
//		우리는 변수명Arr 이런식으로 할거입니다.
		
//		배열의 초기화
		
		int[] numArr = null;
		numArr = new int[3];
		
		int[] scoreArr = {100, 90, 80};
		String[] nameArr = new String[3];
		
		nameArr[0] = "철수";
		nameArr[1] = "상점";
		nameArr[2] = "준표";
		
		System.out.println(numArr[0]);
		
		//총합을 구한다
		int sum = 0; //누적을 위한 변수 하나
		
		for (int i = 0; i < 3; i++) {
			sum = sum + scoreArr[i];
			System.out.println("현재 합계 " + sum);
		}

		System.out.println("총 합계는 " + sum + "입니다");
		
		
	}

}
