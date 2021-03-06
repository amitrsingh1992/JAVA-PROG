/**
15. Question to find your number
    a. Desc -> takes a command-line argument N, asks you to think of a number
       between 0 and N-1, where N = 2^n, and always guesses the answer with n
       questions.
    b. I/P -> the Number N and then recursively ask true/false if the number is between
             a high and low value
    c. Logic -> Use Binary Search to find the number
    d. O/P -> Print the intermediary number and the final answer
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class NumberGuess {
	public static int stepReq(int Range) {
		int count = 0;
		while (Range >= 0) {
			Range = Range / 2;
			count++;
			if (Range == 0)
				break;
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		boolean check;
		System.out.println("Enter the range from between which "
				+ "you want to play GuessNumber Game.");
		int Range = Integer.parseInt(args[0]);

		System.out.println("So,your guess number should be between " + "0 - "
				+ Range);
		int Steps = stepReq(Range);
		System.out.println("According to range set your answer will "
				+ "come in " + Steps + " steps.");
		int first = 1;
		int last = Range / 2 + 1;
		int i = 2, j = 4;

		// Checking the numbers
		for (int k = 1; k < Steps; k++) {
			System.out.println("Is Your no Present Between " + (first - 1)
					+ " to " + (last - 1) + "??\ntrue or false");
			check = u.readBoolean();
			if (check) {
				Range = Range / 2;
				last = last - ((last - first + 1) / 2);
			} else {
				first = first + Range / i;
				last = last + Range / j;
				i = i + i;
				j = j + j;
			}
		}
		// final check between 2 numbers and printing Answer
		System.out.println("Is Your no is " + (first - 1)
				+ "?? \ntrue or false");
		check = u.readBoolean();
		if (check)
			System.out.println("Answer is: " + (first - 1));
		else
			System.out.println("Answer is: " + (last));
	}

}
