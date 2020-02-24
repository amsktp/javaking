//11일차 17.02.24 (월)
public class Point {

	
	int x = 10;
	int y = 10;
	
	Point(){
		
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	String getLocation( ) {
		return "x : " + x + ", y : " + y;
	}
	
	
	
}
