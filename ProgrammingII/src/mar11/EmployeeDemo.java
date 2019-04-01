package mar11;

//Vickie Wu
//March 11

import java.util.ArrayList;

public class EmployeeDemo {
	public static void main(String[] args) {

		// create derived-class objects
		SalariedEmployee salariedE = new SalariedEmployee("John", "Smith", "111-11-1111", 800);
		HourlyEmployee hourlyE = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		CommissionEmployee commissionE = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionE = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",
				10000, .06, 500);

		// create ArrayList of four employees
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(salariedE);
		employees.add(hourlyE);
		employees.add(commissionE);
		employees.add(basePlusCommissionE);

		// output each Employee’s information and earnings
		System.out.println("Employees processed polymorphically:\n");

		for (int i = 0; i < employees.size(); i++)
			System.out.println(employees.get(i));

	}// end main

}

