//2일차
package operation2;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1인지 0인지 판단하는 프로그램
		
		/*//나의 답
		 * int input = 0; 
		 * String zzaksu = "전원을 종료합니다."; String holsu = "전원을 켰습니다.";
		 * String result = (input==0)?zzaksu:holsu; 
		 * System.out.println("입력하신 값은 " + input + "\n" + result);
		 */
		
		int input = 3;
		String result = (input == 1)? "입력하신 값은 " + input + "\n전원을 켰습니다." : "입력하신 값은 " + input + "\n전원을 종료합니다.";
		System.out.println(result);
		
		//다중 삼항연산자
		
		result = (input == 1)? "입력하신 값은 " + input + "\n전원을 켰습니다." : 
				(input == 0)? "입력하신 값은 " + input + "\n전원을 종료합니다." : 
							"입력하신 값은 " + input + "\n잘못 입력하셨습니다.";
		System.out.println(result);
		
		}
	}

}
