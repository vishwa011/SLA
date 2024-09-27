package com.index;

class SingleInheritance{
	float Salary=60000;
	
}
class Program extends SingleInheritance{
	int bonus=30000;
}
public class InheritanceEX1 {
	public static void main() {
		Program P=new Program();
		
		System.out.println("The porgram"+P.Salary);
	}
}
