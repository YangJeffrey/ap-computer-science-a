package mp1;

/* Student class has data members name, id, grade, and gpa. Constructor initializes student with name, id, grade and gpa. Accessor methods return the student's name, id, grade, or gpa. Modifier methods change the student's name or id. equals method returns true if ids are the same, otherwise it returns false. toString method returns student's name, id, gpa, and grade on separate lines with labels. */
public class Student {
	// data members include the student name, id, grade, and gpa
	private String name;
	private int id;
	private int grade;
	private double gpa;

	/* Constructor initializes student with name, id, grade and gpa */
	public Student(String n, int i, int l, double g) {
		name = n;
		id = i;
		grade = l;
		gpa = g;
	}

	/* returns the student's name */
	public String getname() {
		return name;
	}

	/* returns the student's id */
	public int getid() {
		return id;
	}

	/* returns the student's grade */
	public int getgrade() {
		return grade;
	}

	/* returns the student's gpa */
	public double getgpa() {
		return gpa;
	}

	/* changes the student's name */
	public void setname(String n) {
		name = n;
	}

	/* changes the student's id */
	public void setid(int i) {
		id = i;
	}

	/* equals method returns true if ids are the same, otherwise it returns false */
	public boolean equals(Student s) {
		if (s.getid() == id) {
			return true;
		} else {
			return false;
		}
	}

	/* toString returns student's name, id, gpa, and grade on separate lines with labels */
	public String toString(Student s) {
		return ("Name: " + s.getname() + "\n" + "ID: " + s.getid() + "\n" + "Grade: " + s.getgrade() + "\n" + "GPA: "
				+ s.getgpa() + "\n");
	}
}
