package aspire.Wednesday2Feb.SM_Week2_Lab;

public class LargestNumber {
	public static void main(String[] args) {
		double n1 = -5.5, n2 = 3.4, n3 = 6.4;
		
		System.out.println("The checking between the number  : " + n1 + ", " + n2+ ", " + n3);
		
		if(n1>n2 & n1>n3)
			System.out.println("The largets number is : " + n1);
		else if(n2>n1 & n2>n3)
			System.out.println("The largest number is : " + n2);
		else
			System.out.println("The largest number is : " + n3);
	}

}
