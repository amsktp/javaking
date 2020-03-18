import java.util.ArrayList;

public class ExArrayList10 {

	public static void main(String args[]) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		inputNumList(numberList);
		resultNum(numberList);
	}
	
	public static void inputNumList(ArrayList<Integer> numberList) {
		for (int i = 0; i < 4; i++) {
			numberList.add(i+1);
		}
	}
	
	public static void resultNum(ArrayList<Integer> numberList) {
		int result = 0;
		for (int i = 0; i < numberList.size(); i++) {
			result = result + numberList.get(i);
		}
		System.out.println(result);
	}
}