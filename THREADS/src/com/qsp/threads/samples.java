package com.qsp.threads;

public class samples implements Runnable{

	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println(i);
			
			try{
				Thread.sleep(3000);
			}
			catch(Exception e){
			}
			}
		
	}

	public static void main(String[]args) {
		
		samples s=new samples();
		Thread t=new Thread(s);
		t.start();
		
		

	}

}
