//10일차 17.02.21 (금)
/**
 * 
 * Tv는 볼륨이 있다.
 * Tv는 볼륨을 1 올리고 1 내리는 기능이 있다.
 * 음소거 기능이 있는 Tv를 만든다.
 * 음소거가 있다.
 * 음소거 버튼을 누르면 음소거가 된다.
 * 음소거가 된 상태에서 음소거 버튼을 누르면 이전의 볼륨 상태로 돌아간다.
 */
public class TvTest {

	public static void main(String args[]){
	
		MuteTv tv = new MuteTv();
		
		tv.volume = 10;
		
		tv.volumeInfo();
		
		tv.volumeUp();
		
		tv.volumeInfo();
		
		tv.volumeDown();
		
		tv.volumeInfo();
		
		tv.silence(); //음소거 시키기
		
		tv.volumeInfo();	
		
		tv.silence(); //음소거 헤재
		
		tv.volumeInfo();	
	}	
	
	
	
	
	
	
	
	{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}
	{}{}{}{}{}{}  {}{}{}  {}{}  {}{}{}  {}{}  {}{}{}
	{}{}    {}{}  {}{}      {}  {}{}  {}  {}    {}{}
	{}  {}{}  {}  {}{}{}  {}{}    {}{}  {}{}  {}{}{}
	{}  {}{}  {}  {}{}  {}  {}  {}{}{}{}{}{}    {}{}
	{}{}    {}{}  {}{}{}{}{}{}  {}{}{}{}  {}  {}{}{}
	{}{}{}{}{}{}  {}{}  {}{}{}{}{}{}{}  {}  {}{}{}{}
	{}{}{}{}{}{}  {}{}          {}{}{}{}  {}{}{}{}{}
	{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}
}