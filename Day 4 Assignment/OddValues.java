package com.javacode;

public class OddValues {

	public static void main(String[] args) {
		int num[]= {12,21,33,44,57};
		
		System.out.println("Odd numbers:");
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2!=0) 
			{
				System.out.println(num[i]);
			}
		}
	}
}


