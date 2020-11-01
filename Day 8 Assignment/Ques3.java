package com.javacode;

import java.util.Scanner;

class Employee {
    Scanner in=new Scanner(System.in);
	String name;
	int age;
	int salary;
	String desination;
	
	public void getDetails() {
		System.out.print("Enter Employee Name : ");
		name=in.nextLine();
		System.out.print("Enter Employee Age : ");
		age=in.nextInt();
		System.out.print("Enter Employee Salary : ");
		salary=in.nextInt();
		System.out.print("Enter Employee Desination : ");
		desination=in.next();
	}
	public void displayDetails() {
		System.out.println("Employee Details : ");
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);
		System.out.println("Employee Name : "+salary);
		System.out.println("Employee Desination : "+desination);
	}
}
		   
public class Ques3 {
	public static void main(String args[]){
	    Employee[] e=new Employee[3];
		for(int i=0;i<3;i++){
		    e[i]=new Employee();
		    e[i].getDetails();
		    e[i].displayDetails();
		}
	}
}
