//9일차 17.02.20 (목)
public class Human {

	
	String name = "";
	String gender = "";
	int age = 0;
	
	Human (String n, String g, int a) {
		name = n;
		gender = g;
		age = a;
	}
	
	Human () {
//		name = "박준형";
//		gender = "남자";
//		age = 25;
	}
	
	void humanInfo() {
		System.out.println("이름 : " + name + "\t성별 : " + gender + "\t나이 : " + age);
	}
	
	
	
}
