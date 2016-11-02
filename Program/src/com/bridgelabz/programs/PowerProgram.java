/*
 4. Power of 2
    a. Desc -> This program takes a command-line argument N and prints a table of the
       powers of 2 that are less than or equal to 2^N.
    b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
    c. Logic -> repeat until i equals N.
    d. O/P -> Print the year is a Leap Year or not.
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PowerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();

		int firstArgs;
		firstArgs = Integer.parseInt(args[0]);
		if (firstArgs <= 31) {
			for (int i = 0; i <= firstArgs; i++) {
				System.out.print(i + 1 + " . ");
				System.out.println("2^" + i + " = " + u.powerMethod(i));
			}

		}
	}

}
