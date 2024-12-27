package com.example.standard;

import java.util.Random;

public class rand {
	public static void main(String[] args) {
		Random r=new Random();
		int rand=r.nextInt(10);
		System.out.println(rand);
	}

}
