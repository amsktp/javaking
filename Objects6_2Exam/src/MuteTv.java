//10일차 17.02.21 (금)
public class MuteTv extends Tv {

	//음소거 시 기존 볼륨을 저장할 공간
	int volumeTemp = 0;
	
	boolean volumeMute = true; //음소거를 눌렀는지의 여부

	//음소거 기능
	void silence() {
		if(volumeMute) {
			volumeTemp = volume;
			volume = 0;
			volumeMute = false;
			System.out.println("음소거가 되었습니다.");
		}
		
		else {
			volume = volumeTemp;
			volumeMute = true;
			System.out.println("음소거가 풀렸습니다.");
		}
	}
}