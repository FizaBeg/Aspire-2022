package aspire.Moday7March;

//https://fluvid.com/videos/detail/w6e8gcQzQahny7q8Q#.YiVsMg2sLPg.link
public class InterfaceDemo {
	public static void main(String[] args) {
		
	}
}
//Role Player
class Human{
	
}
//Role
interface Doctor{
	public void cure();
}
interface Nurse{
	public void care();
}
//Role Implementor
class AlopathyMedicalCollege implements Doctor,Nurse{
	public void cure() {
		System.out.println("curing done as per alopathy medicine...");
	}
	@Override
	public void care() {
		System.out.println("nurse is caring using alopathy medicine...");
	}
}
class UnaniMedicalCollege implements Doctor{
	@Override
	public void cure() {
		System.out.println("curing done as per unani herbal medicine...");
	}
}