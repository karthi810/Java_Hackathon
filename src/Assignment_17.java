//Q17. WJP to find total number of integers, uppercase and lowercase character in the give string

import java.util.Scanner;

public class Assignment_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iUpperCount = 0, iLowerCount = 0, iNumbers = 0;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String with intergers, uppercase and lowercase character in them : ");
		
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				iUpperCount++;
			else if(ch >='a' && ch <= 'z')
				iLowerCount++;
			else if(ch >= '0' && ch <'9')
				iNumbers++;
		}
		
		System.out.println("No of Interger : "+iNumbers+" , No of Uppercase :"+iUpperCount+" , No of Lowercase : "+iLowerCount);
	}

}
