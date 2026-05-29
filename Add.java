package com.demo.revision;

import java.util.Scanner;

public abstract class Add {
	int num1;
	int num2;
	
	void getData()
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("enter num1");
		 num1=sc.nextInt();
		System.out.println("enter num2");
		 num2=sc.nextInt();
		
	}
	void putData()
	{
	
		
		System.out.println(num1+num2);		
		
	}
	
	abstract void test();

	public static void main(String[] args) 
	{
		//Add a=new Add();
		//a.getData();
		//a.putData();
				
	
    }
	
}
class ImplementAbstract extends Add{
	void test() {
		System.out.println("test");
	}
	public static void main(String []args) {
		ImplementAbstract Ib=new ImplementAbstract();
		Ib.getData();
		Ib.putData();
		Ib.test();
	}
}
	

