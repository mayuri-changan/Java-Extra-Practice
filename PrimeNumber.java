package com.demo.conditional;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int i;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		
		 
		if(i==n)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}

	
	}

}
