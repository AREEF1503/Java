package com.qsp.threads;

public class test extends Thread {

	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}
	
	public static void main(String[]args) {
		test t=new test();
		t.start();
	}

}
