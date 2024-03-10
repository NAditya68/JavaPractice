package com.practice.from.basics;

public class SUmOfNat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				sum = sum + i;
			}

		}
		System.out.println("sum is  ");
		System.out.println("--------------------------------------------");
		System.out.println(sum);

	}

}
