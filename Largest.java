
package com.example;
import java.util.*;
public class Largest {
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number to find largest prime factor:");
	long num=scan.nextLong();
	for(int i=2;i<num;i++)
	{
		while(num%i==0)
		{
			num=num/i;
			
		}
	}
	if(num>2)
	{
		System.out.println("The largest prime factor is : "+num);
	}
}
}