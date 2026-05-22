package com.demo.conditional;
import java.util.Scanner;
public class Greater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		int n1=sc.nextInt();
		System.out.println("enter num2");
		int n2=sc.nextInt();
		if(n1>n2)
		{
			System.out.println("n1 greater");
		}
		else
		{
			System.out.println("n2 greater");
		}
		

	}

}
