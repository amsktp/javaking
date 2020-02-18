//7일차 17.02.18 (화)
/**
 * tv속성 중 2개를 추가해서
 * 모든 변수에 값을 할당하여 출력하시오
 * =======================
 * 빨강
 * true
 * 
 * 
 */
public class MyTvMain {

	public static void main(String[] args) {
		
		//현재 변수만 생긴상태 1칸짜리 주소에 null값만 생긴 상태
		MyTv t;
		
		//이제 color, power, channel에 기본값이 생성된 상태
		//참고로 null, false, 0 이 기본값임. 기본값은 만들지 않았기 때문에..
		//이때 주소값은 0x1000 이런식 으로 들어감
		t = new MyTv();
		
		//컴퓨터의 색상
		t.color = "빨강";
		System.out.println("MyTv의 생상 : \"" + t.color + "\"");
		
		//전원 조작
		t.power = true;
		System.out.println("전원을 켰습니다. power : " + t.power);
		
		//채널 조작
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 '" + t.channel + "' 입니다.");
		
		//볼륨 조작
		t.volume = 5;
		System.out.println("현재 볼륨은 '" + t.volume + "' 입니다.");
		
		//선호채널 추가
		t.likechannel[0] = 6;
		t.likechannel[1] = 8;
		
		System.out.print("선호 채널은  ");
		for (int i = 0; i < t.likechannel.length; i++) {
			if ( t.likechannel[i] == 0 ) {
				break;
			} else {
				System.out.print("'" + t.likechannel[i] + "'" + " ");
			}
		}
		
		System.out.print("입니다.");
	}
}
