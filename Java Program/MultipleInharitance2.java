package com.index;
class One3{
	public void printone() {
		System.out.println("Print one");
	}
}
//Intermediatory class
//child class two inherits class one
class Two3 extends One3{
	public void printtwo() {
		System.out.println("Print two");
	}
}
//child class Three inherits from class two
//Derived class
class Three4 extends Two3{
	public void PrintThree() {
		System.out.println("Print Three ");
	}
}
public class MultipleInharitance2 {
	public static void main(String args[]) {
		Three4 Th=new Three4();
		
		Th.printone();
		Th.printtwo();
		Th.PrintThree();
	}
	
}
