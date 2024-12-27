package com.practice.standard;
import java.util.Scanner;

public class primeno 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		int count =0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count==0)
		{
			System.out.println("the num is prime ");
		}
		else
			System.out.println("not a prime");
	}

}
