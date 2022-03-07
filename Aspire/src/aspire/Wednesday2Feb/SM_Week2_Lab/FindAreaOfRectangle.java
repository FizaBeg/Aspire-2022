package aspire.Wednesday2Feb.SM_Week2_Lab;

import java.util.Scanner;

public class FindAreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle: ");
		double l  = sc.nextDouble();
		
		System.out.println("Enter the breadth of rectangle : ");
		double b = sc.nextDouble();
		
		double area = l * b;
		System.out.println("The area is : " + area);
	}

}
