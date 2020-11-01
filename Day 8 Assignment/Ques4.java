package com.javacode;

import java.util.Scanner;

class Employee {
    Scanner in=new Scanner(System.in);
	String name;
	int age;
	int salary;
	String desination;
}
class Doctor extends Employee{
	public void getDetails() {
		System.out.print("Enter Doctor Name : ");
		name=in.nextLine();
		System.out.print("Enter Doctor Age : ");
		age=in.nextInt();
		System.out.print("Enter Doctor Salary : ");
		salary=in.nextInt();
		System.out.print("Enter Doctor Desination : ");
		desination=in.next();
	}
	public void displayDetails() {
		System.out.println("Doctor Details : ");
		System.out.println("Doctor Name : "+name);
		System.out.println("Doctor Age : "+age);
		System.out.println("Doctor Name : "+salary);
		System.out.println("Doctor Desination : "+desination);
	}
}
class Engineer extends Employee {
	public void getDetails() {
		System.out.println("Enter Engineer Name : ");
		name=in.next();
		System.out.println("Enter Engineer Age : ");
		age=in.nextInt();
		System.out.println("Enter Engineer Salary : ");
		salary=in.nextInt();
		System.out.println("Enter Engineer Desination : ");
		desination=in.next();
	}
	public void displayDetails() {
		System.out.println("Engineer Details : ");
		System.out.println("Engineer Name : "+name);
		System.out.println("Engineer Age : "+age);
		System.out.println("Engineer Name : "+salary);
		System.out.println("Engineer Desination : "+desination);
	}
}
class Pilot extends Employee {
	public void getDetails() {
		System.out.println("Enter Pilot Name : ");
		name=in.next();
		System.out.println("Enter Pilot Age : ");
		age=in.nextInt();
		System.out.println("Enter Pilot Salary : ");
		salary=in.nextInt();
		System.out.println("Enter Pilot Desination : ");
		desination=in.next();
	}
	public void displayDetails() {
		System.out.println("Pilot Details : ");
		System.out.println("Pilot Name : "+name);
		System.out.println("Pilot Age : "+age);
		System.out.println("Pilot Name : "+salary);
		System.out.println("Pilot Desination : "+desination);
	}
}
		   
public class Ques4 {
	public static void main(String args[]){
		Doctor[] d=new Doctor[3];
		for(int i=0;i<3;i++){
		    d[i]=new Doctor();
		    d[i].getDetails();
		    d[i].displayDetails();
		}
		Engineer[] e=new Engineer[3];
		for(int i=0;i<3;i++){
		    e[i]=new Engineer();
		    e[i].getDetails();
		    e[i].displayDetails();
		}
		Pilot[] p=new Pilot[3];
		for(int i=0;i<3;i++){
		    p[i]=new Pilot();
		    p[i].getDetails();
		    p[i].displayDetails();
		}
		
	}
}
