/*
10. Sum of three Integer adds to ZERO
	a. Desc -> A program with cubic running time. Read in N integers and counts the
		number of triples that sum to exactly 0.
	b. I/P -> N number of integer, and N integer input array
	c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
	d. O/P -> One Output is number of distinct triplets as well as the second output is to
		print the distinct trniplets. 
*/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		int MaxValue = 20;
		int MinValue = -20;

		System.out.println("Enter no. of elements to be included inorder to chk" + "triplet condition");

		int element = u.readInteger();
		int count = 0;
		int l = 1;
		System.out.println("The input values are:");
		int[] input = new int[element];
		for (int i = 0; i < input.length; i++) {
			System.out.print((i + 1) + ": element:");
			input[i] = MinValue + (int) (Math.random() * ((MaxValue - MinValue) + 1));
			System.out.println(input[i]);
		}
		System.out.println("Entered elements are :");
		for (int i = 0; i < input.length; i++)
			System.out.print(input[i] + " ");
		System.out.println();
		for (int i = 0; i < input.length; i++)
			for (int j = 0; j < input.length - 1; j++)
				for (int k = 0; k < input.length - 2; k++)
					if (input[i] + input[j] + input[k] == 0) {
						count++;
						if (count != 0) {
							System.out.print(l + ". " + "\t");
							System.out.println(input[i] + "\t" + input[j] + "\t" + input[k]);
							l++;
						}
					}
		if (count == 0)
			System.out.println("There is no triplet present in given number list.");
		else
			System.out.println("There is " + count + " triplet present in given number list.");
	}
}
