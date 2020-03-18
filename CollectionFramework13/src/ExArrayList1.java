import java.util.ArrayList;
public class ExArrayList1 {

	public static void main(String args[]) {
		
		ArrayList firstNumList = new ArrayList();
		ArrayList secondNumList = new ArrayList();
		int result = 0;
		
		
		for (int i = 0; i < 9; i++) {
			firstNumList.add(i+1);
		}
		
		for (int i = 0; i < 2; i++) {
			secondNumList.add(i+2);
		}
		
		for (int i = 0; i < secondNumList.size(); i++) {
			for (int n = 0; n < firstNumList.size(); n++) {
				result = (int)secondNumList.get(i) * (int)firstNumList.get(n);
				System.out.print(secondNumList.get(i) + " * " + firstNumList.get(n) + " = " +  result + "\t");
			}
			System.out.println();
		}
		
	}
}
