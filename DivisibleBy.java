package com.demo.conditional;
import java.util.Scanner;
public class DivisibleBy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		if(n%5==0&&n%11==0)
		{
			System.out.println("number didvisible by 5 and 11");
			
		}
		else
		{
			System.out.println("number not didvisible by 5 and 11");
			
		}
	}

}
