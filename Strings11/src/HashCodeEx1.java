//13일차 20 02 26 (수)
public class HashCodeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문자열 비교는 절대로 equals

		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println("abe" == "abe");
		System.out.println(str1 == str2);
		System.out.println(str1.contentEquals(str2));

		// 문자 기준으로
		System.out.println("abc".hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		// 문자와 주소 기준으로
		System.out.println(System.identityHashCode("abc"));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

	}
}