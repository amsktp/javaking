//10일차 17.02.21 (금)
public class CaptionTv extends Tv{

	boolean caption = false;  // 캡션 상태

	
	CaptionTv (String name) {
		this.name = name;
	}
	
	void displayCaption(String text) {
		if(caption == true) {  // 캡션 상태가 true(켠)일 경우 text를 보여준다 
			System.out.println(text);
		}
	}
	
	
	
	void captionTvInfo() {
		name = "CaptionTv";
		System.out.println("이것은  " + name + " 입니다.");
		System.out.println("현재 자막이 켜져있는지에 대한 상태인 \"cation\"에 대한 변수는 현재 " + caption + "입니다.");
		System.out.println("현재 볼륨 : " + volume);
		System.out.println("현재 채널 : " + channel);
		System.out.println("현재 전원 : " + power);
		System.out.println();
	}

}
