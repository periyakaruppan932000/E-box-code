package com.example;

public class Largestpalindrome {

	public static void main(String[] args) {
		int max=0;
		for(int i=10;i<=99;i++)
		{
			
			for(int j=10;j<=99;j++)
			{
				if((i*j>max)&&(i*j==reverse(i*j)))
				{
					max=i*j;	
				}
			}
		}
		System.out.println(max);
		
	}
	public static int reverse(int n)
	{
		int rem=0,rev=0;
		while(n>1)
		{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		return rev;
	}
	}


