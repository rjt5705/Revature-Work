package week2.day4;

import java.io.Serializable;

public class Employee implements Serializable {
	int empId;
	String empName;
	String department;
	double salary;
	
	private static final int serialVersionUID = 1;
	
	@Override
	public String toString() {
		return empId + " | " + empName + " | " + department + " | " + salary;
	}
	
	Employee(int empId, String empName, String department, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}
}
