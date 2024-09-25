package com.index;

public class JavaMethods {
	//static return type function name
	static void myStaticMethod() {
		System.out.println("Static Methods can be called without creating object");
	}
	
	//public return type function name
	public void myPublicMethod() {
		System.out.println("Public method must be called by creating object");
	}
	
	public static void main(String args[]) {
		myStaticMethod();
		
		JavaMethods myObj=new JavaMethods();
		
		myObj.myPublicMethod();
	}
}
