package com.example.standard;
import java.util.Scanner;
public class factorial 
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int res=1;
		
		for(int i=1;i<=num;i++)
		{
			res=res*i;
			
		}
		System.out.println(res);
	}

}
