//10일차 17.02.21 (금)
public class MuteTv extends Tv{

	int preVolume; // 이전 볼륨
	// true음소거인 상태, false 음소거 꺼져있는 상태
	boolean noSound = true; // 눌렀는지 여부 

	MuteTv (String name) {
		this.name = name;
		
	}
	

	void muteTv() {
		if(noSound) {
			preVolume = volume;
			volume = 0;
			noSound = false;
			System.out.println("음소거가 되었습니다.");
		}else{
			volume = preVolume;
			noSound = true;
			System.out.println("음소거가 풀리고 이전 volume : " 
					+ volume + "로 돌아갑니다.");			
		}
	}

	void muteTvInfo() {
		name = "MuteTv";
		System.out.println("이것은  " + name + " 입니다.");
		System.out.println("이전 볼륨 : " + preVolume);
		System.out.println("noSound : " + noSound);
		System.out.println("현재 볼륨 : " + volume);
		System.out.println("현재 채널 : " + channel);
		System.out.println("현재 전원 : " + power);
		System.out.println();
	}

}