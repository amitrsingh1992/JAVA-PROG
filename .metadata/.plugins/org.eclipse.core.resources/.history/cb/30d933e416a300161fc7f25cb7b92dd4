package com.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;

public class Utility {

	Scanner n = new Scanner(System.in);
	PrintWriter pw = new PrintWriter(System.out);

	// Use for printing whole content using print writer method
	public PrintWriter printWriter() {
		char[][] Input = new char[3][3];
		int i = 0, j = 0;

		pw.print(Input[i][j] + " ");
		pw.flush();
		return pw;

	}

	// Use for reading user input(complete line) through keyboard
	public String readText() {
		String Username = n.nextLine();
		return Username;
	}

	// Use for reading user input(Integer value) through keyboard
	public int readInteger() {
		int Input = n.nextInt();
		return Input;
	}

	// Use for getting Random integer value between two given range
	public int getRandomNumberInRange(int MinimumValue, int MaximumValue) {

		Random Random = new Random();
		return Random.nextInt((MaximumValue - MinimumValue) + 1) + MinimumValue;
	}

	// Use for Replacing source string from targeted string
	public String replaceAll(String Original, String Username,
			String NewUsername) {
		String Changed = Original.replaceAll(Username, NewUsername);
		return Changed;
	}

	// Use for checking whether Strings are Anagram or not
	public boolean IsAnagram(String FirstString, String SecondString) {
		String String1, String2;

		String1 = removeSpace(FirstString);
		String1 = String1.toUpperCase();
		String2 = removeSpace(SecondString);
		String2 = String2.toUpperCase();
		String1 = arrange(String1);
		String2 = arrange(String2);

		if (String1.equals(String2) == true) {
			return true;
		} else
			return false;
	}

