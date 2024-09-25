package com.index;

//resusablity Vs code resubality
//it will take method parameter(With parameter WithoutParameter)
//

public class MethodFun {
	
	private static int getSquare(int x) {
		return x*x;
	}
	public static void main(String args[]) {
		//Access modifier returntype funname(int, int, String)
		//public void fun(int,int)
		//void func(double)
		//void func()
		
		for(int i=1;i<=5;i++) {
			
			//Direct method call
//			int result=getSquare(i);
//			System.out.println("Square of i is "+i+""+result);
			
			//Method call using obj
			MethodFun obj=new MethodFun();
			int number=obj.getSquare(1);
			
			System.out.println("The multuple"+number);
		}
	}
}
