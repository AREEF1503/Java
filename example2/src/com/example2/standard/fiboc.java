package com.example2.standard;
import java.util.Scanner;
public class fiboc 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("fibonacci number for : ");
		int num=sc.nextInt();
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<num;i++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			
			
		}
	}

}
