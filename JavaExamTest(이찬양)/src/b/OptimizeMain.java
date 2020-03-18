package b;

// 코드 최적화하기
public class OptimizeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optimize o = new Optimize();

		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10);
		}

		o.search(numArr);
		o.search(numArr);

	}

}
