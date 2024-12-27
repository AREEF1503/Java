package com.example.standard;
import java.util.Scanner;
public class count {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the  number to count ");
		int num =sc.nextInt();
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		
		System.out.println("Enter the number " + count);
	}

}
