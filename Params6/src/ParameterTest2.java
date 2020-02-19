//8일차 17.02.19 (수)
//메서드 명명규칙
//변수명 동일
public class ParameterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//callByValue vs callByReference
		//값 호출				값 참조

		//기본형 매개변수 - 변수의 값을 읽기만 할 수 있다(read only) => int, boolean 등등
		//참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다(read & write) => new로 선언되는 변수 (배열, 참조변수)
		
		Data2 data2 = new Data2();
		int x = 0;

		x = 10;
		data2.x = x;


		System.out.println("main data2.x = " + data2.x);
		System.out.println(data2);
		data2.change(data2);

		System.out.println("After change");
		System.out.println("main data2.x = " + data2.x);



	}

}
