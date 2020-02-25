package exam.test.shoppingMall;

public class ShoppingMallSystem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오

		String[] userArr = new String[10];
		
		userArr[0] = "이찬양";
		userArr[1] = "정의광";
		userArr[2] = "차정경";
		userArr[3] = "고재민";
		userArr[4] = "김윤진";

		userArr[5] = "윤형식";
		userArr[6] = "오현석";
		userArr[7] = "양우진";
		userArr[8] = "원아름";
		userArr[9] = "박상아";

		System.out.println(userArr[0] + " 컴퓨터 구입");
		System.out.println(userArr[1] + " 컴퓨터 구입");
		System.out.println(userArr[2] + " 컴퓨터 구입");
		System.out.println(userArr[3] + " 컴퓨터 구입");
		System.out.println(userArr[4] + " 컴퓨터 구입");

		System.out.println("컴퓨터 가게에서 5개의 컴퓨터를 팔았습니다.");
		System.out.println();
		
		
		
		System.out.println(userArr[5] + " 노트북 구입");
		System.out.println("전자상가에서 1개의 노트북을 팔았습니다.");
		System.out.println();
		
		System.out.println(userArr[6] + " 냉장고 구입");
		System.out.println("이마트에서 1개의 냉장고를 팔았습니다.");
		System.out.println();
		
		System.out.println(userArr[7] + " 책상 구입");
		System.out.println("이케아에서 1개의 책상을 팔았습니다.");
		System.out.println();
		
		System.out.println(userArr[8] + " 의자 구입");
		System.out.println("가구 판매점에서 1개의 의자를 팔았습니다.");
		System.out.println();
		
		System.out.println(userArr[9] + " 휴대폰 구입");
		System.out.println("휴대폰 가게에서 1개의 휴대폰을 팔았습니다.");
		System.out.println();
		
	}

}
