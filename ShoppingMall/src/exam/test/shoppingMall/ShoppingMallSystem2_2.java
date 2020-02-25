package exam.test.shoppingMall;

public class ShoppingMallSystem2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오

		String[] comUserArr = new String[5];
		String[] anyUserArr = new String[5];
		
		comUserArr[0] = "이찬양";
		comUserArr[1] = "정의광";
		comUserArr[2] = "차정경";
		comUserArr[3] = "고재민";
		comUserArr[4] = "김윤진";

		
		anyUserArr[0] = "윤형식";
		anyUserArr[1] = "오현석";
		anyUserArr[2] = "양우진";
		anyUserArr[3] = "원아름";
		anyUserArr[4] = "박상아";

		for (int i = 0; i < comUserArr.length; i++) {
			System.out.println(comUserArr[i] + " 컴퓨터 구입");
			System.out.print("컴퓨터 가게"); 
			System.out.println("에서 1개의 컴퓨터를 팔았습니다.");
			System.out.println();
		}
		

		
		
		
		System.out.println(anyUserArr[0] + " 노트북 구입");
		System.out.println("전자상가에서 1개의 노트북을 팔았습니다.");
		System.out.println();
		
		System.out.println(anyUserArr[1] + " 냉장고 구입");
		System.out.println("이마트에서 1개의 냉장고를 팔았습니다.");
		System.out.println();
		
		System.out.println(anyUserArr[2] + " 책상 구입");
		System.out.println("이케아에서 1개의 책상을 팔았습니다.");
		System.out.println();
		
		System.out.println(anyUserArr[3] + " 의자 구입");
		System.out.println("가구 판매점에서 1개의 의자를 팔았습니다.");
		System.out.println();
		
		System.out.println(anyUserArr[4] + " 휴대폰 구입");
		System.out.println("휴대폰 가게에서 1개의 휴대폰을 팔았습니다.");
		System.out.println();
		
	}

}
