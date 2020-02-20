//9일차 17.02.20 (목)
public class Home {

	
	//집 위치
	String locate = "";
	//집 평 수
	int sqm = 0;
	//화장실 갯수
	int bathroom = 0;
	
	Home (String l, int s, int b) {
		locate = l;
		sqm = s;
		bathroom = b;
	}
	
	void homeInfo() {
		System.out.println("위치 : " + locate + "\t평 수 : " + sqm + "\t화장실 수 : " + bathroom);
	}
		
}
