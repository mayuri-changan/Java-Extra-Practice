package com.demo.conditional;
import java.util.Scanner;
public class GreaterThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		int n1=sc.nextInt();
		System.out.println("enter num2");
		int n2=sc.nextInt();
		System.out.println("enter num3");
		int n3=sc.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println("n1 greater");
		}
		else if(n2>n1&&n2>n3)
		{
			System.out.println("n2 greater");
		}
		else
		{
			System.out.println("n3 greater");
		}
		

	}

}
