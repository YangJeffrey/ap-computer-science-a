package mp1;
import java.util.Scanner;

public class acsl {
	public static void main(String[] args) {
		Scanner Nobj = new Scanner(System.in);
		for (int j = 0; j < 5; j++) {
			System.out.println("N = ");
			long N = Nobj.nextLong();
			Scanner Pobj = new Scanner(System.in);
			System.out.println("P = ");
			long P = Pobj.nextLong();
			String Nstr = Long.toString(N);
			int[] Narr = new int[Nstr.length()];
			int[] singleindexarr = new int[Nstr.length()];
			

			for (int i = 0; i < Nstr.length(); i++) {
				Narr[i] = Integer.parseInt(String.valueOf(Nstr.charAt(i)));
			}
			
			for (int i = 0; i < Nstr.length(); i++) {
				singleindexarr[i] = Integer.parseInt(String.valueOf(Nstr.charAt(i)));
			}
			
			
			for (int i = 0; i < Nstr.length()-P; i++) {
					Narr[i] = Math.abs(Narr[i] + Narr[(int) (Nstr.length()-P)]);
			}
			
			for (int i = (int) (Nstr.length()-P+1); i < Nstr.length(); i++) {
				if (i < Nstr.length()) {
						Narr[i] = Math.abs(Narr[i] - Narr[(int) (Nstr.length()-P)]);
				}
			}
			
			Narr[(int) (Nstr.length()-P)] = numprimefactors(N); 
			
			for (int i = 0; i < Nstr.length(); i++) {
				System.out.print(Narr[i]);
			}
	
			System.out.println();
		}
	}
	
	public static int numprimefactors(long n) {
		int count = 0;
		int num = (int) Math.ceil((double) n);
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0 && checkifprime(i)) {
				count++;
			}
			if (n % i == 0 && checkifprime(num/i)) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean checkifprime(int p) {
		boolean isprime = true;
		for (int i = 2; i <= Math.sqrt(p); i++) {
			if (p % i == 0) {
				isprime = false;
			}
		}
		return isprime;
	}
}

