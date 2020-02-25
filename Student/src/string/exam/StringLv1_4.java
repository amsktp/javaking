package string.exam;
//자바를 자바라
public class StringLv1_4 {

	public static void main(String[] args) {
		
		//절대 원본 데이터를 변경하지 않는다.
		
		String originStr = "자바를 자바라";//기존
		String changeStr = "";	//결과
		String interestingStr = "";	//대상
		
		interestingStr ="자바";
		int index = 0;
		index = originStr.indexOf(interestingStr);
		
		System.out.println(index);
		//"자바를 자바라"를 "db를 자바라"로 변경하여 출력하시오
		
		changeStr = "db" + originStr.substring(2);
		
		System.out.println(originStr);
		System.out.println(changeStr);
		
		
		
		
		
		
	}
}
