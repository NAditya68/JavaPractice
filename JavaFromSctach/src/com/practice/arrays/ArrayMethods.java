package com.practice.arrays;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 13, 11, 14, 12, 15 };
		Arrays.sort(arr);
		System.out.println("========ARRAYS.SORT METHOD=================");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("========ARRAYS.COPY METHOD=================");
		int arr1[] = Arrays.copyOfRange(arr, 0, 3);
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		System.out.println("========ARRAYS.FILLE METHOD=================");
		Arrays.fill(arr, 8);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("========ARRAYS.COMPARE METHOD=================");
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 3 };
		int[] array3 = { 1, 3, 2 };
		boolean isEqual = Arrays.equals(array1, array2);
		System.out.println(isEqual);
		boolean isEqual1 = Arrays.equals(array1, array3);
		System.out.println(isEqual1);
	}

}
