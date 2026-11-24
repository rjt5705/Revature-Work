package week2.day4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeManagement {

	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
		
		employees[0] = new Employee(101, "Alice", "HR", 11000.00);
		employees[1] = new Employee(102, "Bill", "Finance", 22000.00);
		employees[2] = new Employee(103, "Tom", "Accounting", 33000.00);
		employees[3] = new Employee(104, "Grace", "Legal", 44000.00);
		employees[4] = new Employee(105, "Will", "R&D", 55000.00);
		
		try {
			FileOutputStream fos = new FileOutputStream("Employees.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(employees);
			System.out.println("Successfully Serialized");
		} catch(Exception e) {
			System.out.println(e);
		}
		
		Employee[] retrievedEmployees;
		
		try {
			FileInputStream fis = new FileInputStream("Employees.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            
            retrievedEmployees = (Employee[]) obj;
            
    		for(int i = 0 ; i < 5 ; i++) {
    			System.out.println(retrievedEmployees[i]);
    		}

        } catch (Exception e) {
        	System.out.println(e);
        }
		

		
	}

}
