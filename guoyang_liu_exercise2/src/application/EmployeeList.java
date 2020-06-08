package application;

import java.util.ArrayList;

public class EmployeeList {
	 private static 	ArrayList<Employee> employeeList=new ArrayList<Employee>();
	   public static ArrayList<Employee> getList(){
		   return employeeList;
	   }
	   public static void clearList() {
		   employeeList.clear();
	   }
	   public static void addEmployee(Employee newEmp) {
		   employeeList.add(newEmp);
	   }

}
