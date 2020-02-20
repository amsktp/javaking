//9일차 17.02.20 (목)
public class HumanMain {

	public static void main(String args[]) {
		
		Human h1 = new Human("고재민", "남자", 44);
		
		h1.humanInfo();
		
		Human h2 = new Human();
		
		h2.name = "박준형";
		h2.gender = "남자";
		h2.age = 25;
		
		h2.humanInfo();
	
	}
}
