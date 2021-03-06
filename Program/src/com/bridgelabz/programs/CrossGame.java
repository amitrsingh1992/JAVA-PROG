/*
 12. Cross Game or Tic-Tac-Toe Game
     a. Desc -> Write a Program to play a Cross Game or Tic-Tac-Toe Game. Player 1
        is the Computer and the Player 2 is the user. Player 1 take Random Cell that is
        the Column and Row.
     b. I/P -> Take User Input for the Cell i.e. Col and Row to Mark the ‘X’
     c. Logic -> The User or the Computer can only take the unoccupied cell. The Game
        is played till either wins or till draw...
     d. O/P -> Print the Col and the Cell after every step.
     e. Hint -> The Hints is provided in the Logic. Use Functions for the Logic...
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class CrossGame {
	static char[][] tic = { { '.', '.', '.' }, { '.', '.', '.' },
			{ '.', '.', '.' } };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();

		char choice = 'X';
		char comchoice = 'O';
		// char[][] cross= {{'.','.','.'},{'.','.','.'},{'.','.','.'}};
		int min = 0;
		int max = 2;

		System.out.println("User input :" + choice);
		System.out.println("Computer input : " + comchoice);
		System.out.println();
		System.out.println("The 2D array :-");
		for (int i = 0; i < tic.length; i++) {
			for (int j = 0; j < tic.length; j++) {
				u.printWriter();
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < 9; i++) {
			if (i == 0 || i % 2 == 0) {
				System.out
						.println("-------------------------------------------------------------------------------");
				int rows = u.getRandomNumberInRange(min, max);
				int cols = u.getRandomNumberInRange(min, max);
				if (tic[rows][cols] == 'X' || tic[rows][cols] == 'O') {
					i--;
					continue;
				}
				tic = u.computer(rows, cols, tic);
				if ((tic[0][0] == 'O' && tic[0][1] == 'O' && tic[0][2] == 'O')
						|| (tic[2][0] == 'O' && tic[2][1] == 'O' && tic[2][2] == 'O')
						|| (tic[0][0] == 'O' && tic[1][0] == 'O' && tic[2][0] == 'O')
						|| (tic[0][2] == 'O' && tic[1][2] == 'O' && tic[2][2] == 'O')
						|| (tic[2][0] == 'O' && tic[1][1] == 'O' && tic[0][2] == 'O')
						|| (tic[0][0] == 'O' && tic[1][1] == 'O' && tic[2][2] == '0')
						|| (tic[0][0] == 'O' && tic[2][1] == 'O' && tic[0][2] == 'O')
						|| (tic[1][0] == 'O' && tic[1][1] == 'O' && tic[1][2] == 'O')) {
					System.out.println("computer won the game.");
					break;
				}
			}

			else {
				System.out.println("User's turn:");
				System.out
						.println("Enter value in respective row-col ,user want to put:");
				int rows = u.readInteger();
				int cols = u.readInteger();
				if (tic[rows][cols] == 'X' || tic[rows][cols] == 'O') {
					i--;
					System.out
							.println("Block already occupied,put 'X' in unoccupied space:");
					continue;
				}
				tic = u.user(rows, cols, tic);
				if ((tic[0][0] == 'X' && tic[0][1] == 'X' && tic[0][2] == 'X')
						|| (tic[2][0] == 'X' && tic[2][1] == 'X' && tic[2][2] == 'X')
						|| (tic[0][0] == 'X' && tic[1][0] == 'X' && tic[2][0] == 'X')
						|| (tic[0][2] == 'X' && tic[1][2] == 'X' && tic[2][2] == 'X')
						|| (tic[2][0] == 'X' && tic[1][1] == 'X' && tic[0][2] == 'X')
						|| (tic[0][0] == 'X' && tic[1][1] == 'X' && tic[2][2] == 'X')
						|| (tic[0][0] == 'X' && tic[2][1] == 'X' && tic[0][2] == 'X')
						|| (tic[1][0] == 'X' && tic[1][1] == 'X' && tic[1][2] == 'X')) {
					System.out.println("user won the game.");
					break;
				}
				if (i == 9) {
					System.out.println("Its a draw game.");
				}
			}
		}
	}

}
