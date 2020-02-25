//12일차 20 02 25
package com.tg.third;

//접근 제어자(access modifier)?
//	접근제어자는 멤버 또는 클래스에 사용되어, 해당하는 멤버 또는 클래스를 외부에서
//	접근하지 못하도록 제한하는 역할을 한다.
//	접근 제어자가 default임을 알리기 위해 실제로 default를 붙이진 않는다.
//	클래스나 멤버변수, 메서드, 생성자에 접근 제어자가 지정되어 있지 않다면,
//	접근 제어자가 default임을 뜻한다.


public class Time {

	private int hour;
	private int minute;
	private int second;
	
	
	 Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}


}