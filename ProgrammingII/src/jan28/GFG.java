package jan28;

import java.util.ArrayList;
import java.util.List;

class GFG {
	public static void main(String[] args) {
		Student s1 = new Student("Mia", 1, "CSE");
		Student s2 = new Student("Priya", 2, "CSE");
		Student s3 = new Student("John", 1, "EE");
		Student s4 = new Student("Rahul", 2, "EE");
		Student d = new Student("yjgh", 3, "CSE");
		Student t = new Student("Priya", 2, "CSE");
		Student r = new Student("John", 1, "EE");
		Student e = new Student("Rahul", 2, "EE");
		Student w = new Student("yjgh", 3, "CSE");

// making a List of  
// CSE Students. 
		List<Student> cse_students = new ArrayList<Student>();
		cse_students.add(s1);
		cse_students.add(s2);
		cse_students.add(d);
		cse_students.add(t);
		cse_students.add(r);
		cse_students.add(e);
		cse_students.add(w);

// making a List of  
// EE Students 
		List<Student> ee_students = new ArrayList<Student>();
		ee_students.add(s3);
		ee_students.add(s4);

		Department CSE = new Department("CSE", cse_students);
		Department EE = new Department("EE", ee_students);

		List<Department> departments = new ArrayList<Department>();
		departments.add(CSE);
		departments.add(EE);

// creating an instance of Institute. 
		Institute institute = new Institute("BITS", departments);

		System.out.print("Total students in institute: \n");

		System.out.print(institute.getTotalStudents());
	}
}