import java.util.ArrayList;

public class HumanInfo {

	public static void main(String args[]) {
		
		//Man 클래스 (사람이름, 키)
		
		//모든사람의 키 값을 출력하시오 (2사람)
		//2사람은 list에 담는다.
		
		int sumHeight = 0;
		
		ManVo man1 = new ManVo("이찬양", 190);
		ManVo man2 = new ManVo("고재민", 200);
		
		ArrayList<ManVo> personList = new ArrayList<ManVo>();
		
		personList.add(man1);
		personList.add(man2);
		
		System.out.println("사람수 : " + personList.size());
		
		for (int i = 0; i < personList.size(); i++) {
			sumHeight = sumHeight + personList.get(i).getHeight();
		}
		System.out.println("키 총합 : " + sumHeight);
		
	}
}