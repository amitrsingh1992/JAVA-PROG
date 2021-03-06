/*
8. Coupon Numbers
   a. Description -> Given N distinct Coupon Numbers, how many random numbers do you
      need to generate distinct coupon number? This program simulates this random
      process.
   b. I/P -> N Distinct Coupon Number
   c. Logic -> repeatedly choose a random number and check whether it's a new one.
   d. O/P -> total random number needed to have all distinct numbers.
   e. Functions => Write Class Static Functions to generate random number and to
      process distinct coupons.
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Coupons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MinimumValue = 1;
		int Count = 0;
		int Temp;
		Utility u = new Utility();
		System.out.println("Enter no .of distict coupon needed :");
		int MaximumValue = u.readInteger();
		System.out.println("Entered no. of coupon needed is " + MaximumValue);
		int[] r = new int[MaximumValue];
		for (int i = 0; i < MaximumValue; i++) {
			r[i] = u.getRandomNumberInRange(MinimumValue, MaximumValue);
			Count++;
			Temp = r[i];
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (r[j] == Temp) {
						i--;
					}
				}

			}

		}
		for (int k = 0; k < r.length; k++)
			System.out.println(k + 1 + " . " + r[k]);
		System.out.println("The total number of count is " + Count);
	}

}
