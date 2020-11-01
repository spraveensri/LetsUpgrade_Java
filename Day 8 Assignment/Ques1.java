
import java.util.Scanner;

class Employee {
	String name;
	int age;
	int salary;
	String desination;
		   
	public void getDetails() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		name=in.next();
		System.out.println("Enter Employee Age : ");
		age=in.nextInt();
		System.out.println("Enter Employee Salary : ");
		salary=in.nextInt();
		System.out.println("Enter Employee Desination : ");
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

public class Ques1 extends Employee{
	public static void main(String args[]){
		System.out.println("Enter Employee Details");
		Ques1 obj = new Ques1();
		obj.getDetails();
		obj.displayDetails();
	}
}