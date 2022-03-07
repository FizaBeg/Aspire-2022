package aspire.Wednesday2Feb.SM_Week2_Lab;

public class NestedSwitchCase {
	public static void main(String[] args) {
		int tech = 2;
		int course = 2;
		
		switch(tech) {
		case 1:
		{
			System.out.println("python");
			break;
		}
		case 2:
		{
			switch(course)
			{
			case 1:
			{
				System.out.println("J2EE");
				break;
			}
			case 2:
			{
				System.out.println("advance java");
				break;
			}
			}
		
			
		}
			
		}
	}

}
