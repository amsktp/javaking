//2일차
package operation2;

public class OperatorEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		int n = 150;
		
		System.out.print("5는 0보다 크고, 9보다는 작다. ");
		String result1 = (num>0 && num<9)? "넵" : "아뇹";
		System.out.println(result1);
		
		
		System.out.print("0보다 작거나 100보다 큰 가? ");
		String result2 = (n<0 || n>100)? "넵" : "아뇹";
		System.out.println(result2);
		
		//String result = (num>0 && num<9)? (n<0 || n>100)? "다 일치하네요" : "아래꺼는 일치가 아니네요" : "위에꺼부터 불일치 해요";
				
	}
	
}
