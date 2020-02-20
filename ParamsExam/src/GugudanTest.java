////9일차 17.02.20 (목)
//public class GugudanTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		int[] result = new int[9];
//		boolean flag = true;
//		
//		Gugudan g = new Gugudan("스마트 구구단");
//		System.out.println("안녕하세요! " + g.logo + " 입니다!");
//
//	}
//
//}

//정경님 답
public class GugudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gugudan gugudan = new Gugudan("스마트 구구단");	
		System.out.println(gugudan.title);
	
		gugudan.input();
		gugudan.output();
	}

}