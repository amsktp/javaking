//14일차 20 02 27

public class Shopping {
	public static void main(String[] args) {

		Custmer customer = new Custmer();
		
		customer.buy(new Tv());
		System.out.println("현재 남은 돈은 " + customer.money + "만원 입니다.");
		System.out.println("현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
		System.out.println(customer);
		System.out.println();
		
//		customer.buy(new Audio());
//		System.out.println("현재 남은 돈은 " + customer.money + "만원 입니다.");
//		System.out.println("현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
//		System.out.println(customer);
//		System.out.println();
//		
//		customer.buy(new Computer());
//		System.out.println("현재 남은 돈은 " + customer.money + "만원 입니다.");
//		System.out.println("현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
//		System.out.println(customer);
//		System.out.println();
//
//		customer.buy(new Notebook());
//		System.out.println("현재 남은 돈은 " + customer.money + "만원 입니다.");
//		System.out.println("현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
//		System.out.println(customer);
//		System.out.println();
		
	}

}
