package com.practice.standard;
import java.util.Scanner;
public class swappingof2num {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value-1 : ");
		int a=sc.nextInt();
		System.out.println("Enter value-2 : ");
		int b=sc.nextInt();
		
		System.out.println("before swapping the values are : "+a+" "+b);
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("after swapping the values are : "+a+" "+b);
		
		
		
	}

}
