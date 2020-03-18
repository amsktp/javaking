package com.tg.test;

import java.util.ArrayList;

import com.tg.service.ScoreManager;
import com.tg.student.StudentVo;
import com.tg.subject.Subject;

public class SchoolManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScoreManager scoreManager = new ScoreManager();
		ArrayList<Subject> subjectList = new ArrayList<Subject>();

		StudentVo studentVo = new StudentVo(1, "정의광");
		Subject subjectObj1 = new Subject("국어", 90);
		Subject subjectObj2 = new Subject("영어", 80);
		Subject subjectObj3 = new Subject("수학", 70);

		subjectList.add(subjectObj1);
		subjectList.add(subjectObj2);
		subjectList.add(subjectObj3);

		scoreManager.studentInfo(studentVo, subjectList);

		subjectList.clear();

		studentVo = new StudentVo(2, "이찬양");
		subjectObj1 = new Subject("국어", 30);
		subjectObj2 = new Subject("영어", 20);
		subjectObj3 = new Subject("수학", 50);

		subjectList.add(subjectObj1);
		subjectList.add(subjectObj2);
		subjectList.add(subjectObj3);

		scoreManager.studentInfo(studentVo, subjectList);

		subjectList.clear();

		studentVo = new StudentVo(3, "고재민");
		subjectObj1 = new Subject("국어", 56);
		subjectObj2 = new Subject("영어", 36);
		subjectObj3 = new Subject("수학", 80);

		subjectList.add(subjectObj1);
		subjectList.add(subjectObj2);
		subjectList.add(subjectObj3);

		scoreManager.studentInfo(studentVo, subjectList);
		
		subjectList.clear();

		studentVo = new StudentVo(4, "이용훈");
		subjectObj1 = new Subject("국어", 90);
		subjectObj2 = new Subject("영어", 78);
		subjectObj3 = new Subject("수학", 76);

		subjectList.add(subjectObj1);
		subjectList.add(subjectObj2);
		subjectList.add(subjectObj3);

		scoreManager.studentInfo(studentVo, subjectList);

	}

}
