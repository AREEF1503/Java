package com.qsp.threads;

public class main extends Thread{
	
	public void run() {
		
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
			
			try {
				Thread.sleep(150);
			}
			
			catch (Exception e)
			{
				e.printStackTrace();
				
			}
		}
	}
	public static void main(String[]args)
	{
		main m=new main();
		m.start();//Thread Execution
		
	}
}