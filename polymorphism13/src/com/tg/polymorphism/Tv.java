//14일차 20 02 27 목

package com.tg.polymorphism;

public class Tv {

	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		System.out.println("나 된거야 channelUp");
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
}
