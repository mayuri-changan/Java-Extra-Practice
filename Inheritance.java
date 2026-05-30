package com.demo.revision;

import java.util.Scanner;

public class Inheritance {
	
	int roll;
	String name;
	
	public Inheritance()
	{
		roll=0;
		name="";
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll");
		roll=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		
	}
	void output()
	{
		System.out.println("roll"+"\n"+roll+""+"name"+name);
	}
	public static void main(String[]args)
	{
		
	}
}
	class Bc extends Inheritance
	{
		int marks;
	
	void getData()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter marks");
		marks=sc.nextInt();
		
	}
	void display()
	{
		System.out.println("marks"+marks);
		
		
	}
	
	

	public static void main(String[] args) 
	{
		Bc bb=new Bc();
		
    //Inheritance ii=new Inheritance();
		
    
    bb.input();
    bb.output();
    bb.getData();
    bb.display();
  
    
	}
	}


