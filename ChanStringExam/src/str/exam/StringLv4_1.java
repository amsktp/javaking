//이찬양
package str.exam;

public class StringLv4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바워크: 자바를 자바라"; // 기준
		String changeStr = "";          // 결과
		
		//이전 바꿀 문자열
		String originSen = "자바";
		//이후 바뀐 문자열
		String changeSen = "DB";
		//바꿀 문자열 이전까지의 문자열
		String firstStr = "";
		//바꿀 문자열이후의 문자열
		String secondStr = "";
		
		//몇번 실행할지
		int times = 0;
		//"자바"의 인덱스값
		int index = 0;

		changeStr = originStr;
		
		times = 2;
		//앞에서부터 몇개까지의 단어를 바꿀지 설정 => i
		for (int i = 0; i < times; i++) {
			//실시간으로 바뀌는 "자바"의 인덱스 값
			index = changeStr.indexOf(originSen);
			//바꿀 문장의 앞
			firstStr = changeStr.substring(0, index);
			//바꿀 문장의 뒤
			secondStr = changeStr.substring(index+originSen.length());
			//"자바" -> "DB" 로 바꾸기
			changeStr = firstStr + changeSen + secondStr;
		}
		
				
//		자바워크: 자바를 자바라를 DB워크: DB를 자바라로 변경하여 출력하시오 
		
		System.out.println(originStr);
		System.out.println(changeStr);
	}

}
