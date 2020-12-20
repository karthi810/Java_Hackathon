//Q18. WJP to display duplicate character in string

import java.util.Scanner;

public class Assignment_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iDuplicate = 0;
		char ch;
		
		System.out.println("Enter a String to find the duplicate characters : ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println("Duplicate characters in "+str+" : ");
		for(int i = 0; i < str.length(); i++) {
			//iDuplicate = 0;
			ch = str.charAt(i);
			
			for(int j = i+1 ;j<str.length();j++) {
				//if(i!=j) {
					if(ch == str.charAt(j)) {
						System.out.print(str.charAt(i)+ " ");
						break;
					}
				//}
			}
				
		}
	}

}
