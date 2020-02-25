//10일차 17.02.21 (금)

public class Student {

	
	//학생들 정보 기입
	Student(StudentVo s1, String name, int ban, int no, int kor, int eng, int math) {
		s1.setName(name);
		s1.setBan(ban);
		s1.setNo(no);
		s1.setKor(kor);
		s1.setEng(eng);
		s1.setMath(math);
	}
	
	//점수 합하기
	int getTotal (StudentVo s1) {
		int sum = 0;
		sum = s1.getKor() + s1.getEng() + s1.getMath();
		return sum;
	}
	
	//점수 평균을 구하기
	double getAverage (StudentVo s1) {
		double avr = 0;
		int sum = 0;
		sum = s1.getKor() + s1.getEng() + s1.getMath();
		avr = (int)(((double)sum / 3 * 100) + 0.5) / 100.0;
//		System.out.println(avr);
		return avr;
	}

	void info (StudentVo s1, int sum, double avr) {
		System.out.println("이름 : " + s1.getName() + " / 반 : " + s1.getBan() + " / 번호 : " + s1.getNo());
		System.out.println("국어 : " + s1.getKor() + " / 영어 : " + s1.getEng() + " / 수학 : " + s1.getMath());
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avr);
	}

	

}
