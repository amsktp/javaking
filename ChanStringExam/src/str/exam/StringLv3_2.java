//이찬양
package str.exam;

public class StringLv3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[3];
		
		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바를 자바라"; // 기준
		String changeStr = "";          // 결과
		
		String changeTemp = "";
		changeTemp = "잡아";
		
		//전체에서 "자바"를 "잡아"로 변경
		changeStr = originStr.replaceAll("자바", changeTemp);
		//첫번째 "잡아"의 인덱스 값
		int indexString = changeStr.indexOf(changeTemp);		
		//"자바" + ("잡아" 이후의 값)
		changeStr = "자바" + changeStr.substring(indexString + changeTemp.length());
		
//		자바를 자바라를 자바를 잡아라로 변경하여 출력하시오 
		
		System.out.println(originStr);
		System.out.println(changeStr);
			
	}
}
