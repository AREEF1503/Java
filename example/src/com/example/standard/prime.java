package com.example.standard;
import java.util.Scanner;
public class prime 
{
	public static void main(String[]args)
	{
		System.out.println("enter the number :");
	Scanner sc =new Scanner(System.in);
	int num=sc.nextInt();
	int count=0;
	for(int i=2;i<num;i++) 
	{
		if(num%i==0)
		{
			count++;
		}
		
	}
	if(count==0)
	{
		System.out.println("prime no");
	}
	else 
	{
		System.out.println("not a prime no");
	}
	}
	


}
