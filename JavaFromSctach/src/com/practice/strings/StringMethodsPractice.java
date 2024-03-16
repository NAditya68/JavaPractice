package com.practice.strings;

import java.util.Scanner;

public class StringMethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str; // Declarration of a string
		System.out.println("Enter a String");
		str = sc.next(); // Inputing a String
		System.out.println("HELLO" + str);
		System.out.println("=======================================");
		System.out.println("Now we will extract characters from a string");
		for (int i = 0; i < str.length(); i++) { // length() is a function to find out the str length
			System.out.println(str.charAt(i));
			// char at is the function used to split the charatcers
		}
		System.out.println("=======================================");
		System.out.println("COnverting to upper case" + str.toUpperCase());
		System.out.println("COnverting to lower case" + str.toLowerCase());
		System.out.println("=======================================");
		System.out.println("=======================================");
		System.out.println("Concating The String");
		String str1 = str.concat("Arjun"); // str.concat is the function
		System.out.println(str1);
		System.out.println("=======================================");
		// To check if string contains a pattern
		String str2 = null;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.contains("a")) {
				str2 = str1.replace('a', 'i');
				// replce is a function to replace a particular charcter with other

			}
		}
		System.out.println(str2);

	}

}
