package test;

// 물건을 구입할 수 있는 고객
public class Product {
	int price = 0;
	String productName = "";
	int productCount = 0;

	Product(int price, String productName, int productCount) {
		this.price = price;
		this.productName = productName;
		this.productCount = productCount;
	}

}
