//11일차 17.02.24 (월)

//오버라이딩
//접근 제어자는 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.

public class Child extends Parent{

	public void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
	
}
