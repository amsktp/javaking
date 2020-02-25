package string.exam;
//자바를 자바라
public class StringLv1_3 {

	public static void main(String[] args) {
		
		//절대 원본 데이터를 변경하지 않는다.
		
		String originStr = "자바를 자바라";//기존
		String changeStr = "";
		
		//"자바를 자바라"를 "db를 자바라"로 변경하여 출력하시오
		//replace 쓰지않고
		
		System.out.println(originStr);
		
		int first = originStr.indexOf('자');
		int second = originStr.indexOf('바');
		
		changeStr = "db" + originStr.substring(second+1,originStr.length());
		
		System.out.println(changeStr);
		
		
		
		
		
		
	}
}
