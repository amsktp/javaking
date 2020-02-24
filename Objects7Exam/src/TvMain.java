//11일차 17.02.24 (월)
public class TvMain extends Tv {

	public static void main(String args[]) {
		
		Tv tv = new Tv("Tv");
		CaptionTv ctv = new CaptionTv("CaptionTv");
		MuteTv mtv = new MuteTv("MuteTv");
		
		//기존값
		tv.tvInfo();
		ctv.tvInfo();
		mtv.tvInfo();
		
		System.out.println("=======변경 후=============");
		
		//변경값
		
		tv.volumeUp();
		tv.power = true;
		tv.tvInfo();
		
		
//		ctv.volume = 10;
//		ctv.power = true;
//		ctv.channelUp();
//		ctv.captionState = true;
//		ctv.tvInfo();
//		
//		
//		mtv.power = false;
//		mtv.preVolume = 5;
//		mtv.noSound = false;
//		mtv.tvInfo();
		
		
		
		
	}
}
