import java.util.ArrayList;
import java.util.List;

public class ExArrayList5 {

	public static void main(String args[]) {

		List strList = new ArrayList();
		ArrayList backupList = new ArrayList();
		
		
		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");

		System.out.println("strList");
		System.out.println();
		viewList(strList);
		
		for (int i = 0; i < strList.size(); i++) {
			backupList.add(strList.get(i));
		}
		
		System.out.println("backupList");
		System.out.println();
		viewList(backupList);

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
