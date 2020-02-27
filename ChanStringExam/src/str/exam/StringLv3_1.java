//이찬양
package str.exam;

public class StringLv3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바를 자바라"; // 기준
		String changeStr = ""; // 결과
		
		int index = 0;
		String before = "자바";
		String after = "잡아";
		//마지막부터 찾을 "자바"의 인덱스값
		index = originStr.lastIndexOf(before);
		//처음부터 "자" 이전 까지의 값 + "잡아" + "바" 이후부터 마지막까지의 값
		changeStr = originStr.substring(0, index) + after + originStr.substring(index + before.length());		
		
		// 자바를 자바라를 자바를 잡아라로 변경하여 출력하시오

		System.out.println(originStr);
		System.out.println(changeStr);

	}

}
