//9일차 17.02.20 (목)
public class HomeMain {

	public static void main(String args[]) {
		
		System.out.println("집");
		
		Home h = new Home("서울", 30, 2);
		h.homeInfo();
		
		System.out.println("별채");
		
		Home h1 = new Home("뉴욕", 300, 10);
		h1.homeInfo();
	}
}
