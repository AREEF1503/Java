package com.example2.standard;
import java.util.Scanner;
public class CountNoOfOddEven {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value :");
		int num=sc.nextInt();
		int e_num=0;
		int ecount=0;
		int ocount=0;
		
		while(num>0) {
			e_num=num%10;
			
			if(e_num%2==0) {
				ecount++;
			}
			else {
				ocount++;
			}
			num=num/10;
		}
		System.out.println("The Even Count Is = "+ecount);
		System.out.println("The Odd Count Is = "+ocount);

		
	}

}
