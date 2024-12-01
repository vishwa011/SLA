package NewOne;

interface Vehicale{
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
	
}
public class Bicycle implements Vehicale {
	int speed;
	int gear;
	public void changeGear(int newgear) {
		gear=newgear;
	}
	public void sppedUp(int increment) {
		speed=increment;
	}
	public void applyBrakes(int decrement) {
		speed=speed-decrement;
	}
	public void printStates() {
		System.out.println("speed"+"speed"+"gear"+gear);
	}
	@Override
	public void speedUp(int a) {
		// TODO Auto-generated method stub
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBrakes(1);
		System.out.println("Bicycle present state");
		
		bicycle.printStates();
	}
}
