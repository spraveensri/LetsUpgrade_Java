package com.javacode;

import java.util.Scanner;

class Profession {
    Scanner in=new Scanner(System.in);
	String name;
	int age;
	int salary;
	String desination;
}
class Doctor extends Profession{
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
class Engineer extends Profession {
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
class Pilot extends Profession {
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
		   
public class Ques2 {
	public static void main(String args[]){
		Doctor d = new Doctor();
		d.getDetails();
		d.displayDetails();
		Engineer e = new Engineer();
		e.getDetails();
		e.displayDetails();
		Pilot p = new Pilot();
		p.getDetails();
		p.displayDetails();
	}
}
