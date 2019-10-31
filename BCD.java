package mp1;

/* Binary Coded Decimal class stores large numbers as an array with each digit stored separately. The class can return the number of digits, return the nth digit (if greater than or equal to number of digits, returns 0), print the digits backwards with a comma after every index evenly divisible by 3, and add a digit to the number. */
public class BCD {
	
	//data member is the array of digits
	private int[] Digits;

	/* Constructor initializes the digits */
	public BCD(int bcdDigits[]) {
		Digits = bcdDigits;
	}

	/* Return the number of digits, the length of the array */
	public int numberOfDigits() {
		return Digits.length;
	}

	/* Return the nth digit, return 0 if n is greater than or equal of number of digits*/
	public int nthDigit(int n) {
		if (n >= numberOfDigits()) {
			return 0;
		} else {
			return Digits[n];
		}
	}
	
	/* Print the digits backwards with a comma after every index evenly divisible by 3 */
	public void print() {
		for (int i = numberOfDigits(); i >= 0; i--) {
			if (nthDigit(i) % 3 == 0) {
				System.out.print(nthDigit(i) + ", ");
			} else {
				System.out.print(nthDigit(i) + " ");
			}
		}
	}

	/* Add a digit to the digits array by increasing the size of the array and adding the new number */
	public void AddADigit(int newdigit) {	
		int[] ExtraDigit = new int[numberOfDigits() + 1];
		Digits = ExtraDigit;
		ExtraDigit[ExtraDigit.length] = newdigit;
	}
}

