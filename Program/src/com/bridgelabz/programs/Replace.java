/*
 1. User Input and Replace String Template “Hello <<UserName>>, How are you?”
  a. I/P​ -> Take User Name as Input. ​ Ensure UserName has min 3 char
  b. Logic​ -> Replace <<UserName>> with the proper name
  c. O/P​ -> Print the String with User Name
 */
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Username, NewUsername;

		Utility u = new Utility();
		System.out.println("Enter username:");
		Username = u.readText();
		System.out.print("Before Replacement:  ");
		String OldText = new String("Hello " + Username + ",How are you?");
		System.out.println(OldText);
		System.out.println("Enter new Username:");
		NewUsername = u.readText();
		String NewText = u.replaceAll(OldText, Username, NewUsername);
		System.out.println("After Replacement:  " + NewText);

	}

}
