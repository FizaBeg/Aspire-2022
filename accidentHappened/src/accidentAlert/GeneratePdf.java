package accidentAlert;

import java.io.File;
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import com.itextpdf.text.Document;  
import com.itextpdf.text.DocumentException;  
import com.itextpdf.text.Paragraph;  
import com.itextpdf.text.pdf.PdfWriter;  
public class GeneratePdf  
{  
public void createpdf()  
{  
//created PDF document instance   
Document doc = new Document();  
try  
{  
//generate a PDF at the specified location  
PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\fiza\\Desktop\\Java PDF\\Prescription.pdf"));  
System.out.println("PDF created.");  
//opens the PDF  
doc.open();  
//adds paragraph to the PDF file  
doc.add(new Paragraph("Paitient no: 123 \n You are having diziness and driving is not safe."
		+ "Take a diziness pill and after five minute rest then move forward for your destination."
		+ "       abc pill \n qwe pill \n glucose juice "
		+ "\n Signature of Doctor: \n\n Fiza"));   
//close the PDF file  
doc.close();  
//closes the writer  
writer.close();  
}   
catch (DocumentException e)  
{  
e.printStackTrace();  
}   
catch (FileNotFoundException e)  
{  
e.printStackTrace();  
}

try {

	if ((new File("C:\\Users\\fiza\\Desktop\\Java PDF\\Prescription.pdf")).exists()) {

		Process p = Runtime
		   .getRuntime()
		   .exec("rundll32 url.dll,FileProtocolHandler C:\\Users\\fiza\\Desktop\\Java PDF\\Prescription.pdf");
		p.waitFor();
			
	} else {

		System.out.println("File is not exists");

	}

	System.out.println("Done");

	  } catch (Exception ex) {
	ex.printStackTrace();
  }
}  
}  