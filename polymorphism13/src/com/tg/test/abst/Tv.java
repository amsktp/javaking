//14일차 20 02 27
package com.tg.test.abst;

public abstract class Tv {

	boolean power; //전원 ( on/off )
	int channel;	//채널 ( 숫짜아~ )
	
	abstract void power();
	
	abstract void info();

	
//	void power() {
//		power = !power;
//	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}

	//모든 멤버 변수 출력용
	
}
