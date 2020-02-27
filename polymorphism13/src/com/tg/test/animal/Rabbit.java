package com.tg.test.animal;

public class Rabbit extends Animals {

	
	Rabbit (String name, int tails, int foot) {
		this.name = name;
		this.tails = tails;
		this.foot = foot;
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("토끼는 달린다.");
	}
	
	
	
	
	
	
}
