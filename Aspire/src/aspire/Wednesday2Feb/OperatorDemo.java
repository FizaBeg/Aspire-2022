package aspire.Wednesday2Feb;

public class OperatorDemo {
	public static void main(String[] args) {
		// <,>, <=, >=,==, !=  - relational operators
		//!, && , ||- Logical Operators
		
		int i=10;
		int j=10;
		boolean b=i!=j;
		
		
		System.out.println(b);
		
		boolean result=(i==j && i<j);//both the conditions should be true, then it returns true
		
		System.out.println(result);
		
		result=(i==j || i<j);//one of this is true then the result will be true - either or
		
		System.out.println(result);
	}
}
