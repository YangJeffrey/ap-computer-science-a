package mp1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
//print all or one student
public class StudentMenuProgram {
	public static void main(String[] args) throws FileNotFoundException {
		List<Student> StudentList = new ArrayList<Student>();

		Student s1 = new Student("Jeffrey", 2393, 10, 4.0);
		StudentList.add(s1);
		
		Student s2 = new Student("Daniel", 0406, 10, 2.7);
		StudentList.add(s2);

		Scanner studentfile = new Scanner(new File("C:\\Users\\yangj\\eclipse-workspace\\MP1\\mp1\\mp1\\studentfile"));
		String name = studentfile.next();
		int id = studentfile.nextInt();
		int grade = studentfile.nextInt();
		double gpa = studentfile.nextDouble();
		Scanner indexinput = new Scanner(System.in);
		int index;
		boolean running = true;
		int option;
		
		Student s3 = new Student(name, id, grade, gpa);
		StudentList.add(s3);

		// iterator
//		Iterator<Student> i = StudentList.iterator();

		while (running == true) {
			printMenu();
			option = menuOption();
			if (option == 1) {
				Scanner newnameinput = new Scanner(System.in);
				System.out.print("name:");
				String newname = newnameinput.next();
				Scanner newidinput = new Scanner(System.in);
				System.out.print("id: ");
				int newid = newidinput.nextInt();
				Scanner newgradeinput = new Scanner(System.in);
				System.out.print("grade: ");
				int newgrade = newgradeinput.nextInt();
				Scanner newgpainput = new Scanner(System.in);
				System.out.print("gpa: ");
				double newgpa = newgpainput.nextDouble();
				StudentList.add(new Student(newname, newid, newgrade, newgpa));
			} else if (option == 2) {
				System.out.print("student index:");
				index = indexinput.nextInt();
				System.out.print("delete? (y/n): ");
				Scanner yesorno = new Scanner(System.in);
				String yn = yesorno.next();
				if (yn.equals("y")) {
					StudentList.remove(index);
				}
			} else if (option == 3) {
				System.out.print("id or name?");
				Scanner idorname = new Scanner(System.in);
				String in = idorname.next();
				//check if id already exists
				//need a way to main navigation
				//check if already exists
				if (in.equals("id")) {
					Scanner newidinput = new Scanner(System.in);
					int newid = newidinput.nextInt();
					
					
				} else {
					Scanner newnameinput = new Scanner(System.in);
					String newname = newnameinput.next();
					
				}
			} else if (option == 4) {
				//for each loop
				for (Student s : StudentList) {
					System.out.println(s.toString(s));
				}
			} else if (option == 5) {
				running = false;
			}
		}
	}

	public static void printMenu() {
		System.out.println("=====================Student Menu=====================");
		System.out.println("1. Add a Student");
		System.out.println("2. Delete a Student");
		System.out.println("3. Change Student Data");
		System.out.println("4. Display Student Data");
		System.out.println("5. Exit");
		System.out.println("======================================================");
	}
	
	public static int menuOption() {
		Scanner obj = new Scanner(System.in);
		int option = obj.nextInt();
		return option;
	}
}
