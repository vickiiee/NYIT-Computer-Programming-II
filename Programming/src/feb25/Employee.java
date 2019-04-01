package feb25;
//Vickie Wu
//Feb 25 2019
public class Employee {

	private String name;
	private String empNumber;
	private String hireDate;
	
	public Employee() {
		
	}
	
	public Employee(String name, String id, String hd) {
		this.name = name;
		this.empNumber = id;
		this.hireDate = hd;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public void setEmployeeNumber(String id) {
		this.empNumber=id;
	}
	
	public void setHireDate(String hd) {
		this.hireDate=hd;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmployeeNumber() {
		return empNumber;
	}
	
	public String getHireDate() {
		return hireDate;
	}
	
	public String toString() {
		return "Name: " + getName() + "\n"
				+ "Employee Number: " + getEmployeeNumber() + "\n"
				+ "Hire Date: " + getHireDate() + "\n"
				;
	}
}
