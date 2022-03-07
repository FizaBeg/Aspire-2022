package aspire.Wednesday2Feb.SM_Week2_Lab;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		int num;
		
		System.out.println("Enter an integer number to check even or odd : ");
		
		//number entered by user is stored in num
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		/* If number is divisible by 2 then it's an even number
		 * else odd number*/
		
		if(num%2==0)
			System.out.println("Number " + num + " is even.");
		else
			System.out.println("Number " + num + " is odd.");
		
	}

}
