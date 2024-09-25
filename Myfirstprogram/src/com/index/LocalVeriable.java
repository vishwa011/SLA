package com.index;

public class LocalVeriable {
	public void pupAge() {
		int age=0;
		age=age+7;
		System.out.println("Puppy age is :"+age);
	}
	
	public static void main(String args[]) {
		
		LocalVeriable test = new  LocalVeriable ();
		
		test.pupAge();
		
	}
}
