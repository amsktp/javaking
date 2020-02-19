//8일차 17.02.19 (수)

public class CallStackMain {

	public static void main(String[] args) {
		//main은 스택에 쌓임 1
		//현 상태 {[main]
		
		//new로 시작하는것은 스택에 안쌓이고
		MethodTheory mt = new MethodTheory();
		
		mt.firstMethod();
		
	}
	//main이 끝나고 스택이 빠져나감 7
	//현상태 {
}