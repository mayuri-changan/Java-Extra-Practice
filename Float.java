package com.demo.input;
import java.util.Scanner;
public class Float {

	public static void main(StringInput[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter float");
		float num=sc.nextFloat();
		System.out.println("number is "+num);
        sc.close();
	}

}
