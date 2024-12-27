package com.example2.standard;

public class sumofelement 
{
	public static void main(String[]args)
	{
		int a[]= {1,2,3,4,5};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];		
		}
		System.out.println("the sum of element is : "+ sum);
	}

}
