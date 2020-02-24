//11일차 17.02.24 (월)
public class SuperTest extends Parent{

	public static void main(String agrs[]) {

		//super?
		//		자식 클래스에서 부모 클래스로부터 상솓받은 멤버를 참조하는데 사용되는 참조변수
		//		멤버변수와 지역변수의 이름이 같을 때 this를 사용해서 구별했듯이 상속받은 멤버와
		//		자신의 클래스에 정의한 멤버의 이름이 같을 때는 super를 사용해서 구별할 수 있다.
		//		단, static메서드는 인스턴스와 관련이 없다.
		//		그래서 this와 동일하게 super는 static메서드에서는 사용할 수 없다.


		Child c = new Child();
		c.method();


	}

}
