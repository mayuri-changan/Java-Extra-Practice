package com.demo.revision;

import java.util.Scanner;

public class Student {
	int id;
	String name;
	Student(int idd,String nm)
	{
	this.id=idd;
	this.name=nm;
	
	}
	void display()
	{
		System.out.println("id:----"+id+"\nname:-----"+name);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int idd =sc.nextInt();
		System.out.println("enter name");
		String nm =sc.next();
		Student ss=new Student(idd,nm);
		ss.display();
		sc.close();
		

	}

}
