package com.practice.from.basics;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, f = 0, s = 1, t = 0, sum = 0;
		System.out.println(f);
		System.out.println(s);
		for (int i = 1; i <= 5; ++i) {
			sum = sum + f;
			t = f + s;
			System.out.println(t);
			f = s;
			s = t;
			// System.out.println(sum);
		}
		System.out.println("===============================================================");
		System.out.println(sum);
	}

}
