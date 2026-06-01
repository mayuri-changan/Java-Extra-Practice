package com.demo.revision;
class Calculator{

	public int multi(int num1, int num2) {
	
		return num1*num2;
	}
		
	}

public class Test {
	
	public static void main(String []args) {
		
		int num1=10;
		int num2=20;
		//int multi=num1*num2;
		Calculator cal=new Calculator();
		int m=cal.multi(num1,num2);
		System.out.println(m);
		
	}
	
	

}
