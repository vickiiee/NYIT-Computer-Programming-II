package feb11;
//Vickie Wu
//Feb11
public class Teacher extends Person{

	public Teacher(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	private int numCourses = 0;
	private String[] courses = {"","","",""};
	
	
	public String toString() {
		return "\nTeacher:"+ getName() + "(" + getAddress() + ")";
		
	}

	public boolean addCourse(String course) {
		
	
		/*for (int i = 0; i < 4; i++) {
			if (numCourses < 4) {
				if (courses[numCourses] == null) {
					courses[numCourses] = course;
					numCourses++;
					return true;
				} else if (courses[i].equals(course)) {
					System.out.println(course + " is already in.");
					return false;
				}
			} else {
				System.out.println("Maximum number of courses 4 reached. \n" + course + " cannot be added.");
			}

		}*/
		if(numCourses>=4) {
			return false;
		}
		
		for (int i = 0; i < 4; i++) {
			if (courses[i].equals(course)) {
				System.out.println(course + " is already in.") ;
				return false;
			}
		}
		courses[numCourses] = course;
		numCourses = numCourses+1;
		return true;
	}
	
	public boolean removeCourse(String course) {
		for(int i = 0; i < courses.length; i++) {
			if(courses[i].equals(course)) {
				courses[i] = "";
				System.out.println(course + " removed.");
				return true;
			}
		}
		System.out.println(course +" not found. Cannot be removed.");
		return false;
	}

	public void printCourses() {
		for(int i = 0; i < courses.length; i++) {
			if(courses[i]!= "") {
				System.out.print(courses[i]+"          ");
			}
		}
		
	}
}
