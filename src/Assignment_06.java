//Q6. WJP to perform ascending order Selection sort

import java.util.Scanner;

public class Assignment_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] iArray = new int[100];
		int arrayLen, temp = 0, min_idx = 0;
		
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
		
		//Selection Sorting
		
		for(int i = 0; i < arrayLen -1; i++) {
			
			min_idx = i; 
			
			for(int j = i + 1; j < arrayLen; j++) {
				
				//Comparing the current element with the smallest number
				if(iArray[j] < iArray[min_idx])
				{
					min_idx = j;
				}
			}
			
			//swap the updated smallest num with the prev smallest num
			
			temp = iArray[min_idx];
			iArray[min_idx] = iArray[i];
			iArray[i] = temp;
		}
		
		//Array after sorting
		
		System.out.println("Array after sorting:");
		
		for(int i = 0; i < arrayLen; i++) {
			
			System.out.print(iArray[i] + "  ");
		}

		System.out.println();
		
	}
}
