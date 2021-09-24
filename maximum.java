package com.example;
import java.util.*;
public class maximum {

	public static void main(String[] args) {
		double num1=2,num2=8,res,res2;
		maximum uobj=new maximum();
		res=uobj.findmin(num1,num2);
	    System.out.println("The min number is " +res); 
	    System.out.println(findmin(num1,num2));	 	
	}
	public static double findmin(double num1,double num2)
	{
	if(num1<num2)
	{
		return num1;
	}
	else
	{
		return num2;		
	}
	}
}



