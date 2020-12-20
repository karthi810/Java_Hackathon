//Q4. Given an array of integers check the Palindrome of the series.

import java.util.Scanner;

public class Assignment_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] iArray = new int[100];
		int iPalindromeCheck = 0, arrayLen = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter length of an array");

		arrayLen = sc.nextInt();

		System.out.println("Please enter elements of an array");

		for (int i = 0; i < arrayLen; i++) {

			iArray[i] = sc.nextInt();
		}

		// To check if it is palindrome or not

		if (arrayLen == 0) {
			System.out.println("Cannot check");
		}

		for (int i = 0; i < arrayLen / 2; i++) {
			if (iArray[i] != iArray[arrayLen - 1 - i]) {
				iPalindromeCheck = 1;
				break;
			}
		}

		if (iPalindromeCheck == 1)
			System.out.println("Not a palindrome.");
		else
			System.out.println("Is a Palindrome.");

	}

}
