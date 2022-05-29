package accidentAlert;


//Find your serviceplan_id and Token at https://dashboard.sinch.com/sms/api
//Install the Java helper library at https://developers.sinch.com/docs/sms/sdks/java/
//Find your sinch number at // https://dashboard.sinch.com/numbers/your-numbers/numbers
import com.sinch.xms.*;
import com.sinch.xms.api.*;

public class SMSAlert {
	private static final String SERVICE_PLAN_ID = "6a78d850697640ca96710de6f2fb8906";
	private static final String TOKEN = "32d06d002d9e4017ab66a12e1c70e368";
	private static ApiConnection conn;

	public void smssent() {
		System.out.println("Preparing to send SMS...");
		String SENDER = "447520650862"; //Your sinch number
		String[] RECIPIENTS = { "506048908" }; //your mobile phone number

		ApiConnection conn = ApiConnection
								.builder()
								.servicePlanId(SERVICE_PLAN_ID)
								.token(TOKEN)
								.start();
		MtBatchTextSmsCreate message = SinchSMSApi
										.batchTextSms()
										.sender(SENDER)
										.addRecipient(RECIPIENTS)
										.body("There ia an Alert SMS from xyz highway.")
										.build();
		try {
			// if there is something wrong with the batch
			// it will be exposed in APIError
			MtBatchTextSmsResult batch = conn.createBatch(message);
			System.out.println(batch.id());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("You sent:" + message.body());
		System.out.println("Message sent successfully...");
	}
}
