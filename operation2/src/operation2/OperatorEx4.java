//2일차
package operation2;

public class OperatorEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//올림 처리
		float pi = 3.141592f;
		
		//소숫점 셋째 자리에서 올림
		
//		float shortPi =(int)(pi * 100 + 1) / 100f;
		
		//0.9 쓰는 이유는 3.140일 경우 3.14가 돼야하기 때문입니다.
		
		float shortPi =(int)(pi * 100 + 0.9) / 100f;
		System.out.println(shortPi);
		
		pi = 3.140592f;
		shortPi =(int)(pi * 100 + 0.9) / 100f;
		System.out.println(shortPi);
		
	}

}
