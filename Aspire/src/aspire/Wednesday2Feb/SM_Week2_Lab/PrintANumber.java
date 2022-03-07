package aspire.Wednesday2Feb.SM_Week2_Lab;

import java.util.Scanner;

public class PrintANumber {
	public static void main(String[] args) {
		// Creates a reader instance which takes
		// input from standard input - keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to print : ");
		
		// nextInt() reads the next integer from the keyboard
		int number = sc.nextInt();
		
		// println() prints the following line to the output screen
		System.out.println("Entered Number is : " + number);
	}

}
