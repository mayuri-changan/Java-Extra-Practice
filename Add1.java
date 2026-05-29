package com.demo.revision;

import java.util.Scanner;

public class Add1 {
	int num1;
	int num2;
	Add1()
	{
	 num1=0;
	 num2=0;
		
	}
	Add1(int x,int y)
	{
		num1=x;
		num2=y;
	}
	
	
	void display()
	{
		
		System.out.println(num1+num2);
	}

	public static void main(String[] args) {
		
		
			Scanner sc=new Scanner (System.in);
			System.out.println("enter x");
			int x=sc.nextInt();
			System.out.println("enter y");
			int y=sc.nextInt();
			
		
		Add1 aa=new Add1(x,y);
		//aa.input();
		aa.display();
		 sc.close();
	}
	

}
