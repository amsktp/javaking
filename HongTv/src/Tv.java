//10일차 17.02.21 (금)
public class Tv {
//	속성 - 크기, 길이, 색상, 볼륨, 채널 등
//	기능 - 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경하기 등
	
	boolean power; //전원 ( on/off )
	int channel;	//채널 ( 숫짜아~ )
	int volume;
	String name ="";
	
	Tv(String name) {
		this.name = name;
	}
	
	Tv() {
		
	}

	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void volumeUp() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
	
	void volumeInfo() {
		System.out.println("현재 사운드 : " + volume);
	}

	//나의 멤버변수 모두 출력
	void tvInfo() {
		
		System.out.println("이것은  " + name + " 입니다.");
		System.out.println("현재 볼륨 : " + volume);
		System.out.println("현재 채널 : " + channel);
		System.out.println("현재 전원 : " + power);
		System.out.println();
	}
}