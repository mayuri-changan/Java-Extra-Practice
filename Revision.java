package com.demo.revision;

public class Revision {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		System.out.println("update");
		arr[2]=500;
		System.out.println(arr[2]);
		System.out.println("using for loop");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
			
		}



	}

}
