package aspire.Wednesday2Feb.SM_Week2_Lab;

import java.util.Scanner;

public class FloydsTriangle {
	public static void main(String[] args) {
		int row, counter,j,number =1;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number of rows for Floyd's Traingle : ");
		
		row=sc.nextInt();
		
		System.out.println("Floyd's Traingle ");
		System.out.println();
		
		for(counter = 1; counter <= row; counter ++)
		{
			for(j=1;j<=counter;j++)
			{
				System.out.print(number + " ");
				//Incrementing number values
				number++;
			}
			//For new line
			System.out.println();
		}
	}

}
