//10일차 17.02.21 (금)
public class CaptionTv extends Tv {

	boolean caption = false; //캡션 상태
	
	void displayCaption(String text) { 
		if(caption == true) {//캡션 상태가 true일 경우
			System.out.println(text);
		}
	}
	
}