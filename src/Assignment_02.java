import java.util.Scanner;

//Q2. write a program to find factorial (Non Recursive)

public class Assignment_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iNum = 0, iFact = 1;;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial : ");
		
		iNum = sc.nextInt();
		
		for(int i = 1; i <= iNum; i++) {
			
			iFact = iFact * i;
		}
		System.out.println(iNum+"! = "+iFact);
	}

}
