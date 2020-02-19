//8일차 17.02.19 (수)
public class MethodTheory {

	
	void firstMethod() {
		//스택에 쌓임 2
		//현상태 {[main][firstMethod]
		secondMethod();
		//secondMethod 끝 스택에서 빠져나감 6
		//현상태 {[main][firstMethod]
	}
	//fisrtMethod 끝
	//현상태 {[main]

	
	//내부 수행 후 빠져나감 7
	//현상태 {[main]
	
	void secondMethod() {
		//스택에 쌓임 3
		//현상태 {[main][firstMethod][secondMethod]
		System.out.println("secondMethod() 수행");
		//syso도 쌓임 4
		//현상태 {[main][firstMethod][secondMethod][syso]
		//syso 수행 끝 5
		//현상태 {[main][firstMethod][secondMethod]
	}
	
	
}