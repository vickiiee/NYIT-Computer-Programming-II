package jan28;

import java.util.ArrayList;
import java.util.List;

//Vickie Wu
public class Institute {

	private List<Department> departments;
	private String name;

	public Institute(String name, List<Department> departments) {
		this.name = name;
		this.departments = departments;

	}

	public int getTotalStudents() {
		int total = 0;

		for (int x = 0; x < departments.size(); x++) {

			List a = new ArrayList<Student>();
			a = departments.get(x).getStudents();

			for (int i = 0; i < a.size(); i++) {
				total++;
			}
		}
		return total;

	}
}