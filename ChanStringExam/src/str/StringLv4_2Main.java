package str;

public class StringLv4_2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "문자열은 재밌네요의 문짝입니다 안녕하세요 자바의 문자열 요~? 자바에서 문자열은 중요한가요 요!?"; // 기준
		String changeStr = "";          // 결과
		
		// 어떤 글자든 원하는 키워드를 원하는 갯수 만큼만 변경해준다
		// ex:
//		문자열은 재밌네요의 문짝입니다 안녕하세요 자바의 문자열 요~? 자바에서 문자열은 중요한가요 요!?
//		위의 문장에서 문자열 2개를 객체로 바꾼다면  
//		객체은 재밌네요의 문짝입니다 안녕하세요 자바의 객체 요~? 자바에서 문자열은 중요한가요 요!?
		
		//이전 바꿀 문자열
		String originSen = "";
		//이후 바뀐 문자열
		String changeSen = "";
		//바꿀 문자열 이전까지의 문자열
		String beforeStr = "";
		//바꿀 문자열이후의 문자열
		String afterStr = "";
		//몇번 실행할지
		int times = 0;
		//"자바"의 인덱스값
		int index = 0;
		
		
		//changeStr 초기화
		changeStr = originStr;
		//이전 바꿀 문자열
		originSen = "문자열";
		//이후 바뀐 문자열
		changeSen = "객체";	
		//횟수
		times = 2;
		
		//앞에서부터 몇개까지의 단어를 바꿀지 설정 => i
		for (int i = 0; i < times; i++) {
			//실시간으로 바뀌는 "자바"의 인덱스 값
			index = changeStr.indexOf(originSen);
			//횟수를 다 마치고 바꿀 문자열이 없다면 나가기
			if(index < 0 ) {
				break;
			}
			//바꿀 문장의 앞
			beforeStr = changeStr.substring(0, index);
			//바꿀 문장의 뒤
			afterStr = changeStr.substring(index+originSen.length());
			//"자바" -> "DB" 로 바꾸기
			changeStr = beforeStr + changeSen + afterStr;
		}
		
		System.out.println(originStr);
		System.out.println(changeStr);
		
//		위의 문장에서 문자열 3개를 인스턴스로 바꾼다면  
//		인스턴스은 재밌네요의 문짝입니다 안녕하세요 자바의 인스턴스 요~? 자바에서 인스턴스은 중요한가요 요!?
		
		System.out.println("=======================================================================");
		
		//changeStr 초기화
		changeStr = originStr; 
		//이전 바꿀 문자열
		originSen = "문자열";
		//이후 바뀐 문자열
		changeSen = "인스턴스";
		//바꿀 횟수
		times = 3;

		for (int i = 0; i < times; i++) {
			//실시간으로 바뀌는 "문자열"의 인덱스 값
			index = changeStr.indexOf(originSen);
			//횟수를 다 마치고 바꿀 문자열이 없다면 나가기
			if(index < 0 ) {
				break;
			}
			//바꿀 문장의 앞
			beforeStr = changeStr.substring(0, index);
			//바꿀 문장의 뒤
			afterStr = changeStr.substring(index+originSen.length());
			//"문자열" -> "인스턴스" 로 바꾸기
			changeStr = beforeStr + changeSen + afterStr;
		}
		
		System.out.println(originStr);
		System.out.println(changeStr);
		
	}

}
