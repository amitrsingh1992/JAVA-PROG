//import java.util.Scanner;
/*
Power of 2 
a)Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
b)I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c)Logic -> repeat until i equals N.
 
 */
public class PowerProgram {
	public static int powerMethod(int power)
	{
		int s = 1;
		if(power == 0)
			return 1;
		else
			{
			for(int i=1;i<=power;i++)
				{
					s *= 2;
				}
			return s;
			}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstArgs;
		firstArgs = Integer.parseInt(args[0]);
		if(firstArgs<=31)
		{
			for(int i = 0 ; i <= firstArgs ; i++)
			{
				System.out.print(i+1+" . ");
				System.out.println("2^" + i + " = " +powerMethod(i));
			}
		
		}
		
	}

}
