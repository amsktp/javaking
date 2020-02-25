//12일차 02 02 25

//final?
//	마지막의, 변경될 수 없는
//	final의 사용될 수 있는곳
//	클래스, 메서드, 멤버변수, 지역변수

//final은 상수
package com.tg.second;

final class FinalTest {
	final int MAX_SIZE = 100;
	
	final int max() {		
		final int tempNum = 0;
		Math.random();
		return tempNum;
	}
}
