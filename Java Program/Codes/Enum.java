package Test;

enum Directions{North,south,East,West}
public class Enum {
	public static void main(String args[]) {
		Directions D;
		D=Directions.south;
		
		switch(D){
		case North:
			System.out.println("Direction is <-");
			break;
		case south:
			System.out.println("Direction is ->");
			break;
		case East:
			System.out.println("Direction is ^");
			break;
		case West:
			System.out.println("Direction is West");
			break;
			default:
				System.out.println("Invalid Input");
			
		}
	}
}
