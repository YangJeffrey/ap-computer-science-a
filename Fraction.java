package mp1;

/* Fraction Class has a numerator and denominator and can simplify two fractions, then add, subtract, multiply, or divide them. */
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
	
	/* override toString to print out a string with numerator/denominator in simplist terms*/
	public String toString() {
		return (numerator + "/" + denominator);
		//handle negatives and negative/negative also make it simplest terms
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
    	return reduce(new Fraction(num, den));
    }
    
    /* subtracts one fraction from another */
    public Fraction sub(Fraction f) {
    	int num = numerator * f.getdenominator() - f.getnumerator() * denominator;
    	int den = denominator * f.getdenominator();
    	return reduce(new Fraction(num, den));
    }
    
    /* multiplies two fractions together */
    public Fraction mult(Fraction f) {
    	int num = numerator * f.getnumerator();
    	int den = denominator * f.getdenominator();
    	return reduce(new Fraction(num, den));
    }
    
    /* divides one fraction by another */
    public Fraction div(Fraction f) {
    	int num = numerator * f.getdenominator();
    	int den = denominator * f.getnumerator();
    	return reduce(new Fraction(num, den));
    }
    
    /* reduces fraction to be in simplest terms */
    private Fraction reduce(Fraction f) {
    int num = f.getnumerator();
    int den = f.getdenominator();
    int tempnum = num;
    int tempden = den; 

    while (num != den){
      if(num > den)
    	  num = num - den;
      else
    	  den = den - num;
    }      

   int nnum = tempnum / num ;
   int nden = tempden / num ;

   return new Fraction(nnum, nden);
    }
}
