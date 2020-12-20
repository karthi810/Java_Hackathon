//Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?

import java.util.Scanner;

public class Assignment_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 0, iNumTemp = 0, iRemainder = 0, iSum = 0;
		String str, outStr = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		
		str = sc.next();
		
		System.out.println("Enter a number :");
		
		iNum = sc.nextInt();
		iNumTemp = iNum;
		
		// Palindrome check:
		
		//(a) for number
		
		while(iNumTemp > 0) {
			iRemainder = iNumTemp % 10;
			iSum = (iSum * 10) + iRemainder;
			iNumTemp = iNumTemp/10;
		}
		
		if(iSum == iNum)
			System.out.println(iNum+" is a Palindrome");
		else
			System.out.println(iNum+" is not a Palindrome");
		
		//(b) for a String
		
		for(int i = str.length() - 1; i >= 0; i--) {
			 outStr = outStr + str.charAt(i);
		}
		if(outStr.equalsIgnoreCase(str)) {
			System.out.println(str+" is a Palindrome");
		}
		else {
			System.out.println(str+" is not a Palindrome");
		}
		
	}

}
