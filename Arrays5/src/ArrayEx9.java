//7일차 17.02.18 (화)
//배열
//관련 있는것들의 묶음
public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ex8의 올바른 해답법
		
		int[] numberArr = new int[5];
		int[] newNumArr = new int[5];
		
		for (int i = 0; i < numberArr.length; i++) {
			numberArr[i] = i+1;
		}
		
		System.out.println("numberArr 출력 ");
		for (int i = 0; i < numberArr.length; i++) {
			System.out.println(numberArr[i]);
		}
		System.out.println("newNumArr 출력 ");
		for (int i = 0; i < newNumArr.length; i++) {
			System.out.println(newNumArr[i]);
		}
		
		
		//따라서 같은 주소값을 가졌기 때문에 두 배열이 동시에 바뀌어버림
		newNumArr[0] = numberArr[0];
		newNumArr[1] = numberArr[1];
		newNumArr[2] = numberArr[2];
		newNumArr[3] = numberArr[3];
		newNumArr[4] = numberArr[4];
	
		System.out.println("numberArr 출력 ");
		for (int i = 0; i < numberArr.length; i++) {
			System.out.println(numberArr[i]);
		}
		System.out.println("newNumArr 출력 ");
		for (int i = 0; i < newNumArr.length; i++) {
			System.out.println(newNumArr[i]);
		}
		
		
		newNumArr[0] = 55;
		
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