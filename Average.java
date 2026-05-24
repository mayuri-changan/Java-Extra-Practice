package com.demo.input;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();;
		int n3=sc.nextInt();;
		System.out.println(n1+" "+n2+" "+n3);
		int sum=n1+n2+n3;
		System.out.println("sum is:"+sum);
		int average=sum/3;
		System.out.println("average is:"+average);
		

	}

}
