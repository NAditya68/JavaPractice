package com.practice.from.basics;

import java.util.Scanner;

public class SumTillQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch, op;
		int n1, n2;
		do {
			System.out.println("Enter 2 numbers");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			System.out.println("Enter the operator");
			op = sc.next().charAt(0);
			if (op == '+') {
				System.out.println(n1 + n2);

			} else {
				System.out.println(n1 - n2);
			}
			System.out.println("Do u want to continue");
			ch = sc.next().charAt(0);
		} while (ch != 'y' && ch != 'Y');
		System.out.println("THANKS");

	}

}
