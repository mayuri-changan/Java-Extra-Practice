package com.demo.revision;

import java.util.Scanner;

public class Aa{
	int a;
	Aa()
	{
		a=0;
	}
	void input(Scanner sc)
	{
		
		System.out.println("enter a");
		a=sc.nextInt();
		
				
	}
}
class B extends Aa
{
	int b;
	void get(Scanner sc)
	{
		
		System.out.println("enter b");
		b=sc.nextInt();
		
	}
}
class C extends B
{     int c;

      void take(Scanner sc)
{
	
	System.out.println("enter c");
	c=sc.nextInt();
	
}

  	void display() {
  		System.out.println("total addition is");
  		System.out.println(a+b+c);
  		
  		
  	}
	


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		C cc=new C();
		cc.input(sc);
		cc.get(sc);
		cc.take(sc);
		cc.display();
		sc.close();

	}



}


