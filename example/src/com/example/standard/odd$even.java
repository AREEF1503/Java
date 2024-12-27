package com.example.standard;
import java.util.Scanner;

public class odd$even {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of no");
		int num=sc.nextInt();
		int odd_count=0;
		int even_count=0;
		
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
			
				even_count++;
			}
			else {
				
				odd_count++;
			}
		}
		System.out.println("odd no are "+odd_count);
		System.out.println("even no are "+even_count);
	}

}
