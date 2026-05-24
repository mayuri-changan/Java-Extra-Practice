package com.demo.input;
import java.util.Scanner;
public class ConvertCelciusToFarhanehit{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter cel");
		int cel=sc.nextInt();
		int far=(cel*9/5)+32;
		System.out.println(far);
		

	}

}
