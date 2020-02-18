//6일차 17.02.17 (월)
//배열
public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		정렬된 숫자를 뒤 랜덤하게 섞는 프로그램

		int[] number = {15, 11, 1, 3, 8};
		int tempNum = 0;
		int cnt = 0;
		boolean changed = false;
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "  ");
		}

		for (int i = 0; i < number.length; i++) {
			changed = false;
			for (int n = 0; n < number.length-1-i; n++) {
				if(number[n] > number[n+1]) {
					tempNum = number[n];
					number[n] = number[n+1];
					number[n+1] = tempNum;
					changed = true;
					
				} //if end
				cnt++;
				System.out.println();
				for(int k = 0; k < number.length; k++) {
					System.out.println(number[k] + "     cnt : "+ cnt);	
				}
				
			}//for end
			if (changed == false) {
			break;	
			}
				
			
		}//for end

		System.out.println();
		System.out.println("정렬 후");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + "  ");
		}
		System.out.println("작동한 횟수 : " + cnt);	
	}
}