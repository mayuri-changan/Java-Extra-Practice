package com.demo.revision;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		int temp=0;
		for(int i= 2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
				
			}
			temp=1;
		}
		if(temp==1)
		{
			System.out.println("prime");
		}
			else
			{
				System.out.println("not prime");
			}
			
		}
	

	}


