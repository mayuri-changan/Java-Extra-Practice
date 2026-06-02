package com.demo.recall;

import java.util.Scanner;

public class BinarySearchSortedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) 
        {
           System.out.println(arr[i]);
        }

        System.out.println("Enter key:");
        int key = sc.nextInt();

        int l = 0;
        int h = arr.length - 1;
        int temp = 0;
        int pos=0;
        while(l<=h)
        {
        	int m=(l+h)/2;
        	if(arr[m]==key)
        	{   temp=1;
        		pos=m;
        		System.out.println("===position"+m);
        		
        		break;
        		
        	}
        	else if(arr[m]<key)
        	{
        		l=m+1;
        		
        	}
        	else
        	{
        		h=m-1;
        	}
        	
        	
        	
        }

     if(temp==1)
     {
    	 System.out.println("found key");
     }
     else
     {
    	 System.out.println(" not found key");
     }

  
    }
}