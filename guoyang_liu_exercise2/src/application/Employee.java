package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
	private int id;
	public int getId(){
		return id;
	}
	public void setId(int newId) {
		id=newId;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name=newName;
	}
	private LocalDate joinDate;
	public LocalDate getDate() {
		return joinDate;
	}
	public void setDate(LocalDate NewDate) {
		joinDate=NewDate;
	}
	private double salary;
	public double getSalary(){
		return salary;
	}
	public void setSalary(double newSalary) {
		salary=newSalary;
	}
	public Employee(int id,String name,LocalDate date,double salary) {
		this.setId(id);
		this.setName(name);
		this.setDate(date);
		this.setSalary(salary);
	}
	public String toString() {
		
		return String.format("Id: %s, Name: %s, Join Date: %s, Salary: %.2f",
				String.format("%03d",this.getId()),this.getName(),this.getDate().format(DateTimeFormatter.ofPattern("dd-MMM-yy")),this.getSalary());
	}

}
