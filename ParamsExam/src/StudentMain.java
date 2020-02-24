//9일차 17.02.20 (목)
public class StudentMain {

	public static void main(String args[]) {
		
		Student student1 = new Student("홍길동" ,2 , 1, 100, 60, 76);
		int sum = 0;
		double avr = 0.0;
		sum = student1.getTotal();
		avr = student1.getAverage();
		student1.info(sum, avr);		
		
	}
}
