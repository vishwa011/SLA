package com.index;

//1.Local variables
//A variable defined within a block or method or constractor is called local variables
//we can access the variable only within a block
//it is destroyed once its exit the call


public class Variables {
	
	public static void main(String arg[])
	{
		int a=10, b=20,c;
		float d=34567.0f;
		String s="Hello hai how are you";
		double db=876544567;
		boolean istrue=true;
		c=a+b;
		System.out.println("The local variables :"+c);
		System.out.println("The local variables float is :"+d);
		System.out.println("The local variables character is :"+s);
	}
	
}
