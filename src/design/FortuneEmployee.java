package design;

import java.text.ParseException;

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
	public static void main(String[] args) {
		
		EmployeeInfo employee = new EmployeeInfo("rachid", 01);
		//System.out.println(employee.employeeId());
		//System.out.println(employee.employeeName());
		EmployeeInfo.setCompanyName("PNT");
		//System.out.println(EmployeeInfo.getCompanyName());
		employee.setSalary(120000);
		//System.out.println(employee.getSalary());
		employee.setSsn("205.358.6250");
		//System.out.println(employee.getSsn());
		employee.setEmployeeId(01);
		employee.setEmail("rachid.yu@gmail.com");
		//System.out.println(employee.getEmail());
		employee.setDate_of_birth("01/27/1993");
		//System.out.println(employee.getDate_of_birth());
		employee.assignDepartment();
		employee.benefitLayout();
		employee.printInfo();
		int bonus=EmployeeInfo.calculateEmployeeBonus(120000, "best");
		System.out.println("your bonus is "+bonus);
		try {
			int pension = EmployeeInfo.calculateEmployeePension(5, 120000);
			System.out.println("your pension is "+ pension);
		} catch (ParseException e) {
			e.printStackTrace();
		}


	}

}
