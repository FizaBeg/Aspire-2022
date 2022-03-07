package aspire.Wednesday2Feb.SM_Week2_Lab;

import java.util.Scanner;

public class FindAreaOfSquare {
	public static void main(String[] args) {
		System.out.println("Enter the number of square: ");
		//Capture the user's input
		Scanner sc = new Scanner (System.in);
		//Storing the captured value in a variable
		int side = sc.nextInt();
		//Area of Square = side*side
		double area = side *side;
		 System.out.println("Area of Square is : " + area);
	}

}
