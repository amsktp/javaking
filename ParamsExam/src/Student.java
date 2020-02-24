//10일차 17.02.21 (금)
public class Student {

	//학생 이름
	String name = "";
	//반
	int ban = 0;
	//번호
	int no = 0;
	//국어 점수
	int kor = 0;
	//영어 점수
	int eng = 0;
	//수학 점수
	int math = 0;
	
	//학생들 정보 기입
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//점수 합하기
	int getTotal () {
		int sum = 0;
		sum = kor + eng + math;
		return sum;
	}
	
	//점수 평균을 구하기
	double getAverage () {
		double avr = 0;
		int sum = 0;
		sum = kor + eng + math;
		avr = (int)(((double)sum / 3 * 100) + 0.5) / 100.0;
//		System.out.println(avr);
		return avr;
	}

	//학생들의 정보 출력
	void info (int sum, double avr) {
		System.out.println("이름 : " + name + " / 반 : " + ban + " / 번호 : " + no);
		System.out.println("국어 : " + kor + " / 영어 : " + eng + " / 수학 : " + math);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avr);
	}

}
