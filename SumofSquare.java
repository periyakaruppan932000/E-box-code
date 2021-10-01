package com.example;

public class SumofSquare {

	public static void main(String[] args) {
		int sumofsquare=sumofSquare(100);
		System.out.println("Sum of Square : "+sumofsquare);
		int squareofsum=squareofSum(100);
		System.out.println("Square of Sum : "+squareofsum);
		int result=squareofsum-sumofsquare;
		System.out.println("The result is : "+result);
		
	}
	
	public static int sumofSquare(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i*i; 
		}
		return sum;
	}
	public static int squareofSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum*sum;
	}

	}


