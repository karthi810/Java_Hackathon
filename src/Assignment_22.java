//Q22. WJP to convert int to string

import java.util.Scanner;

public class Assignment_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 0;
		String str = "";
		System.out.println("Enter an integer value : ");
		Scanner sc = new Scanner(System.in);
		iNum = sc.nextInt();
		
		str = str.valueOf(iNum);
		System.out.println("Converting int "+iNum+" to String = "+str);
	}

}
