//10일차 17.02.21 (금)
public class Square {

	Point[] pointArr = new Point[4];

	Square () {

	}
	
//	Square (Point[] pointArr) {
//		this.pointArr = pointArr;
//		
//	}

	Square (Point p1, Point p2, Point p3, Point p4){
		pointArr[0] = p1;
		pointArr[1] = p2;
		pointArr[2] = p3;
		pointArr[3] = p4;

	}

	void info() {
		for (int i = 0; i < pointArr.length; i++) {
			System.out.println("x 좌표는 : " + pointArr[i].x + "\ty 좌표는 : " + pointArr[i].y);

		}
		
	}

}
