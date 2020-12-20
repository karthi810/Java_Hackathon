//Q15. Given a string print the unique words of the string.

import java.util.Scanner;

public class Assignment_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iUnique = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		
		String sSentence = sc.nextLine();
		String[] sWords = sSentence.split(" ");
		
		System.out.println("Unique words in the String : ");
		for(int i = 0; i< sWords.length; i++) {
			iUnique = 0;
			for(int j = 0; j < sWords.length; j++) {
				if(i != j) {
					if(sWords[i].equalsIgnoreCase(sWords[j])) {
						iUnique = 1;
						break;
					}
				}
			}
			if(iUnique != 1)
				System.out.print(sWords[i]+" ");
		}
	}

}
