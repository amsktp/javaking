//11일차 17.02.24 (월)
public class PointMain extends Point {

	public static void main(String args[]) {
		
		Point p = new Point(2,4);
		Point3D p3 = new Point3D(11,13,15);
		
		String resultStr = "";
		
		resultStr = p.getLocation();
		System.out.println(resultStr);
		
		resultStr = p3.getLocation();
		System.out.println(resultStr);		
		
	}
}
