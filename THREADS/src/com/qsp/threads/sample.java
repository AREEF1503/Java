package com.qsp.threads;

public class sample implements Runnable{
	
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(200);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[]args)
	{
		sample s=new sample();
		Thread t=new Thread(s);
		t.start();
	}

}
