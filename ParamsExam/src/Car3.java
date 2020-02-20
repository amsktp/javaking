//9일차 17.02.20 (목)
public class Car3 {
	
	
	
	//생성
	String color = "";
	//변속기 종료
	String gearType = "";
	//문의 개수
	int door = 0;
	
//	
//	this??
//			인스턴스 자신을 가리키는 참조변수
//			인스턴스의 주소가 저장되어 있다.
//			모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다.
	
	
	Car3 (String color, String gearType, int door ) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("생성자의 주소값 : " + this);
	}

	Car3 () {
		color = "노란색";
		gearType = "수동";
		door = 4;
	}
	
	void carInfo() {
		System.out.println("메서드의 주소값 : " + this);

		System.out.println("색상 : " + color + "\t변속 종류 : " + gearType + "  \t문의 개수 : " + door);
	}
	
	void carInfo(String color, int door) {
		this.color = color;
		this.door = door;
		this.gearType = gearType;
		System.out.println("메서드의 주소값 : " + this);
		
		System.out.println("색상 : " + this.color + "\t변속 종류 : " + this.gearType + "  \t문의 개수 : " + door);
	}
	
}
