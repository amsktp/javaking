//14일차 20 02 27

public class Product {

	// 제품 가격
	int price;
	// 제품 구매시 포인트
	int bonusPoint = 0;

	public Product() {
		super();
	}

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스 포인트는 제품가격의 10%
	}

	@Override
	public String toString() {
		return "product [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}

}
