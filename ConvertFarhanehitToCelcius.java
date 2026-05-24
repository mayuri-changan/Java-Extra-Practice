package com.demo.input;
import java.util.Scanner;
public class ConvertFarhanehitToCelcius {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter far");
		int far=sc.nextInt();
		int cel=(far-32)*5/9;
		System.out.println(cel);
		

	}

}
