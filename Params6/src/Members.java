//9일차 17.02.20 (목) // 여기 있는 모든 변수 , 메서드는 멤버 라고 칭함 => 멤버 = 멤버 변수 + 멤버 메서드
public class Members { //2번째 줄 "멤버" 클래스

	static int number;
	static String string;	//4,5 번째 줄은 스태틱 변수
	int num;
	String str;	//5,6 번째 줄은 인스턴스 변수
	//4,5,6,7 번째 줄은 맴버 변수 ("멤버" 클래스 내에 있는 멤버 변수)
	
	Members() { //생성자
		
	}
	
	Members(String str) { //생성자
		this.str = str;
	}
	
	//20, 24, 28, 32 번째 줄 모두 합쳐 멤버 메서드   =>  멤버 메서드 = 스태틱 메서드 + 인스턴스 메서드
	
	static int add(int num) { //스태틱 메서드
		return 0;
	}
	
	static int aaa(int num) { //스태틱 메서드
		return 0;
	}
		
	void add() { //인스턴스 메서드
			
	}

	void bbb() { //인스턴스 메서드
		
	}
	
}
