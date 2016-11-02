/*
 3. Leap Year
    a. I/P -> Year, ensure it is a 4 digit number.
    b. Logic -> Determine if it is a Leap Year.
    c. O/P -> Print the year is a Leap Year or not
 */

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean Flag;
		Utility u = new Utility();
		System.out.println("Enter the year which is needed to be test :");
		int Year = u.readInteger();
		System.out.println();
		System.out.println("Entered year is " + Year);
		System.out.println();
		if (Year >= 1000 && Year <= 9999) {
			Flag = u.testLeap(Year);
			if (Flag == true)
				System.out.println("year " + Year + " is a Leap Year");
			else
				System.out.println("year " + Year + " is not a Leap Year");
		} else {
			System.out.println("Entered year is not 4digit input");
			System.out.println();
			main(args);
		}

	}

}