package com.practice.standard;
import java.util.Scanner;
public class stringpalindrome {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		String val=sc.nextLine();
		
		for(int i=val.length()-1;i>=0;i--)
		{
			System.out.print(val.charAt(i));
		}
		
	}

}
