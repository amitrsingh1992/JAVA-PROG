/*
 18. Bubble Sort
     a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
     b. I/P -> read in the list ints
     c. O/P -> Print the Sorted List
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		int[] Mylist = { 1, 8, 12, 0, 4, 19, 41, 3 };
		System.out.println("The array list which is to be sorted :");
		for (int element : Mylist)
			System.out.print(element + "  ");
		System.out.println();
		System.out.println("The array after getting bubble sort :");
		u.arrayBubbleSort(Mylist);
	}

}
