import java.util.Scanner;

//Q1. Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true

public class Assignment_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three boolean values");
		
		a = sc.nextBoolean();
		b = sc.nextBoolean();
		c = sc.nextBoolean();
		
		if((a && b) || (a && c) || (b && c)) {
			System.out.println(" Two Boolean variables are true");
		}
		else {
			System.out.println("No two Boolean variables are true");
		}
	
	}

}
