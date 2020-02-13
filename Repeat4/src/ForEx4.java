//4일차
//for문
public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단2
		
		String str = "";
		int mulNum = 0;
		for (int i = 2; i <= 9; i++){
			for(int j = 1; j <= 9; j++) {
				mulNum = i*j;
				str = i + " * " + j + " = " + mulNum + "\t";
				System.out.print(str);
			}
			System.out.println();
		}
		
		
		
		
	}
}
