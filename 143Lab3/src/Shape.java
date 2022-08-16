import java.awt.Color;
import java.awt.Graphics;

public class Shape {
	/*
	 * Class Invariants
	 * 
	 * 1. Distance can't be negative
	 * 2. Area must return a double if given a double
	 * 3. X-Y coordinates cannot be equal
	 * 4. Color values are valid and do not go below 0 or above 255
	 */

	Color color = new Color(00000);
	private int x, y;

	public Shape(){
		System.out.println("Empty shape.");
	}

	public Shape(int x, int y, Color newColor){
		this.x = x;
		this.y = y;
		color = newColor;
	}
	
	public Shape(Shape other){
		x = other.x;
		y = other.y;
	}

	public int getX(){	
		return this.x;	
	}

	public int getY(){	
		return this.y;	
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String toString(){
		return " Shape(" + x + "," + y + ") " + " \t Color: " + color + " \t area: " + getArea();
	}
	
	public double getArea(){	
		return -1;
	}
	
	public void draw(Graphics g){
		
	}

}