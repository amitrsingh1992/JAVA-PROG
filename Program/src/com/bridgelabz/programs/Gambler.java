/*
7. Gambler
   a. Desc -> Simulates a gambler who start with $stake and place fair $1 bets until
      he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
      times he/she wins and the number of bets he/she makes. Run the experiment N
      times, averages the results, and prints them out.
   b. I/P -> $Stake, $Goal and Number of times
   c. Logic -> Play till the gambler is broke or has won
   d. O/P -> Print Number of Wins and Percentage of Win and Loss.
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Gambler {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		System.out
				.println("Enter total amount with which gambler want to play:");
		int total = u.readInteger();
		System.out.println("The Gambler having $" + total + " to gamble");
		System.out.println();
		System.out
				.println("Enter amount that Gambler's aim to win from gamble:");
		int goal = u.readInteger();
		System.out.println("The total amount that Gambler set as target is $"
				+ goal);
		System.out.println();
		System.out.println("Enter no. of trial to be performed : ");
		int trail = u.readInteger();
		System.out.println("The no. of trial to be made while gamble is "
				+ trail);
		u.gamble(total, goal, trail);
	}

}
