package com.practice.from.basics;

import java.util.*;

public class Table {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n = sc.nextInt();
		// TODO Auto-generated method stub
		System.out.println("This is to print the tables");
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}

	}

}
