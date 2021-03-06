/*
24. Palindrome-Checker
    a. Desc -> A palindrome is a string that reads the same forward and backward, for
       example, radar, toot, and madam. We would like to construct an algorithm to
       input a string of characters and check whether it is a palindrome.
    b. I/P -> Take a String as an Input
    c. Logic -> The solution to this problem will use a deque to store the characters of
       the string. We will process the string from left to right and add each character to
       the rear of the deque.
    d. O/P -> True or False to Show if the String is Palindrome or not.
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Palindrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		
		System.out.println("Enter operational string :");
		String Input = u.readText();
		System.out.println();
		System.out.println("Operational String is " + Input);
		System.out.println();
		String Output = u.deque(Input);
		if(Output.equals(Input))
			System.out.println("The entered String is Palindrome.");
		else 
			System.out.println("The entered String is not Palindrome.");
			
	}

}
