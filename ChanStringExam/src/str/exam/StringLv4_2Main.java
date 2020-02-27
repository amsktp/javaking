//Vo는 쓰지말고 그리고 유틸에 관련된건 지역변수로 선언해야한다

package str.exam;

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

		StringLv4_2Vo sVo = new StringLv4_2Vo();
		StringLv4_2 s1 = new StringLv4_2(sVo, originStr, "문자열", "객체", 2);

		s1.findReplace(sVo);
		s1.info(sVo);

		System.out.println("=========================ㅎㅎ=====================================");
		
		StringLv4_2 s2 = new StringLv4_2(sVo, originStr, "문자열", "인스턴스", 3);

		s2.findReplace(sVo);
		s2.info(sVo);
		//		위의 문장에서 문자열 3개를 인스턴스로 바꾼다면  
		//		인스턴스은 재밌네요의 문짝입니다 안녕하세요 자바의 인스턴스 요~? 자바에서 인스턴스은 중요한가요 요!?


	}

}
