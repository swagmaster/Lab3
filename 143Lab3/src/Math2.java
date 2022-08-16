

public class Math2 {

	static final double PI = 3.14159;
	static double E = 2.71828;
	
	public static int max(int a, int b) {
		if(a > b) {
			return a;
		} else if( b > a) {
			return b;
		} else {
			return -1;
		}
	}
	
	public static double max(double a, double b) {
		if(a > b) {
			return a;
		} else if( b > a) {
			return b;
		} else {
			return -1.0;
		}
	}
	
	public static int pow(int base, int exp) {
		int num = base;
		for(int i = exp; i > 1; i-- ) {
			num *= base;
		}
		return num;
	}
}
