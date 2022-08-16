

public class Fraction {
	
	
	public final int numerator;
	public final int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction(Fraction other) {
		this.numerator = other.numerator;
		this.denominator = other.denominator;
	}
	
	public int getNum() {
		return this.numerator;
	}
	
	public int getDenom() {
		return this.denominator;
	}
	
	
	@Override  
	public String toString() { 
		return " " + this.getNum() + "/" + this.getDenom();
	}
	
	public Fraction add(Fraction that) {
		
		int d = denominator * that.denominator;
		int n1 = numerator * that.denominator;
		int n2 = that.numerator * denominator;
		
		Fraction f = new Fraction(n1 + n2, d);
		return f;
	}
	
	public boolean equals(Object other) {
	    if( other != null && ! (other instanceof Fraction ) ) return false;
	        //checks if another instance of Fraction is existent and equal to the original
	    Fraction that = (Fraction) other;
	        //checks if they have equal memory addresses
	    if(that == other) {
	    	return true;
	    }
	    return false;
	}
	
}