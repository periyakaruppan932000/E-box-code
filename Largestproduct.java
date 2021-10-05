package com.example;

public class Largestproduct {

	public static void main(String[] args) {
		String s="1234";
		final int adjacentLength=2;
		long largestProduct=0;
		for(int i=0;i<s.length()-adjacentLength+1;i++)
		{
			long product=1;
			for(int j=i;j<i+adjacentLength;j++)
			{
				product*=Integer.parseInt(s.substring(j,j+1));	
			}
			if(product>largestProduct)largestProduct=product;	
		}
		System.out.println(largestProduct);
	}

}
