//10일차 17.02.21 (금)
public class Circle {

//	int x;	// 원형의 x좌표
//	int y;	// 원형의 y좌표
	
	
	//포함관계(has)
	Point point = null;
	int r; // 반지름(radius)
	
	void Info() {
		System.out.println("circle의 정보");
		System.out.println("반지름 = " + r);
		System.out.println("x = " + point.x);
		System.out.println("y = " + point.y);		
	}
	

}
