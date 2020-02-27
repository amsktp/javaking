package com.tg.test.animal;

public class AnimalsMain {

	public static void main(String[] args) {
	
	Cat c = new Cat("고양이", 1, 4);
	Parrot p = new Parrot("앵무새", 2, 1, 2);
	Rabbit r = new Rabbit("토끼", 1, 4);
	c.run();
	p.run();
	r.run();
	
	}
	
}
