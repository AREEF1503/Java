package com.example.standard;
import java.util.Scanner;
public class product {
	String brand;
	String model;
	int yom;
	String id;
	product(String brand,String model,int yom){
		this.id=brand.substring(0,brand.length()/2)+yom+model;
		this.brand=brand;
		this.model=model;
		this.yom=yom;
		
	}
	public static void main(String[]args)
	{
		product p=new product("note8pro","mi",2024);
		System.out.println(p.id);
		
	}
	

}
