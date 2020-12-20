//Q19. WJP to display number of occurrence of all character
import java.util.Scanner;

public class Assignment_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String :");
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int[] chCountArr = new int[255]; 
 
		int iChFlag = 0;
		
		for (int i = 0; i < str.length(); i++) { 
			chCountArr[str.charAt(i)]++; 
		} 
 
		char[] chArr = new char[str.length()]; 
		for (int i = 0; i < str.length(); i++) { 
			chArr[i] = str.charAt(i); 
			iChFlag = 0; 
			
			for (int j = 0; j <= i; j++) { 				
				if (str.charAt(i) == chArr[j]) 
					iChFlag++; 
			} 
 
			if (iChFlag == 1) { 
				System.out.println("Number of Occurrence of " + str.charAt(i) + " letter is:" + chCountArr[str.charAt(i)]); 
			} 
		} 

	}

}
