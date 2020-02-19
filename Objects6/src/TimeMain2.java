//7일차 17.02.18 (화)
public class TimeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time koreanTime = new Time();
		Time veitnamTime = new Time();
		
		System.out.println("한국 시간");
		
		koreanTime.getHour();
		System.out.print(koreanTime.hour + ":");
		koreanTime.minute = 30;
		System.out.print(koreanTime.minute + ":");
		koreanTime.second = 55;
		System.out.println(koreanTime.second);

		System.out.println("베트남 시간");
		
		veitnamTime.hour = 15;
		System.out.print(veitnamTime.hour + ":");
		veitnamTime.minute = 30;
		System.out.print(veitnamTime.minute + ":");
		veitnamTime.second = 55;
		System.out.println(veitnamTime.second);
	
	
	}

}
