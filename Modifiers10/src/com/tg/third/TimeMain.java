//12일차 20 02 25
package com.tg.third;

public class TimeMain {
	public static void main(String[] args) {

		Time time = new Time(12, 35, 30);

		System.out.println(time);

//		time.hour = 13;
		time.setHour(15);
		time.getHour();
		System.out.println(time.getHour());

	}

}