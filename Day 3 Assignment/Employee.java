package com.javacode;

import java.util.Scanner;

class Tax 
{
	public double display(double ann) 
	{
		double tax=0;
		if(ann<=100000)
		{
			tax = 0;
		}
		else if(ann<=200000)
		{
			tax =0.05*ann;
		}
		else if(ann<=300000)
		{
			tax =0.1*ann;
		}
		else if(ann<=400000)
		{
			tax =0.15*ann;
		}
		else if(ann<=500000)
		{
			tax =(0.2*ann);
		}
		else
		{
			tax =(0.25*ann);
		}
		return tax;
	}
}



public class Employee {

	public static void main(String[] args) {
		
		Tax t = new Tax();
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");
		String name = sc.nextLine();
		System.out.print("Date of Birth : ");
		int db = sc.nextInt();
		System.out.print("Month of Birth : ");
		int mb = sc.nextInt();
		System.out.print("Year of Birth : ");
		int yb = sc.nextInt();
		System.out.print("Monthly Salary : ");
		double sal = sc.nextDouble();
		
		double ann = 12*sal;
		int age= 2020-yb;
		System.out.println("Employee Name is : "+name);
		System.out.println("Employee age is : "+age);
		System.out.println("Annual Salary is : "+ann);
		System.out.println("Tax Amount is : "+t.display(ann));
	}
}