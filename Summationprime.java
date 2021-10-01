package com.example;

public class Summationprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ct=0,n=0,i=2,j=1,sum=0;
		while(i<10)
		{
			j=1;
			ct=0;
			while(j<=i)
			{
				if(i%j==0)
					ct++;
					j++;
			}
			if(ct==2)
			{
				n++;
				sum+=i;
			}
			i++;
		}
			System.out.printf("%d ",sum);
	}



	}


