//9일차 17.02.20 (목)
public class Car2 {

	
	//생성
	String color = "";
	//변속기 종료
	String gearType = "";
	//문의 개수
	int door = 0;
	
	
	
	Car2 (int num ,String str, String col) {
		color = col;
		gearType = str;
		door = num;
	}

	Car2 () {
		color = "노란색";
		gearType = "수동";
		door = 4;
	}
	
	void carInfo() {
		System.out.println("색상 : " + color + "\t변속 종류 : " + gearType + "\t문의 개수 : " + door);
	}
	
	
	
	
}
