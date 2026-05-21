package com.demo.conditional;
import java.util.Scanner;
public class Consonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter letter");
		char ch=sc.next().charAt(0);
		if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
		{
			System.out.println("consonants");
		}
		else
		{
			System.out.println("vowel");
		}
		

	}

}
