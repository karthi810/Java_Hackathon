//Q62. write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers, the number will be based on var k. 
//Array = [3,2,4,7,0,3,1,5,8, 4]    k=3    OutPut = [4,2,3,3,0,7,8,5,1,4]

import java.util.Scanner;
public class Assignment_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array : ");
		int iLen = sc.nextInt();
		
		int[] iArr = new int[iLen];
		System.out.println("Enter the array elements : ");
		for(int i = 0; i< iLen; i++)
			iArr[i] = sc.nextInt();
		
		System.out.println(" Enter which set of 3 elements need to be reversed :");
		int k = sc.nextInt();
		int temp = 0;
		
		if(k == 1) {
			System.out.println("Reverting first set of 3 elements from the array .");
			temp = iArr[k-1];
			iArr[k-1] = iArr[k+1];
			iArr[k+1] = temp;
			for(int i = 0; i <iArr.length; i++)
				System.out.print(iArr[i]+" ");
		}
		else if(k == 2) {
			System.out.println("Reverting second set of 3 elements from the array .");
			temp = iArr[k+1];
			iArr[k+1] = iArr[k+3];
			iArr[k+3] = temp;
			for(int i = 0; i <iArr.length; i++)
				System.out.print(iArr[i]+" ");
		}
		else if(k == 3) {
			System.out.println("Reverting third set of 3 elements from the array .");
			temp = iArr[k+3];
			iArr[k+3] = iArr[k+5];
			iArr[k+5] = temp;
			for(int i = 0; i <iArr.length; i++)
				System.out.print(iArr[i]+" ");
		}

	}

}
