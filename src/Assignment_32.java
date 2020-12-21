//Q32. You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B. 
//Write a method to merge B into A in sorted order.

import java.util.*;

public class Assignment_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1 = { 12, 14, 16, 18, 20, 0, 0, 0, 0, 0 };
		int[] iArr2 = { 11, 13, 15, 17, 19 };

		int iArrSize1 = iArr1.length;

		int iArrElements1 = 5, iArrElements2 = 5;

		System.out.println("Arrays before merging");
		System.out.println();
		System.out.println("Array 1 : ");
		for (int k = 0; k < iArrSize1; k++) {
			System.out.print(iArr1[k] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Array 2 : ");
		for (int k = 0; k < iArr2.length; k++) {
			System.out.print(iArr2[k] + " ");
		}
		
		System.out.println();
		System.out.println();

		arrayMerge(iArr1, iArr2, iArrSize1, iArrElements1, iArrElements2);

	}

	public static void arrayMerge(int[] iArr1, int[] iArr2, int iArrSize1, int iArrElements1, int iArrElements2) {
		int i = iArrElements1 - 1;
		int j = iArrElements2 - 1;

		int iLastIndex = iArrSize1 - 1;

		while (j >= 0) {

			if (i >= 0 && (iArr1[i] > iArr2[j])) {
				iArr1[iLastIndex] = iArr1[i];
				i--;
			} else {
				iArr1[iLastIndex] = iArr2[j];
				j--;
			}

			iLastIndex--;
		}

		// print the merged array
		for (int k = 0; k < iArrSize1; k++) {
			System.out.print(iArr1[k] + " ");
		}
	}

}
