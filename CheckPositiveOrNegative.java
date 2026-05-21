package com.demo.conditional;
import java.util.Scanner;
public class CheckPositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter inputs1");
		int n1=sc.nextInt();
		
		if(n1>0)
		{
			System.out.println("positive ");
		}
		
		else if(n1<0) 
		{
			System.out.println("negative ");
		}
		else
		{
			System.out.println("zero");
		}

	}

}
