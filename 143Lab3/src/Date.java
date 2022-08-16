

public class Date {
	
	private int month;
	private int day;
	private int year;

	public Date(){
		setDate(00,00,0000);
	}
	
	public Date(int m, int d, int y){
		setDate(m,d,y);
	}
	
	//Copy constructor
	public Date(Date other){
		this.month = other.month;
		this.day = other.day;
		this.year = other.year;
	}

	public int getMonth() {
		return this.month;	
	}

	public int getDay() {	
		return this.day;	
	}

	public int getYear() {	
		return this.year;	
	}

	public void setDate(int m, int d, int y){
		if(m <= 0 || m >= 13){
			System.out.println("Invalid month.");
		} else if(d <= 0 || d >= 32){
			System.out.println("Invalid day.");
		} else if(y < 0){
			System.out.println("Invalid year.");
		} else {
			this.month = m;
			this.day = d;
			this.year = y;
		}
	}

	@Override
	public String toString(){
		return " " + month + "/" + day + "/" + year;
	}

	public boolean equals(Object other){
		if(month == ((Date) other).getMonth() && day == ((Date)other).getDay() 
				&& year == ((Date)other).getYear()) {
			return true;
		} else {
			return false;
		}
	}
}

/*
 * 1. The difference public and private is that only the Date class has access to the month day and year variables.
 * 	  access modifiers outside the class won't be able to change the actual values on them.
 * 2. static data can be accessed, read, and written to. You would have 1 static variable declared in RAM.
 * 3. final data can be accessed and read. It cannot be written to after first initialization and thats why it isn't 
 *    good to declare it public. Some classes need to stay constant to work like a final variable.
 * 
 */