package exam.test.shoppingMall;

// 어떤 단 하나의 물건만 팔수있는 매장
public class ProductStore {
	
	int storeMoney = 0;  // 주인장의 소지금
	int price = 0; // 제품의 가격

	
	ProductStore(int price){
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ProductStore [storeMoney=" + storeMoney + ", price=" + price + "]";
	}
	
}
