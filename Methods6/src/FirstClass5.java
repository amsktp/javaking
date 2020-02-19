//8일차 17.02.19 (수)
public class FirstClass5 {

	void firstMethod() {
		secondMethod();
	}
	
	void secondMethod() {
		fourth();
	}
	
	void thirdMethod() {
		fourth();
	}
	
	void fourth() {
		System.out.println("fourth() 시작");
		System.out.println("fourth() 끝");
	}
	
}
