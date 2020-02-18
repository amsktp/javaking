//7일차 17.02.18 (화)
public class Time {

	//1. 시, 분, 초는 모두 0보다 크거나 같아야 한다.
	//2. 시의 범위는 0~23, 분과 초의 범위는 0~59 이다.
	
	int hour = 0;
	int minute = 0;
	int second = 0;

	int getHour() {
		return hour;
	}

	void gethour(int h) {
		if(h < 0 || h > 23) {
			return;
		}
		hour = h;
	}

	int getMinute() {
		return minute;
	}

	void getMinute(int m) {
		if(m < 0 || m > 59) {
			return;
		}
		minute = m;
	}
	
	int getSecond() {
		return second;
	}
	
	void getSecond(int s) {
		if(s < 0 || s > 59) {
			return;
		}
		second = s;
	}
}

