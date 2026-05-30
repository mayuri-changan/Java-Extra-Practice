package com.demo.revision;

public class AdvanceForLoop {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		
		System.out.println("update");
		arr[2]=500;
		System.out.println(arr[2]);
		System.out.println("using for loop");
		for(int a:arr)
		{
			System.out.println(a);
		}
	
	}
}


	


