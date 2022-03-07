package aspire.Wednesday2Feb.SM_Week2_Lab;

public class PrintAsciiValue {
	public static void main(String[] args) {
		char ch = 'c';
		int ascii = ch;
		
		// You can also cast char to int
		int castAscii = (int) ch;
		System.out.println("The first Ascii value of " + ch + "is : " + ascii);
		System.out.println("The second Ascii value of " + ch + " is : " + castAscii);
		
	}

}
