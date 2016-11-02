import java.util.Scanner;
/*
Factors
a)Desc -> Computes the prime factorization of N using brute force.
b)I/P -> Number to find the prime factors
c)Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
d)O/P -> Print the prime factors of number N.
*/

public class Factorization {
	public static void factorizing(int fact)
	{
		if(fact == 1)
			System.out.print(fact);
		for(int i = 2; i<=fact;i++)
		{
			if(fact%i==0)
			{
				fact=fact/i;
				System.out.print(i+" ");
				i--;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);		
		System.out.println("Enter number whoes factorization needed to be done:");
		int f = n.nextInt();
		System.out.println("Entered number is " + f);
		System.out.println("Final output after factorizing is/are ");
		factorizing(f);
		n.close();
	}

}
