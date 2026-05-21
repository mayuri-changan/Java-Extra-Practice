package com.demo.basics;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		System.out.println("numbers are:" +a+" "+b);
		System.out.println("swap two numbers:");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b+" ");

	}

}
