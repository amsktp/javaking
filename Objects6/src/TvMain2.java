//7일차 17.02.18 (화)

public class TvMain2 {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		System.out.println("tv1의 channel값은 : " + tv1.channel);
		System.out.println("tv2의 channel값은 : " + tv2.channel);
		
		tv1.channel = 7;
		System.out.println("tv1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("tv1의 channel값은 : " + tv1.channel);
		System.out.println("tv2의 channel값은 : " + tv2.channel);
		
		
		
	}
}