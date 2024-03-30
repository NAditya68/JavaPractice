package com.practice.arraylist;

import java.util.*;

public class ArrayListMethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ali = new ArrayList();
		// This is how we declare an arraylist
		ali.add(14); // add() is used add elements in an array list
		ali.add(144);
		ali.add(36);
		ali.add(44);
		ali.add(2, 66);
		System.out.println(ali);
		System.out.println("The size of the list is");
		System.out.println(ali.size()); // size() is to find the size of the list
		Collections.sort(ali); // This is how we sort the array list
		System.out.println("The list after sorting is " + ali);
		System.out.println("Now lets try removing few entires from an array list");
		ali.remove(3); // .remove is to remove elements from the list
		System.out.println("After Removing" + ali);
	
		System.out.println("================================================================");
		
		ArrayList<String> als = new ArrayList(); // Sample arraylist of string
		als.add("Suva");
		als.add("arjun");
		als.add("Kamal");
		als.add("adi");
		System.out.println(als);
		System.out.println("Get method of arraylist");
		als.get(3); //get() is used to get n element at specified position
		String str;
		System.out.println("Enter a string");
		str = sc.next();
		als.add(str);
		System.out.println("List after used addition"+als);

		
	}

}
