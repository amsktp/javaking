package exam.test.shoppingMall;

public class ShoppingMallSystem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오
		
		Customer[] userObjectArr = new Customer[10];
				
		userObjectArr[0] = new Customer("이찬양", 25, 1000000);
		userObjectArr[1] = new Customer("정의광", 29, 10000000);
		userObjectArr[2] = new Customer("차정경", 24, 1000000);
		userObjectArr[3] = new Customer("고재민", 44, 10000000);
		userObjectArr[4] = new Customer("김윤진", 30, 1000000);
		userObjectArr[5] = new Customer("윤형식", 32, 10000000);
		userObjectArr[6] = new Customer("오현석", 27, 1000000);
		userObjectArr[7] = new Customer("양우진", 26, 10000000);
		userObjectArr[8] = new Customer("원아름", 27, 1000000);
		userObjectArr[9] = new Customer("박상아", 33, 10000000);

		ProductStore[] storeObjectArr= new ProductStore[6];
		
		storeObjectArr[0] = new ProductStore("최고의 컴퓨터", 800000);
		storeObjectArr[1] = new ProductStore("꽤좋은 노트북", 100000);
		storeObjectArr[2] = new ProductStore("최신형 냉장고", 1000000);
		storeObjectArr[3] = new ProductStore("푹신푹신 침대", 20000);
		storeObjectArr[4] = new ProductStore("좋은 자세 의자", 30000);
		storeObjectArr[5] = new ProductStore("갤럭시 S50", 900000);
		
		for (int i = 0; i < userObjectArr.length; i++) {
			System.out.println(userObjectArr[i]);
		}
		
		for (int i = 0; i < storeObjectArr.length; i++) {
			System.out.println(storeObjectArr[i]);
			System.out.println();
		}
		
	}
}
