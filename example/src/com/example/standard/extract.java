package com.example.standard;
import java.util.Scanner;
public class extract {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int odd_count=0;
		int even_count=0;
		
		while(num!=0) {
			int r=num%10;
			if(r%2==0) {
				even_count++;
			} else {
				odd_count++;
			}
			num=num/10;
			
		}
		
		System.out.println("odd numbers :"+odd_count);
		System.out.println("even number :"+even_count);
		
	}

}
