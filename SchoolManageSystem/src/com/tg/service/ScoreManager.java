package com.tg.service;

import com.tg.student.StudentVo;

public class ScoreManager {

	// 총점을 구하는 서비스

	public void studentInfo(StudentVo studentVo) {
		String studentInfoStr = "";

		studentInfoStr += "====학생정보====\n";
		studentInfoStr += "번호 : " + studentVo.getNo() + "\n";
		studentInfoStr += "이름 : " + studentVo.getName() + "\n";
		studentInfoStr += studentVo.getKorea().getName() + "점수 : " 
				+ studentVo.getKorea().getScore() + "\n";
		studentInfoStr += studentVo.getEnglish().getName() + "점수 : "
				+ studentVo.getEnglish().getScore() + "\n";
		studentInfoStr += studentVo.getMath().getName() + "점수 : "
				+ studentVo.getMath().getScore() + "\n";
		studentInfoStr += "총점 : " + studentVo.getTotalScore() + "\n";

		System.out.println(studentInfoStr);

	}

	public void setScoreTotal(StudentVo studentVo) {
		int totalScore = 0;
		totalScore = studentVo.getKorea().getScore() + studentVo.getEnglish().getScore()
				+ studentVo.getMath().getScore();

		studentVo.setTotalScore(totalScore);

	}
}
