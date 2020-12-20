//Q34. Write a method to implement *, - , / operations. You should use only the + operator

import java.util.*;

public class Assignment_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int iNum1 = sc.nextInt();
		int iNum2 = sc.nextInt();
		
		System.out.println("Enter an operator ");
		op = sc.next().charAt(0);
		
		arithmeticOp(iNum1, iNum2, op);

	}
	
	public static void arithmeticOp(int iNum1, int iNum2, char op) {
	
		switch(op) {
		case '+':
			System.out.println("result = "+(iNum1 + iNum2));
			break;
		case '-':
			System.out.println("result = "+(iNum1 * iNum2));
			break;
		case '*':
			System.out.println("result = "+(iNum1 - iNum2));
			break;
		case '/':
			System.out.println("result = "+(iNum1 / iNum2));
			break;
		}
	}

}
