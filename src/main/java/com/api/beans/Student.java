package com.api.beans;

public class Student {
	
	String name;
	int age;
	String registrationNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public int getSize(int a, int b, int c) {
		int sum = 0;
		sum = a + b + c;
		return sum;
	}
}
