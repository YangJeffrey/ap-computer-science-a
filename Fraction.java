package mp1;

/* Fraction Class has a numerator and denominator and can add, subtract, multiply, or divide 2 fractions */
public class Fraction {
	
	//Data members include numerator and denominator
	private int numerator;
	private int denominator;
	
	/* Constructor initializes numerator and denominator */
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	
	/* Overloaded constructor initializes numerator and denominator */
	public Fraction(Fraction f) {
		numerator = f.getnumerator();
		denominator = f.getdenominator();
	}
	
	//accessors
	public int getnumerator() {
		return numerator;
	}
	
	public int getdenominator() {
		return denominator;
	}
	
	//modifiers
	public void setnumerator(int n) {
		numerator = n;
	}
	
	public void setdenominator(int d) {
		denominator = d;
	}
	
	//override toString
	public String toString() {
		return (numerator + "/" + denominator);
	}
	
	//override equals
    public boolean equals(Fraction f) {
        if (f.getnumerator() == numerator && f.getdenominator() == denominator) {
            return true;
        } else {
            return false;
        }
    }
	
    //add
    public Fraction add(Fraction f) {
    	numerator = numerator * f.getdenominator() + f.getnumerator() * denominator;
    	denominator = denominator * f.getdenominator();
    	return new Fraction(numerator, denominator);
    }
    
    //sub
    public Fraction sub(Fraction f) {
    	numerator = numerator * f.getdenominator() - f.getnumerator() * denominator;
    	denominator = denominator * f.getdenominator();
    	return new Fraction(numerator, denominator);
    }
    
    //mult
    public Fraction mult(Fraction f) {
    	numerator = numerator * f.getnumerator();
    	denominator = denominator * f.getdenominator();
    	return new Fraction(numerator, denominator);
    }
    
    //div
    public Fraction div(Fraction f) {
    	numerator = numerator * f.getdenominator();
    	denominator = denominator * f.getnumerator();
    	return new Fraction(numerator, denominator);
    }
    
    //reduce
    
    
}
