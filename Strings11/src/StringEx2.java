//13일차 20 02 26 (수)
public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(v1);
		System.out.println(v2);
		
		//주소로 비교하기 때문에 다르다고 나옴
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다");
		} else {
			System.out.println("v1과 v2는 다릅니다");
		}
		
		v2 = v1;
		
		//주소를 덮어 씌웠기때문에 같다고 나옴
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다");
		} else {
			System.out.println("v1과 v2는 다릅니다");
		}
	
		
		
		
	}
}
