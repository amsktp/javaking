//9일차 17.02.20 (목)
public class GugudanTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] result = new int[9];
		boolean flag = true;
		String power = "";
		Gugudan2 g = new Gugudan2("스마트 구구단");
		System.out.println("안녕하세요! " + g.logo + " 입니다!");

		
		while (flag) {
			g.inputDan();
			result = g.gugudan();
			g.gugudanOut(result);
			power = g.powerInput();
			if(power.equals("y") || power.equals("Y")) {
				break;
			}
		}
		System.out.println("끝났습니다");

	}
}