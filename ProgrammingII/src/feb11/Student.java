package feb11;
//Vickie Wu
//Feb 18
public class Student extends Person{
	
	public Student(String name, String address) {
		super(name, address);
		numCourses = 0;
	}

//extends Person {
	
	private int numCourses;
	private String [] courses = new String [5];
	private int[] grades = new int [5];
	
	
	public String toString() {
		return"Student:"+ getName() + "(" + getAddress() + ")";
	}
	
	public void addCourseGrade(String course, int grade) {
		//System.out.print(numCourses);
		if(numCourses < 5) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;
		System.out.println(course+"     "+ grade + " added.");
		}else {
			System.out.println("Maximum number of courses 5 reached. \nCourse "+course+ " cannot be added.");
		}
	}
	
	public void printGrades() {
		for(int i = 0; i < 5; i++) {
			System.out.print(courses[i]+ "   "+grades[i] + " \n");
		}
	}
	
	public double getAverageGrade() {
		double avg = 0;
		for(int i = 0; i < grades.length; i++) {
			avg+=grades[i];
		}
		avg = avg/grades.length;
		return avg ;
		
		
	}
	
}
