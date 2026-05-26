package com.demo.loops;
import java.util.Scanner;
public class Armstrong{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	
	int n=sc.nextInt();
	int t1=n;
	int length=0;
	while(t1!=0)
	{ 
		length=length+1;
		t1=t1/10;
		
	}
	int arm=0;
	int rem;
	
	int t2=n;
	
	while(t2!=0)
	{int mul=1;
		rem=t2%10;
		for(int i=1;i<=length;i++)
		{
			mul=mul*rem;
		}
		arm=arm+mul;
		t2=t2/10;
		
	}
	
	
	if(arm==n)
	{
		System.out.println(n+" "+"armstrong number");
	}
	else
	{
		System.out.println(n+" "+"not armstrong number");
	}
	
	}
}
