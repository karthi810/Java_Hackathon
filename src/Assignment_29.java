//Q29. WJP to perform Merge sort using recursion 

import java.util.*;

public class Assignment_29 {

	public static void main(String[] args) {
		
		int[] iArray = new int[100];
		int arrayLen;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter length of an array to be sorted");
		
		arrayLen = sc.nextInt();
		
		System.out.println("Please enter elements of an array to be sorted");
		
		for(int i = 0; i < arrayLen; i++){
			
			iArray[i] = sc.nextInt();
		}
		
		//Array before sorting
		
		System.out.println("Array before sorting:");
		
		for(int i = 0; i < arrayLen; i++) {
			
			System.out.print(iArray[i] + "  ");
		}

		System.out.println();
		
		//Merge Sort
		
		mergeSortArr(iArray, arrayLen);
		
		//Array after sorting
		
		System.out.println("Array after sorting:");
				
		for(int i = 0; i < arrayLen; i++) {
				
			System.out.print(iArray[i] + "  ");
		}

		System.out.println();
			
	} // end of main
	
	
	//Function definition
	
	public static void mergeSortArr(int[] a, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSortArr(l, mid);
	    mergeSortArr(r, n - mid);
	 
	    merge(a, l, r, mid, n - mid);
	}
	
	public static void merge(int[] a, int[] l, int[] r, int left, int right) {
			 
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			}

}
