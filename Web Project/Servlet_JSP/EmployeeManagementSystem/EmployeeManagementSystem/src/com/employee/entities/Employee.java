package com.employee.entities;

public class Employee {
	private long id;
	private String name;
	private String designation;
	private int age;
	private String dob;
	private String joinedDate;
	private String salary;

	public Employee(long id, String name, int age, String joinedDate, String salary, String dob, String designation) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.joinedDate = joinedDate;
		this.salary = salary;
		this.dob = dob;
		this.designation = designation;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(String joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", age=" + age + ", dob="
				+ dob + ", joinedDate=" + joinedDate + ", salary=" + salary + "]";
	}

}
