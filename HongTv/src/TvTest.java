//10일차 17.02.21 (금)
/**
 * tv별칭 
 * 
 * tv
 * 음소거tv
 * 자막tv
 * 
 * 
 * 어딘가에 String name =""; 을 넣어서 info를 출력하면 이건 mute tv다 어쩐다 다 말해야함
 * 
 */

public class TvTest {

	public static void main(String[] args) {
		Tv tv = new Tv("Tv");
		CaptionTv ctv = new CaptionTv("CaptionTv");
		MuteTv mtv = new MuteTv("MuteTv");
		
		
		//기존값
		tv.tvInfo();
		ctv.captionTvInfo();
		mtv.muteTvInfo();
		
		System.out.println("====================");
		
		//변경값
		
		tv.volumeUp();
		ctv.volume = 10;
		mtv.volume = 30;
		
		tv.tvInfo();
		ctv.captionTvInfo();
		mtv.muteTvInfo();
		
	
		
	} // main
}