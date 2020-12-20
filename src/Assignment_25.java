//Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.

import java.util.*;

public class Assignment_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements in an array : ");
		int iArrlen = sc.nextInt();
		int iArray[] = new int[iArrlen];
		System.out.println("Enter "+iArrlen+" elements in ascending order");
		
		for(int i = 0; i< iArrlen; i++) {
			iArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element that needs to be searched in this array : ");
		
		int iSearchElem = sc.nextInt();
		
		int iFirst = 0, iLast = iArrlen -1;
		
		int iMid = (iFirst + iLast)/2;
		
		while(iFirst <= iLast) {
			
			if(iArray[iMid] < iSearchElem) {
				iFirst = iMid +1;
			}
			else if(iArray[iMid] == iSearchElem) {
				System.out.println(iSearchElem+" is the "+(iMid+1)+" element in the array");
				break;
			}
			else {
				iLast = iMid -1;
			}
			
			iMid = (iFirst + iLast)/2;
			
		}
		if(iFirst > iLast) {
			System.out.println(iSearchElem+" not found.");
		}

	}

}
