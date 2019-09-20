import java.util.Scanner;

public class arrays {

    public static void main(String args[]) {
    	String[] names = new String [3];
    	int[] grades = new int [3];
    	
    	for (int i = 0; i < 3; i++) {
    		Scanner obj1 =  new Scanner(System.in);
    		System.out.println("Name");
    		String name = obj1.nextLine();	
    		names[i] = name;
    		Scanner obj =  new Scanner(System.in);
    		System.out.println("Grade");
    		int grade = obj.nextInt();
    		grades[i] = grade;	
    	}
    	System.out.println("Name     Grade");
    	for (int i = 0; i < 3; i++) {
        		System.out.println(names[i] + " " + grades[i]);
    	}
    	
    }
}
