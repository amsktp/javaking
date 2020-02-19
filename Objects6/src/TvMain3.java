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

		//그냥 클래스 명을 변수로 사용 할 경우 첫번째 값의 주소를 가리키고 있으므로 그것이 덮어지면 주소 조차 같아짐
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
