/* Fraction Class has a numerator and denominator and can simplify two fractions, then add, subtract, multiply, or divide them. */
public class Fraction {
	
	//Data members include numerator and denominator
	private int numerator;
	private int denominator;
	
	/* Constructor initializes numerator and denominator */
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
		reduce();
	}
	
	/* Overloaded constructor initializes numerator and denominator */
	public Fraction(Fraction f) {
		numerator = f.getnumerator();
		denominator = f.getdenominator();
		//f.reduce();
		reduce();
	}
	
	/* Accessor methods get and return the numerator and denominator of data members */
	public int getnumerator() {
		return numerator;
	}
	
	public int getdenominator() {
		return denominator;
	}
	
	/* Modifier methods can change numerator and denominator of data members */
	public void setnumerator(int n) {
		numerator = n;
	}
	
	public void setdenominator(int d) {
		denominator = d;
	}
	
	/* override toString to print out a string with numerator/denominator in simplest terms*/
	public String toString() {
		return (numerator + "/" + denominator);
	}
	
	/* override equals to check if two fractions are equal if the numerators and denominators (in simplest terms) are the same*/
    public boolean equals(Fraction f) {
        if (f.getnumerator() == numerator && f.getdenominator() == denominator) {
            return true;
        } else {
            return false;
        }
    }
	
    /* adds two fractions together */
    public Fraction add(Fraction f) {
    	int num = numerator * f.getdenominator() + f.getnumerator() * denominator;
    	int den = denominator * f.getdenominator();
    	return new Fraction(num, den);
    }
    
    /* subtracts one fraction from another */
    public Fraction sub(Fraction f) {
    	int num = numerator * f.getdenominator() - f.getnumerator() * denominator;
    	int den = denominator * f.getdenominator();
    	return new Fraction(num, den);
    }
    
    /* multiplies two fractions together */
    public Fraction mult(Fraction f) {
    	int num = numerator * f.getnumerator();
    	int den = denominator * f.getdenominator();
    	return new Fraction(num, den);
    }
    
    /* divides one fraction by another */
    public Fraction div(Fraction f) {
    	int num = numerator * f.getdenominator();
    	int den = denominator * f.getnumerator();
    	return new Fraction(num, den);
    }
    
    /* Euclidean algorithm for calculating greatest common divisor of integers a and b */
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    /* reduces fraction to be in simplest terms using GCD */
    private void reduce() {
    	int d = gcd(numerator, denominator);
    	numerator /= d;
    	denominator /= d;
    	if (denominator < 0) {
    		numerator = -numerator;
    		denominator = -denominator;
    	}
    }
}
