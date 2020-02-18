//7일차 17.02.18 (화)
//배열
//관련 있는것들의 묶음
public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numberArr = new int[5];
		int[] newNumArr = new int[5];
		
		for (int i = 0; i < numberArr.length; i++) {
			numberArr[i] = i+1;
		}
		
		//주소값까지 바뀌어버림
		newNumArr = numberArr;		
		
		System.out.println("numberArr 출력 ");
		for (int i = 0; i < numberArr.length; i++) {
			System.out.println(numberArr[i]);
		}
		System.out.println("newNumArr 출력 ");
		for (int i = 0; i < newNumArr.length; i++) {
			System.out.println(newNumArr[i]);
		}
		
		//따라서 같은 주소값을 가졌기 때문에 두 배열이 동시에 바뀌어버림
		numberArr[0] = 22;
		
		System.out.println("numberArr 출력 ");
		for (int i = 0; i < numberArr.length; i++) {
			System.out.println(numberArr[i]);
		}
		System.out.println("newNumArr 출력 ");
		for (int i = 0; i < newNumArr.length; i++) {
			System.out.println(newNumArr[i]);
		}		
	}
}