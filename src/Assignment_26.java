//Q26. WJP to merge two sorted array.(Do not use third array) array1[10] = 1,2,4,6,9,10 array2[4] = 3, 5,7,8 
//After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10

import java.util.*;

public class Assignment_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the length for 2 arrays : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int iArrlen1 = sc.nextInt();
		int iArrlen2 = sc.nextInt();

		int[] iArray1 = new int[iArrlen1];
		int[] iArray2 = new int[iArrlen2];
		int[] iOutArr = new int[iArrlen1 + iArrlen2];

		System.out.println("Enter " + iArrlen1 + " elements for the first Array in ascending order ");
		for (int i = 0; i < iArrlen1; i++)
			iArray1[i] = sc.nextInt();

		System.out.println("Enter " + iArrlen2 + " elements for the second Array in ascending order ");
		for (int i = 0; i < iArrlen2; i++)
			iArray2[i] = sc.nextInt();

		// Merge two array:
		int i = 0, j = 0, k = 0;

		while (i < iArrlen1 && j < iArrlen2) {
			if (iArray1[i] < iArray2[j])
				iOutArr[k++] = iArray1[i++];
			else
				iOutArr[k++] = iArray2[j++];
		}
		while (i < iArrlen1)
			iOutArr[k++] = iArray1[i++];
		while (j < iArrlen2)
			iOutArr[k++] = iArray2[j++];

		System.out.println("Merged Array : ");

		for (i = 0; i < iOutArr.length; i++) {
			System.out.print(iOutArr[i] + " ");
		}

	}

}
