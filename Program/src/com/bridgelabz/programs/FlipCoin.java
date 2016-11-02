/*
 2. Flip Coin and print percentage of Heads and Tails
    a. I/P -> The number of times to Flip Coin. 
       Ensure it is positive integer .
    b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
       heads
    c. O/P -> Percentage of Head vs Tails
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		int head = 0;
		int tail = 0;

		System.out
				.println("Enter the value till which the coin should be flipped:");
		int t = u.readInteger();
		System.out.println("Entered value is " + t);
		for (int i = 0; i < t; i++) {
			Math.random();
			if (Math.random() < 0.5) {
				tail++;
			} else
				head++;
		}
		System.out.println("No. of times head occurrence is " + head);
		System.out.println("No. of times tail occurrence is " + tail);
		double percentaget = (double) head / t * 100.0;
		double percentageh = (double) 100.0 - percentaget;
		System.out
				.println("The percentage of head occurrence in above even is "
						+ percentageh);
		System.out
				.println("The percentage of tail occurrence in above even is "
						+ percentaget);

	}

}
