//12일차 20 02 25 (화)
public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//1. String(String s)
//		String s = new String("Hello");
//		System.out.println(s);
//		//결과 : Hello
		
//		//2. char charAt(int index)
//		String s = "Hello";
//		String n = "0123456";
//		char c = s.charAt(4);
//		char d = n.charAt(4);
//		System.out.println("c : " + c + " d : " + d);
//		//결과 : c : o d : 4
		
//		//3.String concat(String str)
//		String s = "Hello";
//		String s2 = s.concat(" World");
//		System.out.println(s2);
//		//결과 : Hello World
		
//		//4. boolean endsWith(String suffix)
//		String file = "Hello.txt";
//		boolean b = file.endsWith("txt");
//		System.out.println(b);
//		//결과 : true
		
//		//5. boolean equals(object obj)
//		String s = "Hello";
//		boolean b = s.equals("Hello");
//		boolean b2 = s.equals("hello");
//		System.out.println("b : " + b + " b2 : " + b2);
//		//결과 : b : true b2 : false
	
//		//6. boolean equalsIgnoreCase(String str)
//		String s = "Hello";
//		boolean b = s.equalsIgnoreCase("HELLO");
//		boolean b2 = s.equalsIgnoreCase("heLLo");
//		System.out.println("b : " + b + " b2 : " + b2);
//		//결과 : b : true b2 : true
		
//		//7. int indexOf(int ch)
//		String s = "Hello";
//		int idx1 = s.indexOf('o');
//		int idx2 = s.indexOf(111); //대충 o가 111일걸???
//		int idx3 = s.indexOf('k');
//		System.out.println("idx1 : " + idx1 + " idx2 : " + idx2 + " idx3 : " + idx3);
//		//결과 idx1 : 4 idx2 : 4 idx3 : -1

//		//8. int indexOf(String str)
//		String s = "ABCDEFG";
//		int idx1 = s.indexOf("CD");
//		System.out.println("idx1 = " + idx1);
//		//결과 : idx1 = 2
		
//		//9. String intern() 무시하셈
//		String s = new String("abc");
//		String s2 = new String("abc");
//		boolean b = (s==s2);
//		boolean b2 = s.equals(s2);
//		boolean b3 = (s.intern()==s2.intern());
//		System.out.println("b : " + b + " b2 : " + b2 + " b3 : " + b3);
//		//결과 : b : false b2 : true b3 : true
		
//		//10. int lastIndexOf(int ch)
//		String s = "java.lang.Object";
//		int idx1 = s.lastIndexOf('.');
//		int idx2 = s.indexOf('.');
//		System.out.println("idx1 : " + idx1 + " idx2 : " + idx2);
//		//결과 : idx1 : 9 idx2 : 4
		
//		//11. int lastIndexOf(String str)
//		String s = "java.lang.Object";
//		int idx1 = s.lastIndexOf("java");
//		int idx2 = s.indexOf("java");
//		System.out.println("idx1 : " + idx1 + " idx2 : " + idx2);
//		//결과 : idx1 : 0 idx2 : 0
		
//		//12. int length()
//		String s = "Hello";
//		int length = s.length();
//		System.out.println("length : " + length);
//		//결과 : length : 5
		
//		//13. String replace(char old, char nw)
//		String s = "Hello";
//		String s1 = s.replace('H', 'C');
//		System.out.println("s : " + s + " s1 : " + s1);
//		//결과 : s : Hello s1 : Cello
	
//		//14. String replaceAll(String regex, String replacement)
//		String ab = "AABBAABB";
//		String r= ab.replaceAll("BB", "bb");
//		System.out.println("r : " + r);
//		//결과 : r : AAbbAAbb
		
//		//15. String replaceFirst(String regex, String replacement)
//		String ab = "AABBAABB";
//		String r = ab.replaceFirst("BB", "bb");
//		System.out.println("r : " + r);
//		//결과 : r : AAbbAABB
		
//		//16. String[] split(String regex)
//		String animals = "dog,cat,bear";
//		String[] arr = animals.split(",");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("arr[" + i + "] : " + arr[i] + " ");
//		}
//		//결과 : arr[0] : dog arr[1] : cat arr[2] : bear
		
//		//17. String[] split(String regex, int limit)
//		String animals = "dog,cat,bear";
//		String[] arr = animals.split(",",2);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("arr[" + i + "] : " + arr[i] + " ");
//		}
//		//결과 : arr[0] : dog arr[1] : cat,bear
		
//		//18. boolean startsWith(String prefix)
//		String s = "java.lang.Object";
//		boolean b = s.startsWith("java");
//		boolean b2 = s.startsWith("lang");
//		System.out.println("b : " + b + " b2 : " + b2);
//		//결과 : b : true b2 : false

//		//19. String substring(int begin) 
//		//	  String substring(int begin, int end)
//		String s = "java.lang.Object";
//		String c = s.substring(10);
//		String p = s.substring(5,9); //5 <= p < 9
//		System.out.println("c : " + c + " p : " + p);
//		//결과 : c : Object p : lang
		
//		//20. String toLowerCase()
//		String s = "Hello";
//		String s1 = s.toLowerCase();
//		System.out.println("s1 : " + s1);
//		//결과 : s1 : hello
		
//		//21. String toString()
//		String s = "Hello";
//		String s1 = s.toString();
//		System.out.println("s1 : " + s1);
//		//결과 : s1 : Hello
		
//		//22. String toUpperCase()
//		String s = "Hello";
//		String s1 = s.toUpperCase();
//		System.out.println("s1 : " + s1);
//		//결과 : s1 : HELLO
		
//		//23. String trim()
//		String s = "   Hello World   ";
//		String s1 = s.trim();
//		System.out.println("s1 : " + s1);
//		//결과 : s1 : Hello World
		
//		//24. static String valueOf(boolean b)
//		//	  static String valueOf(char c)
//		//	  static String valueOf(int i)
//		//	  static String valueOf(long l)
//		//	  static String valueOf(float f)
//		//	  static String valueOf(double d)
//		//	  static String valueOf(Object o)
//		String b = String.valueOf(true);
//		String c = String.valueOf('a');
//		String i = String.valueOf(100);
//		String l = String.valueOf(100L);
//		String f = String.valueOf(10.0f);
//		String d = String.valueOf(10.0d);
//		java.util.Date da = new java.util.Date();
//		String date = String.valueOf(da);
//		System.out.println("b : " + b + " c : " + c 
//				+ " i : " + i + " l : " + l + " f : " + f 
//				+ " d : " + d + " date : " + date);
//		//결과 : b : true c : a i : 100 l : 100 f : 10.0 d : 10.0 date : Tue Feb 25 17:42:12 KST 2020
			
	}

}
