package com.infosys.sample2.chatbot1;

public class Employee {
	private Integer Employee_no;
	private String Employee_name;
	
	public  Employee(int number,String name){
		this.Employee_no=number;
		this.Employee_name=name;
	}
	
	public Integer getEmployee_no() {
		return Employee_no;
	}
	public void setEmployee_no(Integer employee_no) {
		Employee_no = employee_no;
	}
	public String getEmployee_name() {
		return Employee_name;
	}
	public void setEmployee_name(String employee_number) {
		Employee_name = employee_number;
	}
	
	public void printname(){
		System.out.println("Emp Number: "+this.getEmployee_no());
		System.out.println("Emp Name: "+this.Employee_name);
	}

}
