package exam.test.shoppingMall;

public class ShoppingMallSystem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//가게에는 물건이 있어야만 판매한다.
		//에탄올(2500원), 마스크(4000원)
		
		//사람은 가게에 들어가서 물건을 구입할 수 있다.
		
		//가게는 유일하다
		
		//고객은 2사람만 존재한다.
		//각자 하나만 구매한다.
		
		Customer c1 = new Customer("이찬양", 10000);
		
		ProductStore p1 = new ProductStore();
		p1.sell(c1);
		
		c1.buy(new Ethanol());
		
		c1.info();
		System.out.println();
		Customer c2 = new Customer("고재민", 20000);
		c2.buy(new Mask());
	
		c2.info();
		
		
		
	}
}
