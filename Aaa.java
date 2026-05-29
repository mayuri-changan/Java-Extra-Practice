package com.demo.revision;

import java.util.Scanner;

public class Aaa{
	int a;
	int m;
	Aaa()
	{
		a=0;
		m=0;
	}
	void input(Scanner sc)
	{
		
		System.out.println("enter a");
		a=sc.nextInt();
		System.out.println("enter m");
		m=sc.nextInt();
		
		
				
	}
	public static void main(String[] args) 
	{
		
	}
	}

class Bb extends Aaa
{
	
	
	void get()
	{
		System.out.println("addition"+(a+m));
	
		
		
	}
	public static void main(String[] args) 
	{
		
	}
}
class Cc extends Bb
{    

      void take()
{
    	  System.out.println("sub"+(a-m));
	

	
}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Cc cc=new Cc();
		cc.input(sc);
		cc.get();
		cc.take();
		
		sc.close();

	}



}


