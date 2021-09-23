package com.example;
import java.util.*;
public class code {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Hello");
		str.append(" World");
		System.out.println(str);
		str.insert(5,"_Java");
		System.out.println(str);
		str.replace(5,6," ");
		System.out.println(str);
		System.out.println(str.charAt(6));
		str.delete(2,3);
		System.out.println(str);
		System.out.println(str.capacity());
		str.reverse();
		System.out.println(str);
		System.out.println(str.trim());
		
		
	}
	}
       