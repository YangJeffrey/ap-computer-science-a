package mp1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class StudentMenuProgram {
	public static void main(String[] args) throws FileNotFoundException {
		List<Student> students = new ArrayList<Student>();
		Student s = new Student("Jeffrey", 2393, 10, 4.0);
		students.add(s);
		
		Scanner studentfile = new Scanner(new File("C:\\Users\\yangj\\eclipse-workspace\\MP1\\mp1\\mp1\\studentfile"));
		String name = studentfile.next();
		int id = studentfile.nextInt();
		int grade = studentfile.nextInt();
		double gpa = studentfile.nextDouble();
		
		Student s2 = new Student("Jeffrey", 2393, 10, 4.0);
		students.add(s2);
		
		toString();
		
		//System.out.println(name + " " + id + " " + grade + " " + gpa);
		
	}
	
	public static void printMenu() {
		System.out.println("Student Menu");
		System.out.println("1. Add");
		System.out.println("2. Delete");
		System.out.println("3. Change");
	}
	
	public static int menuOption() {
		Scanner obj = new Scanner(System.in);
		int option = obj.nextInt();
		return option;
	}
}
