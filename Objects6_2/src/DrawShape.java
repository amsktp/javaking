//10일차 17.02.21 (금)
public class DrawShape {

	public static void main(String args[]) {

//		Circle circle = new Circle();
//		circle.r = 5;
//		circle.point = new Point();
	
		
		
//		Point p1 = new Point(2, 3);
//		Point p2 = new Point(5, 3);
//		Point p3 = new Point(3, 10);
//		
//		Point[] pointArr = new Point[3];
//		pointArr[0] = p1;
//		pointArr[1] = p2;
//		pointArr[2] = p3;
//		
////		Triangle tr1 = new Triangle(pointArr);
//		Triangle tr1 = new Triangle(p1,p2,p3); //이게 더 남
//		
//		tr1.info();
		
		//1번째 케이스
		Point p1 = new Point(3, 5);
		Point p2 = new Point(8, 5);
		Point p3 = new Point(3, 15);
		Point p4 = new Point(8, 15);
		
		//2번째 케이스
		Point[] pointArr = new Point[4];
		pointArr[0] = p1;
		pointArr[1] = p2;
		pointArr[2] = p3;
		pointArr[3] = p4;
//		pointArr[3] = new Point(8,15);
		//이런식으로 가능
		
		
		
		
//		Square sqr = new Square(pointArr);
		
		
		Square sqr = new Square(p1, p2, p3, p4);
		sqr.info();
		
		
	}

}