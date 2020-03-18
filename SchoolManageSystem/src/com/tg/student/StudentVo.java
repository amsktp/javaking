package com.tg.student;

import com.tg.subject.EnglishL;
import com.tg.subject.KoreaL;
import com.tg.subject.MathL;

public class StudentVo {

	// 학생번호
	private int no = 0;
	// 이름
	private String name = "";
	// 국어
	private KoreaL korea = null;
	// 영어
	private EnglishL english = null;
	// 수학
	private MathL math = null;

	private int totalScore = 0;
	
	public StudentVo() {
		super();
	}

	public StudentVo(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	
	
	public StudentVo(int no, String name, KoreaL korea, EnglishL english) {
		super();
		this.no = no;
		this.name = name;
		this.korea = korea;
		this.english = english;
	}

	public StudentVo(int no, String name, KoreaL korea, EnglishL english, MathL math) {
		super();
		this.no = no;
		this.name = name;
		this.korea = korea;
		this.english = english;
		this.math = math;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public KoreaL getKorea() {
		return korea;
	}

	public void setKorea(KoreaL korea) {
		this.korea = korea;
	}

	public EnglishL getEnglish() {
		return english;
	}

	public void setEnglish(EnglishL english) {
		this.english = english;
	}

	public MathL getMath() {
		return math;
	}

	public void setMath(MathL math) {
		this.math = math;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "StudentVo [no=" + no + ", name=" + name + ", korea=" + korea + ", english=" + english + ", math=" + math
				+ ", totalScore=" + totalScore + "]";
	}

	

}
