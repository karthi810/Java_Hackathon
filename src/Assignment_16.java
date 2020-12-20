//Q16. Write a method that will remove given character from the String?

import java.util.Scanner;

public class Assignment_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		
		System.out.println("Enter the character that needs to be removed : ");
		
		char ch = sc.next().charAt(0);
		
		removeCharacters(str, ch);
	}
	
	public static void removeCharacters( String str1, char ch) {
		
		String outStr = "";
		
		for(int i = 0; i < str1.length(); i++) {
			if(ch == str1.charAt(i)) {
				continue;
			}
			outStr = outStr + str1.charAt(i);
		}
		
		System.out.println(str1+" without "+ch+" is "+outStr);
		
	}
}
