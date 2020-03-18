package com.tg.test;

import com.tg.service.ScoreManager;
import com.tg.student.StudentVo;
import com.tg.subject.EnglishL;
import com.tg.subject.KoreaL;
import com.tg.subject.MathL;

public class SchoolManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScoreManager scoreManager = new ScoreManager();
		
		EnglishL englishL1 = new EnglishL("영어", 80);
		KoreaL koreaL1 = new KoreaL("국어", 90);
		MathL mathL1 = new MathL("수학", 80);
		
		StudentVo studentVo1 = new StudentVo(1, "원아름", koreaL1, englishL1, mathL1);
		
		System.out.println(studentVo1);
		
		scoreManager.setScoreTotal(studentVo1);
		scoreManager.studentInfo(studentVo1);		
		
		
		EnglishL englishL2 = new EnglishL("영어", 100);
		KoreaL koreaL2 = new KoreaL("국어", 100);
		MathL mathL3 = new MathL("수학", 100);
		
		StudentVo studentVo2 = new StudentVo(2, "이찬양", koreaL2, englishL2, mathL3);
		
		System.out.println(studentVo2);
		
		scoreManager.setScoreTotal(studentVo2);
		scoreManager.studentInfo(studentVo2);		
		
		
	}

}
