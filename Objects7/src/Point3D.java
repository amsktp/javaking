//11일차 17.02.24 (월)

//오버로딩 vs 오버라이딩
//오버로딩은 기존에 없는 새로운 메서드를 추가하는 것(new)
//오버라이딩은 상속받은 메서드의 내용을 변경하는 것(change, modify)
public class Point3D extends Point {

	// 오버라이딩???
	//	조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것을 오버라이딩이라고 한다.
	//	상속받은 메서드를 그대로 사용하기도 하지만, 자식 클래스 자신에 맞게 변경해야하는 경우가 많다.
	//	이럴 때 조상 메서드를 오버라이딩한다.
	
	
	//오버라이딩의 조건
	//	자식 클래스에서 오버라이딩 하는 메서드는 조상 클래스의 메서드와
	//		1. 이름이 같아야한다.
	//		2. 매개변수가 같아야 한다.
	//		3. 변환타입이 같아야 한다.

	//super() - 조상클래스의 생성자
	
	
	int z;

	
	//부모 클래스의 기본생성자가 없을 때 가장 이상적인 형태
	Point3D (int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
//	Point3D (int x, int y, int z){
//		super(x, y);
//		this.z = z;
//	}
//	
	String getLocation( ) {
	
		String msg = "";
	
		
		msg = super.getLocation();
		msg += ", z : " + z;
		
		return msg;	
	}
	
	
}