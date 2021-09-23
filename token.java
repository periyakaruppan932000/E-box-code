package com.example;
import java.util.*;
public class token {

	public static void main(String[] args) {
	StringTokenizer str=new StringTokenizer("Hello Every One");
	while(str.hasMoreTokens()){
		System.out.println(str.nextToken(" "));
	}

	}

}
