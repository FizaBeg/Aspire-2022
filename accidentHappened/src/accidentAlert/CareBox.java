package accidentAlert;

import java.util.Scanner;

public class CareBox {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Display of Care Box shows this and acts according to the key pressed by the user.
		
		System.out. println("Enter the number according to the need: \n "
				+ "1) Accident Alert goes to hospitals. \n 2) Got hurt want to contact doctor. "
				+ "\n 3) Use the medicine box. \n 4) Want prescription to be saved in Pdf format. " );
		
		int button = sc.nextInt();
		
		switch(button)
		{
		case 1:
		{
			try
			{
			AlertMail am = new AlertMail();
			am.mailsend();
			SMSAlert sms = new SMSAlert();
			sms.smssent();
			break;
		   }
			catch(Exception ex) {}
			
		}
		case 2:
		{
			try {
				
			MailDoctor am = new MailDoctor();
			am.contactDoctor();
			System.out.println("Doctor :  'Do you need Pdf priscription?'");
			System.out.println("Type Y for 'Yes' & N for 'No'");
			String s = sc.next();
			if(s.equalsIgnoreCase("Y"))
			{
				GeneratePdf pdf = new GeneratePdf();
				pdf.createpdf();
			}
			break;
			}
			catch(Exception ex) {}
		}
		case 3:
		{
			
			UnlockMedicineBox umb = new UnlockMedicineBox();
			umb.mainmethod();
			break;
		}
		case 4:
		{
			GeneratePdf pdf1 = new GeneratePdf();
			pdf1.createpdf();
			break;
		}
		}
		
	}

}
