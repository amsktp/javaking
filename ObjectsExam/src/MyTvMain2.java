//7일차 17.02.18 (화)
/**
 * 
 * =======================
 *  
 */
public class MyTvMain2 {

	public static void main(String[] args) {

		MyTv2 tv = new MyTv2();
		MyTv2 tv2 = new MyTv2();
		
		System.out.println(tv);

		tv.channel = 7;
		tv.power = true;
		tv.color = "red";
	
		System.out.println("채널은 " + tv.channel);
		System.out.println("전원은 " + tv.power);
		System.out.println("색상은 " + tv.color);		
		System.out.println();
		
		tv2.channel = tv.channel;
		tv2.power = tv.power;
		tv2.color = "blue";
		
		System.out.println("채널은 " + tv2.channel);
		System.out.println("전원은 " + tv2.power);
		System.out.println("색상은 " + tv2.color);		
	}		
}
