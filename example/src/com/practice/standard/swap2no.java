package com.practice.standard;
import java.util.Scanner;
public class swap2no 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("the value before swapping : "+num1+" "+num2);
			
		int num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("the value after swapping : "+num1+" "+num2);
		
		
	}

}
