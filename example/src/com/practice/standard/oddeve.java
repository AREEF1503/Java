package com.practice.standard;
import java.util.Scanner;

public class oddeve 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		
		if(num>0)
		{
			if(num%2==0)
			{
				System.out.println("even number");
			}
			else
			{
				System.out.println("odd number");
			}
		}
		
	}

}
