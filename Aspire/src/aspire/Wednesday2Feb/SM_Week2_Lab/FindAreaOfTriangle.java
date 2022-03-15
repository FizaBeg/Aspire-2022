package aspire.Wednesday2Feb.SM_Week2_Lab;

import java.util.Scanner;

public class FindAreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the width of triangle...  ");
		double w = sc.nextDouble();
		
		System.out.println("Enter the height of the triangle... ");
		double h = sc.nextDouble();
		
		double area = (w*h)/2;
		System.out.println("Area of the triangle :  " + area);
	}

}
