package com.index;

// 

public class NormalMethod {
	static int a=10;
	int b=20;
	void display() {
		System.out.println(a);
		System.out.println(b);
	}
	static void staticdisplay() {
		System.out.println(a);
	}
	public static void main(String args[]) {
		NormalMethod nm=new NormalMethod();
		nm.display();
		
		//nm.staticDisplay(); no need to call the obj explicitly
		staticdisplay();
		}
}
