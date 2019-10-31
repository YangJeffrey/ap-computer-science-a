package mp1;

public class BCDDriver {
public static void main(String[] args) {
	BCD zero = new BCD(new int[] {0});
	BCD one = new BCD(new int[] {1});
	BCD two = new BCD(new int[] {1,2});
	BCD four = new BCD(new int[] {1,2,3,4});
	BCD six = new BCD(new int[] {1,2,3,4,5,6});
	BCD seven = new BCD(new int[] {1,2,3,4,5,6,7});
	
	zero.print();
	System.out.println();
	one.print();
	System.out.println();
	two.print();
	System.out.println();
	four.print();
	System.out.println();
	six.print();
	System.out.println();
	seven.print();
	System.out.println();
	
	System.out.println("-----------------------------------------------------");
	
	System.out.println(zero.numberOfDigits());
	System.out.println(one.numberOfDigits());
	System.out.println(two.numberOfDigits());
	System.out.println(four.numberOfDigits());
	System.out.println(six.numberOfDigits());
	System.out.println(seven.numberOfDigits());
	
	
	System.out.println("-----------------------------------------------------");
	
	System.out.println(zero.nthDigit(0));
	System.out.println(zero.nthDigit(1));
	System.out.println(zero.nthDigit(2));
	
	System.out.println("--------------------------");
	
	System.out.println(one.nthDigit(0));
	System.out.println(one.nthDigit(1));
	System.out.println(one.nthDigit(2));
	
	System.out.println("--------------------------");
	
	System.out.println(four.nthDigit(0));
	System.out.println(four.nthDigit(2));
	System.out.println(four.nthDigit(4));
	System.out.println(four.nthDigit(5));

	System.out.println("-----------------------------------------------------");
	
	zero.AddADigit(1);
	zero.print();
	System.out.println();
	one.AddADigit(2);
	one.print();
	System.out.println();
	four.AddADigit(5);
	four.print();
	System.out.println();
	four.AddADigit(6);
	four.print();

}
}
