package aspire.Wednesday2Feb.SM_Week2_Lab;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int num,sum=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n Enter any number/integer value below 10:  ");
		num = scan.nextInt();
		
		while(num<=10) {
			sum = sum +num;
			num++;
		}
		System.out.format(" Sum of the Numbers From the While Loop is: %d ", sum);
		
	}

}
