package com.example.standard;
import java.util.Scanner;
public class numpalin {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==org_num) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
