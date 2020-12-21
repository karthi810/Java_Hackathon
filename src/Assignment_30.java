//Q30. Write a function to find out longest palindrome in a given string?

import java.util.*;

public class Assignment_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();

		String outStr = "";
		outStr = findLongestPalindrome(str);
		System.out.println("Longest palindrome in "+str+" is :"+outStr);

	}

	public static String findLongestPalindrome(String s) {
		// Validations
		if (s.isEmpty()) {
			return "Please enter a String";
		}

		if (s.length() == 1) {
			return s;
		}
		
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i = i + 1) {
			
			String tmp = checkForEquality(s, i, i);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
			
			tmp = checkForEquality(s, i, i + 1);
			if (tmp.length() > longest.length()) {
				longest = tmp;
			}
		}
		return longest;
	}

	public static String checkForEquality(String s, int begin, int end) {
		while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
			begin--;
			end++;
		}
		return s.substring(begin + 1, end);
	}

}
