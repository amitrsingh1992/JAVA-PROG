package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Utility u = new Utility();
		
		System.out.println("Enter no. of rows needed to be print:");
	    int Rows = u.readInteger();
	System.out.println("Enter no. of cols needed to be print:");    
	    int Columns = u.readInteger();
	System.out.println("According to input user need "+ Rows +"X" + Columns + "matrix");
		int TwoD[][]= new int[Rows][Columns];
		int i, j, k ;
		for(i=0; i<Rows; i++)
			for(j=0; j<Columns; j++) 
			{
				System.out.println("Enter value for twoD["+i+"]["+j+"] :");
				k = u.readInteger();
				TwoD[i][j] = k;
				
			}
		System.out.println("The output of above given matrix's input are :");
		u.printTwoD(TwoD);
	}

}
