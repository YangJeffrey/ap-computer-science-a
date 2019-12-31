package mp1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/* Student menu program allows you to 1) add a student 2) remove a student 3) change the name or id of a student 4) display all the students 5) exit out. */
public class StudentMenuProgram {
	public static void main(String[] args) throws FileNotFoundException {
		
		List<Student> StudentList = new ArrayList<Student>();

		Student s1 = new Student("Jeffrey", 2393, 10, 4.0);
		StudentList.add(s1);

		Scanner studentfile = new Scanner(new File("C:\\Users\\yangj\\eclipse-workspace\\MP1\\mp1\\mp1\\studentfile"));
		String name = studentfile.next();
		int id = studentfile.nextInt();
		int grade = studentfile.nextInt();
		double gpa = studentfile.nextDouble();
		
		Student s2 = new Student(name, id, grade, gpa);
		StudentList.add(s2);
		
		boolean running = true;
		int option;

		while (running == true) {
			printMenu();
			option = menuOption();
			//1. input name, id, grade, and gpa to create and add new student.
			if (option == 1) {
				Scanner newnameinput = new Scanner(System.in);
				Scanner newidinput = new Scanner(System.in);
				Scanner newgradeinput = new Scanner(System.in);
				Scanner newgpainput = new Scanner(System.in);
				
				System.out.print("name:");
				String newname = newnameinput.next();
				System.out.print("id: ");
				int newid = newidinput.nextInt();
				System.out.print("grade: ");
				int newgrade = newgradeinput.nextInt();
				System.out.print("gpa: ");
				double newgpa = newgpainput.nextDouble();
				StudentList.add(new Student(newname, newid, newgrade, newgpa));
				
			//2. input student name and confirm, find the student name and remove it.
			} else if (option == 2) {
				Scanner nameinput = new Scanner(System.in);
				System.out.print("student name:");
				String nameforchange2 = nameinput.next();
				System.out.print("delete (y/n): ");
				Scanner yesorno = new Scanner(System.in);
				String yn = yesorno.next();
				if (yn.equals("y")) {
					//iterator iterators through the list until it finds the name of the student, then removes the student.
					Iterator<Student> iter = StudentList.iterator();
					while (iter.hasNext()) {
						if (iter.next().getname().equals(nameforchange2)) {
							iter.remove();
						}
					}
				}
				
			//3. input student name, then choose to change either id or name. Input new id/name, if that id/name is not already taken, then change the id/name of the student. 
			} else if (option == 3) {
				Scanner nametochange = new Scanner(System.in);
				System.out.println("student name: ");
				String nameforchange = nametochange.next();
				Scanner idorname = new Scanner(System.in);
				System.out.print("change id or name: ");
				String in = idorname.next();
				boolean taken = false;
				if (in.equals("id")) {
					Scanner newidinput = new Scanner(System.in);
					System.out.println("new id: ");
					int newid = newidinput.nextInt();
					for (Student s : StudentList) {
						if (s.getid() ==  newid) {
							System.out.println("this id already exists");
							taken = true;
						}
					}
					if (!taken) {
						for (Student s : StudentList) {
							if (s.getname().equals(nameforchange)) {
								s.setid(newid);
							}
						}
					}
					} else if (in.equals("name")){
					Scanner newnameinput = new Scanner(System.in);
					System.out.println("new name: ");
					String newname = newnameinput.next();
					for (Student s : StudentList) {
						if (s.getname().equals(newname)) {
							System.out.println("this name already exists");
							taken = true;
						}
					}
					if (!taken) {
					for (Student s : StudentList) {
						if (s.getname().equals(nameforchange)) {
							s.setname(newname);
						}
					}
					}
				}
				taken = false;
				
			//4. display all of the students' name, id, grade, and gpa on separate lines.
			} else if (option == 4) {
				//for each loop loops through all the students and prints each one.
				for (Student s : StudentList) {
					System.out.println(s.toString(s));
				}
				
			//5. exit the program/while loop
			} else if (option == 5) {
				running = false;
			}
		}
	}

	/* print the student menu */
	public static void printMenu() {
		System.out.println("=====================Student Menu=====================");
		System.out.println("1. Add a Student");
		System.out.println("2. Delete a Student");
		System.out.println("3. Change Student Data");
		System.out.println("4. Display Student Data");
		System.out.println("5. Exit");
		System.out.println("======================================================");
	}
	
	/* get the menu option */
	public static int menuOption() {
		Scanner obj = new Scanner(System.in);
		int option = obj.nextInt();
		return option;
	}
}
