package exam.test.shoppingMall;

public class ShoppingMallSystem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오

		Customer lee = new Customer("이찬양", 25, 1000000);
		Customer jeong = new Customer("정의광", 29, 10000000);
		Customer cha = new Customer("차정경", 24, 1000000);
		Customer go = new Customer("고재민", 44, 10000000);
		Customer kim = new Customer("김윤진", 30, 1000000);
		Customer yun = new Customer("윤형식", 32, 10000000);
		Customer oh = new Customer("오현석", 27, 1000000);
		Customer yang = new Customer("양우진", 26, 10000000);
		Customer won = new Customer("원아름", 27, 1000000);
		Customer park = new Customer("박상아", 33, 10000000);

		ProductStore computerStore = new ProductStore("최고의 컴퓨터", 800000);
		ProductStore electronicStore = new ProductStore("꽤좋은 노트북", 100000);
		ProductStore eMart = new ProductStore("최신형 냉장고", 1000000);
		ProductStore ikeaStore = new ProductStore("푹신푹신 침대", 20000);
		ProductStore furnitureStore = new ProductStore("좋은 자세 의자", 30000);
		ProductStore samsongStore = new ProductStore("갤럭시 S50", 900000);

		System.out.println(lee);
		System.out.println(computerStore);
		System.out.println();
		computerStore.buy(lee);
		lee.info();
		System.out.println();
		System.out.println(lee);
		System.out.println(computerStore);
	}

}
