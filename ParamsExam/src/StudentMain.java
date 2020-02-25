//9일차 17.02.20 (목)
public class StudentMain {

	public static void main(String args[]) {
		
		
		StudentVo s1 = new StudentVo();
		Student student1 = new Student(s1, "이찬양", 5,26,100,80,86);
		System.out.println(s1);
		
		int sum = student1.getTotal(s1);
		double avr = student1.getAverage(s1);
		student1.info(s1 , sum , avr);
		
		
	}
}
