package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws Exception {

		EmployeeInfo emp1 = new EmployeeInfo("Matthew Wells", 101);
		EmployeeInfo emp2 = new EmployeeInfo("Jesse Campbell", 102);
		EmployeeInfo emp3 = new EmployeeInfo("Dave Chappele", 103);
		EmployeeInfo emp4 = new EmployeeInfo("Kevin Hurt", 104);
		EmployeeInfo emp5 = new EmployeeInfo("Suraj Kapadia", 1005);

		emp1.assignDepartment("Human Resource");
		emp2.assignDepartment("Finance");
		emp3.assignDepartment("Information Technology");
		emp4.assignDepartment("Research & Development");
		emp5.assignDepartment("Production");

		emp1.setSalary(10000);
		emp1.calculateSalary(emp1.getSalary());
		emp2.setSalary(9000);
		emp2.calculateSalary(emp2.getSalary());
		emp3.setSalary(8000);
		emp3.calculateSalary(emp3.getSalary());
		emp4.setSalary(12000);
		emp4.calculateSalary(emp4.getSalary());
		emp5.setSalary(15000);
		emp5.calculateSalary(emp5.getSalary());

		emp1.aboutCompany();

		emp1.setNumberOfYears(10);





		


	}

}
