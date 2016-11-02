/*
 11. An Anagram Detection Example
    a. Description -> One string is an anagram of another if the second is simply a
       rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
    b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
    c. O/P -> The Two Strings are Anagram or not....
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FirstString, SecondString;
		boolean Result;

		
		Utility u = new Utility();
		System.out.print("Enter first String:");
		FirstString = u.readText();
		System.out.print("Enter Second String:");
		SecondString = u.readText();
		Result = u.IsAnagram(FirstString, SecondString);
		if (Result == true)
			System.out.println("The entered strings are anagram. ");
		else
			System.out.println("The entered strings are not anagram.");
	}

}
