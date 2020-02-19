//8일차 17.02.19 (수)
public class Data2 {

	int x = 0;

	
	//Data2 data2를 쓰는 이유는 data2.x를 바꿀수 있기때문입니다.
	void change(Data2 data2) {
		data2.x = 1000;
		System.out.println("change data2.x : " + data2.x);
	}
	
	
}


