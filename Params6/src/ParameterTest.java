//8일차 17.02.19 (수)
//메서드 명명규칙
//변수명 동일
public class ParameterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data data = new Data();
		
		data.change(5);
		
		int x = 0;
		
		x = 10;
		System.out.println("main x = " + x);

		data.change(x);
	
		System.out.println("After change");
		System.out.println("main x = " + x);
		
		
		
	}
	
}
