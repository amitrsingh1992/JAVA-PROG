/*
25. Find the Fewest Notes to be returned for Vending Machine
    a. Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
               returned by Vending Machine. Write a Program to calculate the minimum number
               of Notes as well as the Notes to be returned by the Vending Machine as a
               Change
    b. I/P -> read the Change in Rs to be returned by the Vending Machine
    c. Logic -> Use Recursion and check for largest value of the Note to return change
                to get to minimum number of Notes.
    d. O/P -> Two Outputs - one the number of minimum Note needed to give the
              change and second list of Rs Notes that would given in the Change 
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility u = new Utility();

		System.out.println("Enter the amount which needed to be withdrawn :");
		int Input = u.readInteger();
		System.out.println("Entered withdrawing amount:" + Input);
		System.out.println();

		@SuppressWarnings("unused")
		int b = u.vending(Input);
		
		System.out.println("The no. of notes will be as follows:");
		

	}

}
