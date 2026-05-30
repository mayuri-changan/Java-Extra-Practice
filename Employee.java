package com.demo.revision;

import java.util.Scanner;

public class Employee {
	int empid;
	String empname;
	Employee()
	{
		empid=0;
		empname="";
	}
	void inputs()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter empid");
		empid=sc.nextInt();
		System.out.println("enter empname");
		empname=sc.next();
	}
	void output()
	{
		System.out.println("here is id and name----\n"+empid+"\n"+empname);
	}

	public static void main(String[] args) {
		
     Employee emp=new Employee();
     emp.inputs();
     emp.output();
    
}

}
