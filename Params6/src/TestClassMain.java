//8일차 17.02.19 (수)
//메서드 명명규칙
//변수명 동일
public class TestClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static 메서드는 참조변수를 선언하지 않아도 사용 가능하지만
//		TestClass.staticMethod();
//		TestClass.staticMethod2();

		TestClass cc = new TestClass();
//		인스턴스 메서드는 참조변수를 선언해야만 사용 가능하다
//		TestClass.instanceMethod();
		
		TestClass.staticMethod();
		TestClass.staticMethod2();
		

	}

}
