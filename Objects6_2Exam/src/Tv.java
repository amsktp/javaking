//10일차 17.02.21 (금)

public class Tv {
	
//	속성 = 크기, 길이, 색상, 볼륨, 채널 등
//	기능 = 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경하기 등
	
	
	boolean power = false;
	int channel = 0;
	int volume = 0;

	
	//전원
	void power() {
		power = !power;
	}
	
	//채널 업
	void channelUp() {
		channel++;
	}
	
	//채널 다운
	void channelDown() {
		channel--;
	}
	
	//볼륨 업
	void volumeUp() {
		volume++;
	}
	
	//볼륨 다운
	void volumeDown() {
		volume--;
	}

	
	void volumeInfo() {
		System.out.println("현재 볼륨 => " + volume);
	}

	
	
}
