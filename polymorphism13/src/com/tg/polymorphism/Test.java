//14일차 20 02 27 목

package com.tg.polymorphism;

//다형성?(polymorphise)
	//객체지향개념에서 다형성이란
	//'여러가지 형태를 가질 수 있는 능력'
	//자바에서는 한 타입의 참조변수로 여러 타입의 형태를 참조할 수 있도록 함으로써
	//다형성을 프로그램적으로 구현하였다.
	//조상클래스 타입의 참조변수로 자식클래스의 인스턴스를 참조할 수 있도록 하였다.
		
public class Test {

	public static void main(String[] args) {
		
//		Tv remocon = new Tv();
//		remocon.channel;
//		remocon.power;
//		remocon.channelDown();
//		remocon.channelUp();
//		remocon.power();
//
//		CaptionTv cRemocon = new CaptionTv();
//		cRemocon.channel;
//		cRemocon.power;
//		cRemocon.channelDown();
//		cRemocon.channelUp();
//		cRemocon.power();	
//		cRemocon.caption();
		
		//참조변수 t가 사용할 수 있는 멤버 계수가 적어서 문체가 없다.
		Tv t  = new CaptionTv();
		t.channelUp();

		//참조변수 ct가 사용할 수 있는 멤버 계수가 더 많아서 문제가 발생할 소지가 있다.
//		CaptionTv ct = new Tv();
	
		//즉, 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다.
		//반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수 없다.
		
		//그렇다면인스턴스의 타입과 일치하는 참조변수를 사용하면 인스턴스의 멤버들을
		//모두 사용할 수 있을텐데 왜 조상타입의 참조변수를 사용해서 인스턴스의 일부 멤버만을 사용하도록 할까?
		
	}
}
