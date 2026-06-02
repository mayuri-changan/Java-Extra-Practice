package com.demo.recall;

import java.util.Scanner;

public class LinearSearchWithUnsortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter size here");
		int n=sc.nextInt();
		
		System.out.println("enter elements here");
		int arr[]=new int[n];
		
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("\n===array elements here===\n");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" "+"\n");
		}
		System.out.println("\n====enter key====\n");
		int key=sc.nextInt();
		int temp=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==key)
			{ 
				System.out.println("position is "+j);
				temp=1;
				break;
			}
			
		}
		if(temp==1)
		{
			System.out.println("key found");
		}
		else
		{
			System.out.println("key not found");
		}
		sc.close();

	}

}
