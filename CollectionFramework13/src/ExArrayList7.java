import java.util.ArrayList;
import java.util.List;

public class ExArrayList7 {

	public static void main(String args[]) {

		List strList = new ArrayList();

		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");

		viewList(strList);

		System.out.println("지운 후");

		removeList(strList);

		viewList(strList);

	}

	public static void viewList(List strList) {
		String str = "";
		for (int i = 0; i < strList.size(); i++) {
			str = (String) strList.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
	}
	
	
	public static void removeList(List strList) {
		for (int i = strList.size() - 1; i >= 0; i--) {
			strList.remove(i);
			System.out.println(i + "번 실행됐다");
		}
	}

//	public static void removeList(List strList) {
//		int size = 0;
//		size = strList.size();
//		for (int i = size - 1; i >= 0; i--) {
//			strList.remove(i);
//		}
//	}

//	public static void removeList(List strList) {
//		int size = 0;
//		size = strList.size();
//		for (int i = 0; i < size; i++) {
//			strList.remove(strList.size() - 1);
//		}
//	}

}
