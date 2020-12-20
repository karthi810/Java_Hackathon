//Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string

import java.util.Scanner;

public class Assignment_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iUppercaseCount = 0, iLowercaseCount = 0, iNumbersCount = 0;

		System.out.println("Enter a String that has UPPERCASE, lowercase and Integers :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] charArr = new char[25];
		int k = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if(i != j) {
					char ch1 = str.charAt(j);
					if(ch1 == ch) {
						if (ch >= 'A' && ch <= 'Z')
							iUppercaseCount++;
						else if (ch >= 'a' && ch <= 'z')
							iLowercaseCount++;
						else if (ch >= '0' && ch < '9')
							iNumbersCount++;
					}
				}
			}
		} 
		System.out.println("No of Repeated Interger : " + iNumbersCount + " , No of Repeated Uppercase :" + iUppercaseCount
				+ " , No of Repeated  Lowercase : " + iLowercaseCount);

	}

}
