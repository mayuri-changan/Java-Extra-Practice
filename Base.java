package com.demo.revision;

import java.util.Scanner;

public class Base{
	int id;
	String name;
	Base()
	{
		id=0;
		name="";
	}
	void input()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter id");
		id=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		
	}
	void output()
	{
		System.out.println(id+name);
		
	}
	public static void main(String[] args) {
		
	}
}

	class Cb extends Base
	{
		int marks;
		
		
	
	void getData()
	{   Scanner sc=new Scanner (System.in);
		System.out.println("enter marks");
		marks=sc.nextInt();
		
		sc.close();
	}
	void display()
	{
		System.out.println(marks);
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		Cb cc=new Cb();
		cc.input();
		cc.output();
		cc.getData();
		cc.display();
		
		
		sc.close();
		
	}
	}