	// Use for arranging string in AlphabeInputal order
	public String arrange(String Input) {
		char Temp;
		char[] A;
		A = Input.toCharArray();

		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					Temp = A[i];
					A[i] = A[j];
					A[j] = Temp;
				}
			}
		}
		String Output = new String(A);
		return Output;
	}

	// Use for Removing Space between String
	public String removeSpace(String Input) {
		int j = 0;
		char[] l1;
		String Output;
		l1 = Input.toCharArray();
		char[] NewInput = new char[50];
		for (int i = 0; i < l1.length; i++) {
			if (l1[i] != ' ') {
				NewInput[j] = l1[i];
				j++;
			}
		}
		Output = String.valueOf(NewInput);
		return Output;
	}

	// Use to sort the entered array using Bubble Sort
	public void arrayBubbleSort(int[] InputArray) {
		int Temp;
		for (int i = 0; i < InputArray.length - 1; i++) {
			for (int j = i + 1; j < InputArray.length; j++)

			{
				if (InputArray[i] > InputArray[j]) {
					Temp = InputArray[i];
					InputArray[i] = InputArray[j];
					InputArray[j] = Temp;
				}
			}
		}
		for (int k = 0; k < InputArray.length; k++)
			System.out.print(InputArray[k] + "  ");
	}

	// Use to sort the given array using Insertion sorting
	public void insertionSort(int[] Input) {

		int Temp;

		for (int j = 1; j < Input.length; j++) {
			for (int i = 0; i < j; i++) {
				if (Input[i] > Input[j]) {
					Temp = Input[i];
					Input[i] = Input[j];
					Input[j] = Temp;
				}

			}
		}
		for (int k = 0; k < Input.length; k++)
			System.out.print(Input[k] + "  ");
	}

	// Use for taking input from computer for cross game
	public char[][] computer(int rows, int cols, char[][] Input) {

		Input[rows][cols] = 'O';
		for (int i = 0; i < Input.length; i++) {
			for (int j = 0; j < Input.length; j++) {
				System.out.print(Input[i][j] + " ");
			}
			System.out.println();
		}
		return Input;
	}

	// Use for taking input from user for cross game
	public char[][] user(int rows, int cols, char[][] Input) {

		Input[rows][cols] = 'X';
		for (int i = 0; i < Input.length; i++) {
			for (int j = 0; j < Input.length; j++) {
				System.out.print(Input[i][j] + " ");
			}
			System.out.println();
		}

		return Input;
	}

	// Use for finding factorizing of the given input value
	public void factorizing(int Input) {
		if (Input == 1)
			System.out.print(Input);
		for (int i = 2; i <= Input; i++) {
			if (Input % i == 0) {
				Input = Input / i;
				System.out.print(i + " ");
				i--;
			}

		}
	}

	// Use for finding the win-loss percentage in the mentioned no. of trial
	public void gamble(int Cash, int Aim, int Trial) {
		final int Bid = 1;
		int Win = 0;
		int Loss = 0;
		double WinningPercentage;
		double LosingPercentage;

		for (int i = 0; i < Trial; i++) {
			int Money = Cash;
			boolean Flag = true;
			while (Flag) {

				Math.random();
				if (Math.random() < 0.5) {
					Money = Money + Bid;
					if (Money == Aim) {
						Win++;
						Flag = false;
					}
				} else {
					Money = Money - Bid;
					if (Money == 0) {
						Loss++;
						Flag = false;
					}
				}

			}
		}
		System.out.println("Total win = " + Win);
		System.out.println("Total Loss = " + Loss);

		WinningPercentage = (double) Win / Trial * 100;
		System.out
				.println("The winning percentage of Gambler while gambling is "
						+ WinningPercentage);
		LosingPercentage = (double) 100 - WinningPercentage;
		System.out
				.println("The losing percentage of Gambler while gambling is "
						+ LosingPercentage);

	}

	// Use for finding the harmonic value of the entered integer.
	public double harmonic(int Input) {
		double HarmonicValue = 0.0;
		for (int i = 1; i <= Input; i++) {
			HarmonicValue += (double) 1 / i;
		}
		return HarmonicValue;
	}

	// Use for testing whether the given input year is Leap year or not
	public boolean testLeap(int year) {
		boolean Flag = true;
		if (year % 4 == 0) {
			Flag = true;
		} else
			Flag = false;
		return Flag;
	}

	// Use for finding no. of notes in different denomination of the amount
	// given
	public int vending(int Amount) {
		int s;

		if (Amount >= 1000) {
			s = Amount / 1000;
			System.out.println("No. of 1000 rupees - " + s);
			return (vending(Amount % 1000));
		} else if (Amount < 1000 && Amount >= 500) {
			s = Amount / 500;
			System.out.println("No. of 500 rupees - " + s);
			return (vending(Amount % 500));
		} else if (Amount < 500 && Amount >= 100) {
			s = Amount / 100;
			System.out.println("No. of 100 rupees - " + s);
			return (vending(Amount % 100));
		} else if (Amount < 100 && Amount >= 50) {
			s = Amount / 50;
			System.out.println("No. of 50 rupees - " + s);
			return (vending(Amount % 50));
		} else if (Amount < 50 && Amount >= 10) {
			s = Amount / 10;
			System.out.println("No. of 10 rupees - " + s);
			return (vending(Amount % 10));
		} else if (Amount < 10 && Amount >= 5) {
			s = Amount / 5;
			System.out.println("No. of 5 rupees - " + s);
			return (vending(Amount % 5));
		} else if (Amount < 5 && Amount >= 2) {
			s = Amount / 2;
			System.out.println("No. of 2 rupees - " + s);
			return (vending(Amount % 2));
		} else {
			System.out.println("No. of 1 rupees - " + Amount);
			return Amount;
		}
	}

	// use for Printing 2D-Array
	public void printTwoD(int[][] matrix) {
		PrintWriter pw = new PrintWriter(System.out);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				pw.print(matrix[i][j] + " ");
				pw.flush();
			}
			System.out.println();
		}
	}

	// Use for finding power of 2 of input value.
	public int powerMethod(int Input) {
		int Output = 1;
		if (Input == 0)
			return 1;
		else {
			for (int i = 1; i <= Input; i++) {
				Output *= 2;
			}
			return Output;
		}

	}

	// use for reversing the string.
	public String deque(String Input) {
		char[] s = Input.toCharArray();

		char Temp;

		for (int i = 0, j = s.length - 1; i < j; i++, j--) {
			Temp = s[i];
			s[i] = s[j];
			s[j] = Temp;
		}
		String NewInput = String.valueOf(s);
		return NewInput;
	}
}
