package com.index;
//25.09.2024
// wrapper is a class that enclapsulate a primitive datatype as object

//primitive Datatype(first letter small)  Wrapper(first letter capital)
//byte //Byte
//long Integer
//short //Short
//double //Double
//boolean //Boolean
//float //Float

// It is used to convert all primitives data type into 
//its corresponding wrapper object and vice-versa

public class WraapperClass {
	public static void main(String args[]) {
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		
		//Autoboxing: converting primitives into object
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		
		//primitive objects
		System.out.println("----Primitive object values----");
		System.out.println("Byte object :"+byteobj);
		System.out.println("Short object :"+shortobj);
		System.out.println("Integer object :"+intobj);
		System.out.println("Long object :"+longobj);
		
		//unboxing: Converting object to primitives
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		
		System.out.println("----Primitive object values---");
		System.out.println("byte value :"+bytevalue);
		System.out.println("short value :"+shortvalue);
		System.out.println("int value :"+intvalue);
		
		
	}
}
