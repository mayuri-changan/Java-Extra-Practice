package com.demo.revision;

public class Sum {

	
	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		int sum[]=new int[6];
		/*Student s[]=new Student[3];
		Employee e[]=new Employee[10];*/
		 
		for(int i=0;i<arr1.length;i++)
		{
			sum[i]=arr1[i]+arr2[i];
			System.out.println(sum[i]);
		}
		
		

	}

}
