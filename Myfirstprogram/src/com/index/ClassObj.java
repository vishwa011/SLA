package com.index;

public class ClassObj {
	
	String name="vishwa";
	int id=5;
	double salary=934475;
	int bonus=9000;
	
	public static void main(String args[]) {
		
		//creating multiple object
		
		ClassObj obj=new ClassObj();
		ClassObj obj1=new ClassObj();
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj1.id);
		System.out.println(obj1.name);
		System.out.println(obj1.bonus);
		System.out.println(obj1.salary);
	}
}
