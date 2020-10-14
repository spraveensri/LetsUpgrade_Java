package com.javacode;

import java.util.Scanner;

class Avenger
{
	Scanner sc=new Scanner(System.in);
	public String name;
	public int age;
	public String power;
	public String weapon;
	public String planet;

	public void getDetails()
	{
		System.out.println("Avenger Name : ");
		name=sc.next();
		System.out.println("Avenger Age : ");
		age =sc.nextInt();
		System.out.println("Avenger Power : ");
		power=sc.next();
		System.out.println("Avenger Weapon : ");
		weapon=sc.next();
		System.out.println("Avenger Planet : ");
		planet=sc.next();
	}
	public void displayDetails()
	{
		System.out.println("Avneger Name is " +name);
		System.out.println(name+"'s age is "+age);
		System.out.println(name+"'s power is "+power);
		System.out.println(name+"'s weapon is "+weapon);
		System.out.println(name+"'s planet is "+planet);
	}
}

public class AvengersInfo {

	public static void main(String[] args) {
		
		Avenger[] avn=new Avenger[5];
		for(int i=0;i<5;i++)
		{
			avn[i]=new Avenger();
			avn[i].getDetails();
			avn[i].displayDetails();
		}	
	}
}
