package com.demo.input;
import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		float r =sc.nextFloat();
		float areaOfCircle=3.14f*r*r;
		System.out.println(areaOfCircle);
	}

}
