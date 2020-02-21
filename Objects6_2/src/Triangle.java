//10일차 17.02.21 (금)
public class Triangle {
	
	Point[] pointArr = new Point[3];
	
	//현재 생성자는 안 일어나고 = null;인상태로 클래스 배열이 생성됨
	
	public Triangle(Point[] pointArr) {
		this.pointArr = pointArr;
	}

	
	public Triangle(Point p1, Point p2, Point p3) {
		pointArr[0] = p1;
		pointArr[1] = p2;
		pointArr[2] = p3;
	}

	void info() {
		for (int i = 0; i < pointArr.length; i++) {
			System.out.println("x좌표 : " + pointArr[i].x + "\t  y좌표 : " +  pointArr[i].y);
		}
	}
	
}
