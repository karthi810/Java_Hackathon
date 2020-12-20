//Q28. WJP to find factorial of a number using recursion
import java.util.*;

public class Assignment_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find factorial : ");
		int iNum = sc.nextInt();
		
		int fact = factorial(iNum);
		System.out.println(iNum+"! = "+ fact);
	}
	
	public static int factorial(int iNum) {
		
		int fact = 1;
		if(iNum==1)
			return 1;
		
		fact = factorial(iNum - 1) * iNum;
		
		return fact;
	}

}
