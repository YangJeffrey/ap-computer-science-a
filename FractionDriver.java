package mp1;

public class FractionDriver {
	public static void main(String[] args) {
		Fraction a1 = new Fraction(1, 2);
		Fraction a2 = new Fraction (a1);
		Fraction b = new Fraction(4,5);
		
		System.out.println(a1.getnumerator());
		System.out.println(a1.getdenominator());
		System.out.println(b.getnumerator());
		System.out.println(b.getdenominator());
		
		System.out.println(a1.toString());
		System.out.println(b.toString());
		
		if (a1.equals(a2)) {
			System.out.println("a1 = a2");
		} else {
			System.out.println("a1 != a2");
		}
		if (a1.equals(b)) {
			System.out.println("a1 = b");
		} else {
			System.out.println("a1 != b");
		}
		
		System.out.println(a1.add(b));
		
		System.out.println(a1.sub(b));
		
		System.out.println(a1.mult(b));
		
		System.out.println(a1.div(b));
	}
}
