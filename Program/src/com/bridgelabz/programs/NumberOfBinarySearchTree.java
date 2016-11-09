/**
 31. Number of Binary Search Tree
     a)You are given N nodes, each having unique value ranging from [1, N], how many different binary search tree can be created using all of them.
     b)Input:-First line will contain an integer, T, number of test cases. Then T lines follow, where each line represent a test case. Each test case consists a single integer, N, where N is the number of nodes in the binary search tree.
     c)Output:-For each test case, find the number of different binary search trees that can be created using these nodes. Print the answer modulo (108+7).
     Constraints
     1 <= T <= 1000
     1 <= N <= 1000 
 */
/*
Number of Binary Search Tree 
 */

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.BinarySearchUtility;

public class NumberOfBinarySearchTree {

	public static void main(String[] args) {

		int choice, data;
		long result;
		int count = 0;
		boolean x;
		Utility u = new Utility();
		BinarySearchUtility b = new BinarySearchUtility();
		while (true) {
			System.out.println("*************** MENU ***************");
			System.out.println("1. Insert in a Binary Search Tree");
			System.out.println("2. Display the Binary Search Tree");
			System.out.println("3. Count the number of BST possible");
			System.out.println("4. Search in a Binary Search Tree");
			System.out.println("5. Delete from Binary Search Tree");
			System.out.println("6. Quit ");
			System.out.print("Enter your choice: ");
			choice = u.readInteger();
			switch (choice) {

			case 1:
				System.out.print("Enter data you want to insert: ");
				data = u.readInteger();
				b.Insert(data);
				count++;
				break;

			case 2:
				System.out.println("The Original Tree: ");
				b.Display(b.root);
				System.out.println("");
				break;

			case 3:
				System.out.println("No. of elements in BST tree: " + count);
				result = b.Count(count);
				System.out.println("The Count is: " + result);
				break;

			case 4:
				System.out.print("Enter data you want to search: ");
				data = u.readInteger();
				x = b.Search(data);
				System.out.println("Data Found: " + x);
				break;

			case 5:
				System.out.print("Enter data you want to delete: ");
				data = u.readInteger();
				b.Delete(data);
				count--;
				break;

			case 6:
				System.out.println("Program Terminated");
				return;

			default:
				System.out.println("Invalid number of arguments");
			}
		}
	}
}