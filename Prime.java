package com.demo.loops;
import java.util.Scanner;
public class Prime{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	
	int n=sc.nextInt();
	int temp=0;
for(int i=2;i<n-1;i++)
	
	{ 
	if(n%i==0)
	{
		temp=temp+1;
	}
	}
	if(temp==0)
	{
		System.out.println("prime");
		
	}
	else
	{
		System.out.println("  not prime");
	}
		
	}
		
	}

