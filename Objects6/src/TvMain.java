//7일차 17.02.18 (화)

public class TvMain {

	public static void main(String[] args) {
		
		//현재 변수만 생긴상태 1칸짜리 주소에 null값만 생긴 상태
		Tv t;
		
		//이제 color, power, channel에 기본값이 생성된 상태
		//참고로 null, false, 0 이 기본값임. 기본값은 만들지 않았기 때문에..
		//이때 주소값은 0x1000 이런식 으로 들어감
		t = new Tv();
		
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "입니다.");
		
		
	}
}
