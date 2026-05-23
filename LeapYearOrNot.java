package com.demo.conditional;
import java.util.Scanner;
public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		int n1=sc.nextInt();
		if(n1%400==0||n1%4==0 &&n1%100!=0)
		{
			System.out.println("n1 is leap yaer");
		}
		else
			
		{
			System.out.println("n1 is not leap yaer");
		}
		

	}

}
