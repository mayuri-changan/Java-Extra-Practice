package com.demo.recall;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		System.out.println("elements");
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		int temp=0;
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			
		
		for(int j=0;j<arr.length-1-i;j++)
		{
			
			if(arr[j]>arr[j+1])		
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
				
				
			}
		if(flag==0)
		{
			break;
		}
					
		}
		   System.out.println("Sorted Array:");

	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        sc.close();
		}
		

	}
	


