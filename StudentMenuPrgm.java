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

		//s2.toString(s2);

		// System.out.println(name + " " + id + " " + grade + " " + gpa);

		Iterator<Student> i = students.iterator();

		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}

	}

	public void printMenu() {
		System.out.println("Student Menu");
	}

	public int menuOption() {
		Scanner obj = new Scanner(System.in);
		int option = obj.nextInt();
		return option;
	}
}
