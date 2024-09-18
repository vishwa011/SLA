package Tasks;

public class StudentDetails {
	int id=2018144;
	String Name="vishwa";
	int Tamil=80;
	int English=76;
	int Maths=56;
	int CS=85;
	int vocational=96;
		
	public static void main(String args[]) {
		
		StudentDetails Obj=new StudentDetails();
		System.out.println("ID :"+Obj.id);
		System.out.println("Name :"+Obj.Name);
		System.out.println("Tamil Score :"+Obj.Tamil);
		System.out.println("English Score :"+Obj.English);
		System.out.println("Maths Score :"+Obj.Maths);
		System.out.println("CS Score :"+Obj.CS);
		System.out.println("Vocational :"+Obj.vocational);
		
	}
}
