import java.util.ArrayList;
import java.util.List;

public class ExArrayList6 {

	public static void main(String args[]) {

		List strList = new ArrayList();

		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");
		strList.add("다섯번째");

		
//		System.out.println("처음 list 크기");
//		System.out.println(strList.size());

		int size = strList.size();
		
		for (int i = 0; i < strList.size()+i; i++) {
			viewList(strList);
			strList.remove(0);
		}

	}

	public static void viewList(List strList) {
		String str = "";
		for (int i = 0; i < strList.size(); i++) {
			str = (String) strList.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
	}

}
