/*
6. Factors
   a.Desc -> Computes the prime factorization of N using brute force.
   b.I/P -> Number to find the prime factors
   c.Logic -> Traverse till i*i <= N instead of i <= N for efficiency​ .
   d.O/P -> Print the prime factors of number N.
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Factorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		System.out
				.println("Enter number whoes factorization needed to be done:");
		int f = u.readInteger();
		System.out.println("Entered number is " + f);
		System.out.println("Final output after factorizing is/are ");
		u.factorizing(f);
	}

}
