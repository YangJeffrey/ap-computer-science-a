package mp1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StudentMenuProgram {
	public static void main(String[] args) throws FileNotFoundException {
		List<Student> students = new ArrayList<Student>();

		Student s1 = new Student("Jeffrey", 2393, 10, 4.0);
		students.add(s1);

		Scanner studentfile = new Scanner(new File("C:\\Users\\yangj\\eclipse-workspace\\MP1\\mp1\\mp1\\studentfile"));
		String name = studentfile.next();
		int id = studentfile.nextInt();
		int grade = studentfile.nextInt();
		double gpa = studentfile.nextDouble();

		Student s2 = new Student("Jeffrey", 2393, 10, 4.0);
		students.add(s2);

		// s2.toString(s2);

		// System.out.println(name + " " + id + " " + grade + " " + gpa);

		//iterator
		Iterator<Student> i = students.iterator();

		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}

		//for each loop
		for (Iterator<Student> j = students.iterator(); j.hasNext();) {
			Student s = j.next();
			System.out.println(s);
		}

		boolean running = true;
		int option;

		while (running == true) {
			printMenu();
			option = menuOption();
			if (option == 1) {
				
			} else if (option == 2) {
				
			} else if (option == 3) {
				
			} else if (option == 4) {
				running = false;
			}
		}
	}

	public static void printMenu() {
		System.out.println("Student Menu");
		System.out.println("1. Add a Student");
		System.out.println("2. Delete a Student");
		System.out.println("3. Change Student Data");
		System.out.println("4. Exit");
	}

	public static int menuOption() {
		Scanner obj = new Scanner(System.in);
		int option = obj.nextInt();
		return option;
	}
}
