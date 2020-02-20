//메서드 명명규칙
//9일차 17.02.20 (목)
//변수명 동일
public class TestClass2 {

	
	int iv; //인스턴스 변수
	static int cv;
	
	void instanceMethod() { //인스턴스 메서드
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod() { //static 메서드
//		System.out.println(iv); // 에러) 인스턴스 변수를 사용할 수 없다
		System.out.println(cv);		
	}
	
}