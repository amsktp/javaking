package com.tg.test.animal;

public class Parrot extends Animals {
	int wings = 0;
	
	Parrot (String name, int wings, int tails, int foot) {
		this.name = name;
		this.wings = wings;
		this.tails = tails;
		this.foot = foot;
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("새는 난다.");
	}
	
	
	
	
	
	
}
