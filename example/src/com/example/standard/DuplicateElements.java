package com.example.standard;

import java.util.HashSet;

public class DuplicateElements {
	public static void main(String[]args)
	{
		String []arr= {"antman","deadpool","flash","antman"};
		
		HashSet<String> h=new HashSet<String>();
		
		for(String l :arr)
		{
			if(h.add(l)==false)
			{
				System.out.println("Found duplicate Element  : "+l);
			}
		}

	}

}
