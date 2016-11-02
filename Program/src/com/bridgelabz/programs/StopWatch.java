package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u = new Utility();
		
		long Sum = 0;
		
		System.out.println("Enter input's value : ");
		int Input = u.readInteger(); 
		System.out.println("The loop will run " + Input + "times");
		double Start = System.currentTimeMillis();
		for(int i = 0; i<Input ;i++ )
		{
			Sum += i;
			System.out.println("Sum = " + Sum);
		}
		double Stop =  System.currentTimeMillis();
		double Elapsed_time;
		Elapsed_time = Stop-Start;
		Elapsed_time /= 1000;
		System.out.println("Time taken for completing above task is " );
		System.out.println(Elapsed_time + "secs");
	}

}
