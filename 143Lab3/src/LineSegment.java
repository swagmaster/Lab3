
public class LineSegment {
	private int x;
	private int y;

	public LineSegment() {
		this.x = 0;
		this.y = 0;
	}

	public LineSegment(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public LineSegment(LineSegment that) {
		this.x = that.x;
		this.y = that.y;
	}

	public Point2D getStartPoint(){
		return new Point2D(this.x, this.y);
	}
	
	/*
	public void setStartPoint(Point2D start){
		this.x = start.x;
		this.y = start.y;
	}
	
	public void setEndPoint(Point2D end){
		this.x = end.x;
		this.y = end.y;
	}
	*/
	
	public void setX(int x) { 
		this.x = x;
	}
 
	public void setY(int y) { 
		this.y = y;
	}
 
	public int getX() { 
		return this.x;
	}
 
	public int getY() { 
		return this.y;
	}
 
	public void resetToOrigin() {
		x = 0;
		y = 0;
	} 

	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	} 
	
	public double distance(Point2D endPoint){
		return Math.sqrt(((this.x - endPoint.getX())^2) + ((this.y - endPoint.getY())^2));
	}

	@Override  
	public String toString() { 
		return "Line start(" + this.getStartPoint() + ") and line end(" + this.getStartPoint();
	}

	public boolean equals(Object that) {
		if((LineSegment)that == null || (LineSegment)that != this){
			return false;
		} else if(((LineSegment) that).getStartPoint() == this.getStartPoint()){
			return true;
		} else {
			return false;
		}
	}
}
