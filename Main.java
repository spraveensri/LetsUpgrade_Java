//package com.javacode;

class Employee {
	
	String name = "Praveensri";
	int age = 19;
	String city = "Erode";

	public void display() {	
		
		System.out.println("The Name is "+ name);
		System.out.println("The Age is " + age);
		System.out.println("The City is "+ city+"\n");	
	}
}
public class Main {

	public static void main(String[] args) {
		
		Employee e1= new Employee();
		e1.display();
		
		Employee e2= new Employee();
		e2.name="Praveen";
		e2.age= 20;
		e2.city="Chennai";
		e2.display();

	}
}
