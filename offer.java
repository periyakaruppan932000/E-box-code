package com.example;
import java.util.*;
public class offer {

	public static void main(String[] args) {
		int p1,p2,p3;
        double offer1,offer2,total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost of product1");
        p1 =sc.nextInt();
        System.out.println("Enter the cost of product2");
        p2 =sc.nextInt();
        System.out.println("Enter the cost of product3");
        p3 =sc.nextInt();
        total=p1+p2+p3;
        offer1=total*0.2;
        if(p1<p2&&p1<p3)
        {
            offer2=p1;
        }
        else if(p2<p3)
        {
        offer2=p2;
        }
        else
        {
            offer2=p3;
        }
        if(offer1>offer2)
        {
        System.out.println("go for offer1");
    }
    else
    {
         System.out.println("go for offer2");    
    }
}


	}


