package com.example;

public class builder {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("Hello");
		str.append(" World");
		System.out.println(str);
		str.insert(5,"_Java");
		System.out.println(str);
		str.replace(5,6," ");
		System.out.println(str);

	}

}
