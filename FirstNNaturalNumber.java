package com.demo.loops;
import java.util.Scanner;
public class FirstNNaturalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter num");
	int n=sc.nextInt();
	int sum=0;
	for(int i=0;i<=n;i++)
	{
		sum=n*(n+1)/2;
		
	}
	System.out.println("number is:"+n+" "+"sum is:"+sum);

	}

}
