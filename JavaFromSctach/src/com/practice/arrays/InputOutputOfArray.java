package com.practice.arrays;

import java.util.Scanner;

public class InputOutputOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		// Here N is the array length
		int[] arr = new int[100];
		System.out.println("Enter the size");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("ENter the element number" + i);
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
