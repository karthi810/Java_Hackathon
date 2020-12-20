//Given an array of integers, sort the integer values.

import java.util.Scanner;

public class Assignment_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] iArray = new int[100];
		int arrayLen, temp = 0;
		
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
		
		//Bubble Sorting
		
		for(int i = 0; i < arrayLen; i ++) {
			for(int j = 1; j < (arrayLen - i); j++) {
				
				if(iArray[j-1] > iArray[j]) {
					//swap
					
					temp = iArray[j-1];
					iArray[j-1] = iArray[j];
					iArray[j] = temp;
				}
			}
		}
		
		
		//Array after sorting
		
				System.out.println("Array after sorting:");
				
				for(int i = 0; i < arrayLen; i++) {
					
					System.out.print(iArray[i] + "  ");
				}

				System.out.println();
		
	}
}
