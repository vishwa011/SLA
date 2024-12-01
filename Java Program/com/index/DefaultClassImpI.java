package NewOne;
//prior JDk 8 the interface could not interface
//but now jdk 8 we add default implementation requre 
// another feature now that can be 
interface Overall
{
	default void show()
	{
		System.out.println("Default Method in interface:");
	}
}
interface Interface1 extends Overall
{
	void display();
}
	
	interface Interface2 extends Overall
	{
		void print();
	}
	
public  class DefaultClassImpI implements Interface1,Interface2{
	public void display()
	{
		System.out.println("Diplay Method Interface1 :");
	}
	public void print()
	{
		System.out.println("Display Method Interface2 :");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultClassImpI dci= new DefaultClassImpI();
		dci.show();
		dci.display();
		dci.print();
	}

}
