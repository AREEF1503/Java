package com.standard;
import java.util.Scanner;
public class prime{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number :");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
			count++;
			}
		}
		if(count==0) {
			System.out.println("The Number Is Prime ");
		}
		else {
			System.out.println("The Number Is Not A Prime :");
		}
	}
}