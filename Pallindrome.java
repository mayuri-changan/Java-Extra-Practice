package com.demo.loops;
import java.util.Scanner;
public class Pallindrome{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	int rem;
	int n=sc.nextInt();
	int org=n;
	int rev=0;
	while(n!=0)
	{ 
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(org==rev)
	{
		System.out.println("pallindrome");
	}
	else
	{
		System.out.println("not pallindrome");
	}
	
	}
}
