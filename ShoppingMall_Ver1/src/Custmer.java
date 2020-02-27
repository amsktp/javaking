//14일차 20 02 27

public class Custmer {

	// 소유 금액
	int money = 1000;
	// 보너스 포인트
	int bonusPoint = 0;

	// 미친 다형성
	void buy(Product product) {
		if (money < product.price) {
			System.err.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money = money - product.price;
		bonusPoint = bonusPoint + product.bonusPoint;
		System.out.println(product + "를 구입하셨습니다.");

	}

//	void buy(Audio audio) {
//		if (money < audio.price) {
//			System.err.println("잔액이 부족하여 물건을 살 수 없습니다.");
//			return;
//		}
//		money = money - audio.price;
//		bonusPoint = bonusPoint + audio.bonusPoint;
//		System.out.println(audio + "를 구입하셨습니다.");
//	}
//
//	void buy(Computer computer) {
//		if (money < computer.price) {
//			System.err.println("잔액이 부족하여 물건을 살 수 없습니다.");
//			return;
//		}
//		money = money - computer.price;
//		bonusPoint = bonusPoint + computer.bonusPoint;
//		System.out.println(computer + "를 구입하셨습니다.");
//	}

	@Override
	public String toString() {
		return "Custmer [money=" + money + ", bonusPoint=" + bonusPoint + "]";
	}

}
