package aspire.Wednesday2Feb.SM_Week2_Lab;

import java.util.Scanner;

public class Basic2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter value of i... ");
		int i = scan.nextInt();
		
		System.out.println("Enter value of j ... ");
		int j = scan.nextInt();
		
		int  mul = i*j;
		System.out.println("Multipying i and j we get : " + mul);
	}

}
