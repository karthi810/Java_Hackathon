//Q14. Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)

import java.util.Scanner;

public class Assignment_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		
		String str = sc.nextLine();
		String[] splitStr = str.split(" ");
		String outStr = "";
		
		for(int i = splitStr.length-1; i >= 0; i--) {
			
			String str1 = splitStr[i];
			String str2 = "";
			
			for(int j = 0; j <= str1.length()-1; j++) {
				str2 = str2 + str1.charAt(j);
			}
			outStr = outStr + str2 + " ";
		}
		System.out.println(outStr);
	}

}
