package com.index;

//Base class or parent class or SuperClass
class One
{
	public void printone() {
		System.out.println("Print one");
	}
}
                                      
//Derived class or child class or sub class 
class Two extends One{
	public void printtwo(){
		System.out.println("print two");
	}
}
public class Inheritens {
	public static void main(String args[]) {
		Two t=new Two();
		t.printone();
		t.printtwo();
	}
}
