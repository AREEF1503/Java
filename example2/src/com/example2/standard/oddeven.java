package com.example2.standard;
import java.util.Scanner;
public class oddeven 
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array :");
	int size=sc.nextInt();
	int a[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
		System.out.println("enter the no :");
		a[i]=sc.nextInt();
	
		if(a[i]%2==0)
		{
			System.out.println("the even number is :");
			System.out.println(a[i]);
		}
	}
	
}
}
