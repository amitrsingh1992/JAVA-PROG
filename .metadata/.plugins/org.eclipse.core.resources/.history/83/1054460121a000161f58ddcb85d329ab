import java.util.Scanner;
/*
 * Palindrome program in java
 */
public class Palindrome {
	public static boolean isPalindrome(String S1)
	{
		char[] A;
		boolean flag= true;
		S1 = S1.toUpperCase();
		A =S1.toCharArray();
		for(int i = 0, j = (S1.length()-1);i<j;i++,j-- )
		{
		if(A[i] == A[j])
		{
			flag = true;
			continue;
		}
		else
		{
			flag = false;
			break;
		}
		}
		return flag;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1;
		boolean i;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter Operational String :");
		S1 = n.nextLine();
		i = isPalindrome(S1);
		if(i == true)
			System.out.println("The given string is palidrome.");
		else
			System.out.println("The given string is not palidrome. ");
		n.close();

	}

}
