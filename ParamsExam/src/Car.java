//9일차 17.02.20 (목)
public class Car {

	
	//생성
	String color = "";
	//변속기 종료
	String gearType = "";
	//문의 개수
	int door = 0;
	
	Car (int num ,String str, String col) {
		color = col;
		gearType = str;
		door = num;
	}
	void carInfo() {
		System.out.println("색상 : " + color + "\t변속 종류 : " + gearType + "\t문의 개수 : " + door);
	}
	
	
	
}
