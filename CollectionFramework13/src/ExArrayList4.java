import java.util.ArrayList;
import java.util.List;

public class ExArrayList4 {

	public static void main(String args[]) {

		String[] strArr = new String[4];
		String[] strArr2 = new String[3];

		strArr[0] = "첫번째";
		strArr[1] = "두번째";
		strArr[2] = "세번째";
		strArr[3] = "네번째";

		viewArr(strArr);

		System.out.println("strArr 0번째를 지운다");

		for (int i = 0; i < strArr2.length; i++) {
			strArr2[i] = strArr[i + 1];
		}
		viewArr(strArr2);

	}

	public static void viewArr(String[] strArr) {
		String str = "";
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(i + " : " + strArr[i]);
		}
		System.out.println();
	}

}
