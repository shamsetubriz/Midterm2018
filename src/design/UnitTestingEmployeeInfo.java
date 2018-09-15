package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        EmployeeInfo emp10 = new EmployeeInfo("Tofael vai", 110 );
        emp10.setSalary(12000);
        emp10.setNumberOfYears(10);
        Assert.assertEquals(12000.0,emp10.getSalary());
        Assert.assertEquals(10,emp10.getNumberOfYears());
        Assert.assertEquals(110,emp10.getEmployeeId());

    }
}
