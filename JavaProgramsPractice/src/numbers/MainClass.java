package numbers;

import java.util.Scanner;

public class MainClass {

	
	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int a = sc.nextInt();
		System.out.println("Enter number 2:");
		int b = sc.nextInt();
		
		ArithmeticOperations op = new ArithmeticOperations();
		System.out.println("Addition is:" + op.addInt(a, b));
		System.out.println("Subtraction is:" + op.substractInt(a, b));
	}
	
	
}
