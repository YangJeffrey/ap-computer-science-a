package mp1;

public class Student {
	private String name;
	private int id;
	private int grade;
	private double gpa;
	
	public Student(String n, int i, int l, double g) {
		name = n;
		id = i;
		grade = l;
		gpa = g;
	}
	
	public String getname() {
		return name;
	}
	
	public int getid() {
		return id;
	}
	
	public int getgrade() {
		return grade;
	}
	
	public double getgpa() {
		return gpa;
	}
	
	public void setname(String n) {
		name = n;
	}
	
	public void setid(int i) {
		id = i;
	}
	
    public boolean equals(Student s) {
        if (s.getid() == id) {
            return true;
        } else {
            return false;
        }
    }
    
    public void toString(Student s) {
    	System.out.println("Name: " + name);
    	System.out.println("ID: " + id);
    	System.out.println("Grade: " + grade);
    	System.out.println("GPA: " + gpa);
    }
}
