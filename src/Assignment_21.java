//Q21. WJP to convert string to int

import java.util.Scanner;

public class Assignment_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int iNum = 10;
		
		iNum = iNum + Integer.parseInt(str);
		System.out.println("Adding String value "+str+" with an interger value 10 = "+iNum);

	}

}
