/* 
5. Harmonic Number
   a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
      (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
   b. I/P -> The Harmonic Value N. Ensure N != 0
   c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
   d. O/P -> Print the Nth Harmonic Value.
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		System.out
				.println("Enter value whoes harmonic value needed to be find:");
		int Input = u.readInteger();
		System.out.println("Entered value is " + Input);
		System.out.println();
		if (Input != 0) {
			double HarmonicValue = u.harmonic(Input);
			System.out.println("The " + Input + "th harmonic value is "
					+ HarmonicValue);
		} else {
			System.out.println("Enter value greater than 0");
			System.out.println();
			main(args);
		}
	}

}
