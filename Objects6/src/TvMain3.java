//7일차 17.02.18 (화)

public class TvMain3 {

	public static void main(String[] args) {

		Tv tv = new Tv();
		Tv tv2 = new Tv();

		System.out.println(tv);

		tv.channel = 7;
		tv.power = true;
		tv.color = "red";

		System.out.println("Tv 정보");
		System.out.println("채널은 " + tv.channel);
		System.out.println("전원은 " + tv.power);
		System.out.println("색상은 " + tv.color);		
		System.out.println();

		tv2.channel = tv.channel;
		tv2.power = tv.power;
		tv2.color = "blue";

		System.out.println("Tv2 정보");		
		System.out.println("채널은 " + tv2.channel);
		System.out.println("전원은 " + tv2.power);
		System.out.println("색상은 " + tv2.color);	
		System.out.println();
		tv2 = tv;

		System.out.println("복제 성공함");

		System.out.println("Tv 정보");
		System.out.println("채널은 " + tv.channel);
		System.out.println("전원은 " + tv.power);
		System.out.println("색상은 " + tv.color);		
		System.out.println();

		System.out.println("Tv2 정보");		
		System.out.println("채널은 " + tv2.channel);
		System.out.println("전원은 " + tv2.power);
		System.out.println("색상은 " + tv2.color);	
		System.out.println();
		tv2.channel = 1000;

		System.out.println("Tv2 정보 변경함 ");
		System.out.println("Tv 정보");
		System.out.println("채널은 " + tv.channel);
		System.out.println("전원은 " + tv.power);
		System.out.println("색상은 " + tv.color);		
		System.out.println();

		System.out.println("Tv2 정보");		
		System.out.println("채널은 " + tv2.channel);
		System.out.println("전원은 " + tv2.power);
		System.out.println("색상은 " + tv2.color);	


	}
}
