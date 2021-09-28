package com.example;

public class Evenvaluedfibonacci {
	public static void main(String[] args)
	{
		int num1=0,num2=1,num3,sum=0;
		int[] arr=new int[10];
		for(int i=0;i<10;i++)
		{
			num3=num1+num2;
			arr[i]=num3;
			num1=num2;
			num2=num3;
			System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum+=arr[i];
			}
		}
		System.out.println("Sum "+sum);
	}

}
