package Tasks;

public class ConstractorTask2 {
	String Breed;
	String Name;
	String Color;
	
	public ConstractorTask2(String B,String N,String C) {
		Breed = B;
		Name = N;
		Color = C;
	}
	 void display() {
		System.out.println("Breed :"+Breed);
		System.out.println("Nmae :"+Name);
		System.out.println("Color :"+Color);
	}
	public static void main(String args[]) {
		ConstractorTask2 sc=new ConstractorTask2("Rottweiler ","Rocky " ,"BrounandBlack");
		
		sc.display();
		
	}
	
}
