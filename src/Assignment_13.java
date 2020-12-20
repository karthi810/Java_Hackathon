//Q13. Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)

import java.util.Scanner;

public class Assignment_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		
		String str = sc.nextLine();
		String outStr = "";
		
		//reverse
		
		for(int j = str.length() -1; j >= 0; j--) {
			outStr = outStr + str.charAt(j);
		}
		
		System.out.println("Reverse of "+str+" is "+outStr);
	}

}
