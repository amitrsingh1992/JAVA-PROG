/*
 17. Insertion Sort
     a. Desc -> Reads in strings from standard input and prints them in sorted order.
        Uses insertion sort.
     b. I/P -> read in the list words
     c. Logic -> Use Insertion Sort to sort the words in the String array
     d. O/P -> Print the Sorted List
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		System.out.println("No. of element included in link list : ");
		int Input = u.readInteger();
		int[] p = new int[Input];
		System.out.println("Enter " + Input
				+ " no. of elements as given user input : ");
		for (int i = 0; i < Input; i++) {
			p[i] = u.readInteger();
		}
		System.out.println("The list of element included (Before Sorting): ");
		for (int element : p)
			System.out.print(element + "  ");
		System.out.println();
		System.out.println("The lis of element After Sorting ");
		u.insertionSort(p);

	}

}
