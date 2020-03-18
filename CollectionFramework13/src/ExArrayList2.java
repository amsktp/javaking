import java.util.ArrayList;
import java.util.Scanner;
public class ExArrayList2 {

	public static void main(String args[]) {
		
		ArrayList numList = new ArrayList();
		Scanner scan = new Scanner(System.in);
		int result = 0;
		
		System.out.print("첫번째 숫 자 입력 => ");
		numList.add(scan.nextInt());
		System.out.print("두번째 숫 자 입력 => ");
		numList.add(scan.nextInt());
		
		result = (int)numList.get(0) + (int)numList.get(1);
		
		System.out.println(numList.get(0) + "과 " + numList.get(1) + "의 합은 " + result + " 입니다.");
		
		
	}
}
