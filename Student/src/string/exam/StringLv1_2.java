package string.exam;
//자바를 자바라
public class StringLv1_2 {

	public static void main(String[] args) {
		
		//절대 원본 데이터를 변경하지 않는다.
		
		String originStr = "자바를 자바라";//기존
		String changeStr = "";
		
		//자바를 자바라를 db를 db라로 변경하여 출력하시오
		
		System.out.println(originStr);
		
		changeStr = originStr.replaceAll("자바",	"db");
		System.out.println(changeStr);
		
		
		
		
		
		
	}
}
