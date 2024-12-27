package com.practice.standard;

import java.util.Scanner;

public class reverb {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to rev ");
		int num=sc.nextInt();
		int rev=0;
		
		while(num!=0) {
			rev=num%10;
			
			System.out.print(rev);
			num=num/10;
		}
		
		
		
	}

}
