/* Jeffrey Yang - 4B
 * 9/6/2019
 * Chapter 3 programming problems
 */
import java.util.Scanner;

public class Main {

  static void cw313() {
      //3.13
  Scanner obj = new Scanner(System.in); 
	int num = obj.nextInt(); 
	while (num <= 0) { 
	num = obj.nextInt(); 
	}
    }

    static void cw314() {
      //3.14
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		final int SENTINEL = -99;
		while (num != SENTINEL) { 
			num = obj.nextInt(); 
			}
    }

    static void cw315() {
      		//3.15
		for (int i = 1; i < 100; i++) {
			System.out.println(i);
		}
    }

    static void cw316() {
      //3.16
		for (int i = 300; i > 2; i--) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
    }

    static void cw318() {
      		//3.18
		double high = Double.NEGATIVE_INFINITY;
		for(int i = 0; i < 10; i++) {
			Scanner obj = new Scanner(System.in);
			int num = obj.nextInt();
			if (num > high) {
				high = num;
			}
		}
		System.out.println(high);
    }

    static void cw319() {
      //3.19
		String obj = "name";
		int count = 0;
			if (obj.indexOf('a') >= 0) {
				count++;
			}
      System.out.println(count);
    }

    static void cw320() {
      //3.20
		String str = "hello world";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(str.length() - 1 - i));
		}
    }

    static void cw321() {
		//3.21
		String str = "hello world";
		for (int i = 0; i < str.length(); i+=2) {
			System.out.print(str.charAt(i));
		}
    }
	
	public static void main(String args[]) {

	}
}


