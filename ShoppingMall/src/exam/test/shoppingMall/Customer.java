package exam.test.shoppingMall;

// 물건을 구입할 수 있는 고객
public class Customer {

	String name = "";
	int money = 0;

	Customer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	void buy(ProductStore productStore){
		if(this.money >= productStore.price){
			this.money = this.money - productStore.price; 
			productStore.storeMoney = productStore.storeMoney + productStore.price;
			System.out.println(name + " 님이");
			System.out.println(productStore + "를 구입하셨습니다.");
		}else{
			System.out.println(name + " 님이");
			System.err.println(productStore + "제품을 구입하기에 ");
			System.err.println(this.money - productStore.price + " 원 부족합니다.");
			return;
		}
	}
	
	void info() {
		System.out.println(name + "님의 현재 남은 돈은 " + this.money + "만원 입니다.");
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", money=" + money + "]";
	}
}
