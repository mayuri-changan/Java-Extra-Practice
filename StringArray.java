package com.demo.revision;
public class StringArray {
	public static void main(String[] args) {
	String s="Mayuri";
	char arr[]=s.toCharArray();
	int j=s.length()-1;
	for(int i=0;i<=j;i++)	
	{
	char temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
		j--;
	}
	System.out.println(new String(arr));
}
}
