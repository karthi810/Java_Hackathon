//Q5. Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.

import java.util.Scanner;

public class Assignment_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] iArray = new int[100];
		int arrayLen = 0, iCheck = 0, iOccourrence = 0, iDuplicate = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter length of an array");

		arrayLen = sc.nextInt();

		System.out.println("Please enter elements of an array");

		for (int i = 0; i < arrayLen; i++) {

			iArray[i] = sc.nextInt();
		}

		// To check unique numbers
		System.out.println(" Unique elements in the array : ");

		for (int i = 0; i < arrayLen; i++) {

			// i = 3;
			iCheck = 0;
			for (int j = 0; j < arrayLen; j++) {
				if (i != j) {
					if (iArray[i] == iArray[j]) {
						iCheck = 1;
						break;
					}
				}
			}

			if (iCheck != 1)
				System.out.print(iArray[i] + " ");

		}

		// To find duplicate mumbers
		System.out.println();
		
		for (int i = 0; i < arrayLen; i++) {
			iOccourrence = 1;
			iDuplicate = 0;
			
			for (int j = 0; j < arrayLen; j++) {
				if (i != j) {
					if (iArray[j] == iArray[i]) {
						iDuplicate = 1;
						iOccourrence++;
					}
				}
			}
			if (iDuplicate == 1)
				System.out.println("Number " + iArray[i] + "appears : " + iOccourrence + " times");
		}

		

	}

}
