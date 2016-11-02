/*
 * Anagram Trial Program
 */
import java.util.Scanner;

public class Anagram {
	public static boolean isAnagram(String s1, String s2) {
		String A1, A2;
		//System.out.println("The space removal will be done from here:-");
		A1 = removespace(s1);
		//System.out.println(A1);
		A1 = A1.toUpperCase();
		A2 = removespace(s2);
		//System.out.println(A2);
		A2 = A2.toUpperCase();
		//System.out.println("The Arranging will be done from here:-");
		A1 = arrange(A1);
		//System.out.println(A1);
		A2 = arrange(A2);
		//System.out.println(A2);
		if (A1.equals(A2) == true) {
			return true;
		} else
			return false;
	}

	public static String arrange(String Arr) {
		char temp;
		char[] A;
		A = Arr.toCharArray();
		System.out.println(A);
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] > A[j]) {
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		String T = new String(A);
		System.out.println(T);
		return T;
	}

	public static String removespace(String name) {
		int j = 0;
		char[] l1;
		String S;
		l1 = name.toCharArray();
		char[] newname = new char[50];
		for (int i = 0; i < l1.length; i++) {
			if (l1[i] != ' ') {
				newname[j] = l1[i];
				j++;
			}
		}
		S = String.valueOf(newname);
		return S;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2;
		boolean i;

		Scanner n = new Scanner(System.in);

		System.out.print("Enter first String:");
		s1 = n.nextLine();
		System.out.print("Enter Second String:");
		s2 = n.nextLine();
		i = isAnagram(s1, s2);
		if (i == true)
			System.out.println("The entered strings are anagram. ");
		else
			System.out.println("The entered strings are not anagram.");
		n.close();

	}

}