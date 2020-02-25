package string.exam;
//자바를 자바라
public class StringLv1_5 {

	public static void main(String[] args) {
		
		//절대 원본 데이터를 변경하지 않는다.
		
		String originStr = "자바를 자바라";//기존
		String changeStr = "";	//결과
	
		//문자열 안에서 마지막 문자가 무엇인지 출력하시오
		
//		changeStr = originStr.substring(originStr.length()-1);
		
//		changeStr = originStr.valueOf(originStr.charAt(originStr.length()-1));
		changeStr = "" + originStr.charAt(originStr.length()-1);
		
		System.out.println(originStr);
		System.out.println(changeStr);
		
	}
}
