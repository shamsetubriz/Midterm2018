package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
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
		double bonus101 = emp1.calculateEmployeeBonus(emp1.getSalary(), emp1.getNumberOfYears());
		emp2.setNumberOfYears(8);
		double bonus102 = emp2.calculateEmployeeBonus(emp2.getSalary(), emp2.getNumberOfYears());
		emp3.setNumberOfYears(5);
		double bonus103 = emp3.calculateEmployeeBonus(emp3.getSalary(), emp3.getNumberOfYears());
		emp4.setNumberOfYears(3);
		double bonus104 = emp4.calculateEmployeeBonus(emp4.getSalary(), emp4.getNumberOfYears());
		emp5.setNumberOfYears(1);
		double bonus105 = emp5.calculateEmployeeBonus(emp5.getSalary(), emp5.getNumberOfYears());

		EmployeeInfo.calculateEmployeePension(emp1.getSalary());

		Map<Integer, List<Object>> employeeInfo = new HashMap<Integer, List<Object>>();
		List<Object> employeeRecord101 = new ArrayList<Object>();
		employeeRecord101.add(emp1.employeeName());
		employeeRecord101.add(emp1.calculateSalary(emp1.getSalary()));
		employeeRecord101.add(bonus101);

		List<Object> employeeRecord102 = new ArrayList<Object>();
		employeeRecord102.add(emp2.employeeName());
		employeeRecord102.add(emp2.calculateSalary(emp2.getSalary()));
		employeeRecord102.add(bonus102);

		employeeInfo.put(101, employeeRecord101);
		employeeInfo.put(102, employeeRecord102);

		/*ConnectDB connectDB = new ConnectDB();


		connectDB.createTableFromStringToMySql("employee_record", "employee_id", "employee_info");

		for (Integer obj : employeeInfo.keySet()) {
			for (Object obj1 : employeeInfo.get(obj)) {
				System.out.println(obj1);
				List<String> list1 = new ArrayList<>();
				list1.add(obj.toString());
				list1.add(obj1.toString());
				connectDB.InsertDataFromArrayListToMySql(list1, "employee_record", "employee_id", "employee_info");
			}

		}
		System.out.println("Reading from database");
		List<String> empRec = connectDB.readDataBase("employee_record", "employee_id", "employee_info");
		for (String emp : empRec) {
			System.out.println(emp);
		}*/




	}
}