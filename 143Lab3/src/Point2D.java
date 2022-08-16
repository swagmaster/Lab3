


public class Point2D
{
	//because these are private variables, only the class methods can access them.
	//methods outside cannot change or use x and y
	//these variables are associated with the creation of new Point2D objects.	
    private int x;
    private int y;
    
    public Point2D(int x, int y)
    {
        setX(x);
        setY(y);
    }
    
    public void setX(int newX)
    {
        if( newX > 0)
        {
            x = newX;
        }
    }
    
    public void setY(int newY)
    {
        if (newY > 0)
        {
            y = newY;
        }
    }
    
    public int getX()
    {
        return this.x;
    }
    
    public int getY()
    {
        return this.y;
    }
    
    public void translate(int addToX, int addToY)
    {
        x += addToX;
        y += addToY;
    }
    
    /**
     * @override
     */
    public String toString()
    {
       return "x: " + getX() + ", y: " + getY();
    }
    
    public boolean equals(Point2D that)
    {
    	if(this == that) {
    		return true;
    	}
    	return false;
    }
}
