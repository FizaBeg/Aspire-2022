package aspire.Wednesday2Feb.SM_Week2_Lab;

public class CastingExercise {
	public static void main(String[] args) {
		byte b=10;

		int i = b;// will accept - automatic type promotion

		//byte c = i;// will not accept - because lower type cannot be put in higher
		byte d = (byte)i;// Type casting makes it possible to store compatible types.
		
		byte x =10;
		byte z =20;

		//byte s = x*z; // Error is thrown because when two bytes are used in a arthmetic operation, the result will be integer
	}

}
