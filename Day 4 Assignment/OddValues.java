package com.javacode;

import java.util.Scanner;

public class OddValues {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] num=new int[5];
		for(int i=0;i<5;i++)
		{
			int n=i+1;
			System.out.println("Enter number "+n+" : ");
			num[i]=sc.nextInt();	
		}
		int sum=0;
		for (int i=0;i<num.length;i++) 
		{  
	           sum=sum+num[i];  
	    }  
	    System.out.println("\nSum of all the values : " +sum);  
	}

}
