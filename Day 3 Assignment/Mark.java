package com.javacode;

import java.util.Scanner;

public class Mark {

	public static void main(String[] args) {
		
		int sub1,sub2,sub3,sub4,sub5;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Subject 1 mark : ");
		sub1=sc.nextInt();
		System.out.print("Enter Subject 2 mark : ");
		sub2=sc.nextInt();
		System.out.print("Enter Subject 3 mark : ");
		sub3=sc.nextInt();
		System.out.print("Enter Subject 4 mark : ");
		sub4=sc.nextInt();
		System.out.print("Enter Subject 5 mark : ");
		sub5=sc.nextInt();
		
		int percent=(sub1+sub2+sub3+sub4+sub5)/5;
		
		if(percent>=90) 
		{
			System.out.println("Your Grade is A");
		}
		
		else if(percent>=70 && percent<90)
		{
			System.out.println("Your Grade is B");
		}
		
		else
		{
			System.out.println("Your Grade is C");
		}
		
		System.out.println("Your percentage is " + percent);
			
	}

}
