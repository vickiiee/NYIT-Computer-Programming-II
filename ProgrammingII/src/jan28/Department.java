package jan28;

//Vickie Wu
import java.util.List;

public class Department {
	private String name;
	private List<Student> students;

	public Department(String name, List<Student> students) {
		this.name = name;
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}
}