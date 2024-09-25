package com.index;
//Type - 1
//Instance Variable are declared in a class and outside of any method, constructor or block
//Instance Variable can be accessed only by creating objects we can also intialize using constructor also
//variable declaration  data type,name,how much memory to allocate

public class InstanceVariable {
	
	public static String a="hello";
	static int i;
	
	public static void main(String args[]) {
		System.out.println("The value of String is :"+a);
		System.out.println("The value of String is :"+i);
	}
}
