//Q23. WJP to differentiate input as string, int or bool

import java.util.Scanner;
public class Assignment_23 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String / Integer(int) / Boolean(boolean) value : ");
		
		if(sc.hasNextBoolean()) {
			System.out.println("User has entered a boolean value : "+sc.nextBoolean());
		}
		else if(sc.hasNextInt()) {
			System.out.println("User has entered an integer (int) value : "+sc.nextInt());
		}
		else if(sc.hasNextLine()) {
			System.out.println("User has entered a String value : "+sc.nextLine());
		}
	}

}
