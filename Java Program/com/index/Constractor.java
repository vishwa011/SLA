package com.index;
//constoris special method that create new instance of class and intialices there variable
//purpus
//to inizialize the object 
//name same name as class name
//no return type
// two type default(the autpmatycalyy provites the default constructor that initiazize the object )
// parameter that allow the object to be initalize the special

//Java point 
//Why We Use Constructor in Java?
//In this section, we will learn why we use a constructor in Java and what is the purpose and need of the constructor.
//Along with this, we will also see the types of the constructor.

//In Java, the constructor is similar to the method. The property of the constructor is that it must have the same name as the class name. 
//It has no return type. We do not require to call the constructor manually. It automatically invokes implicitly during the instantiation.

//In other words, a constructor is a method that is called at runtime during the object creation by using the new operator.
//The JVM calls it automatically when we create an object. When we do not define a constructor in the class, the default constructor is always invisibly present in the class.

//There are the following reasons to use constructors:

//We use constructors to initialize the object with the default or initial state. The default values for primitives may not be what are you looking for.
//Another reason to use constructor is that it informs about dependencies. In other words, using the constructor, we can request the user of that class for required dependencies.
//We can find out what it needs in order to use this class, just by looking at the constructor.
//In short, we use the constructor to initialize the instance variable of the class.

public class Constractor {
	//default constructor
	public Constractor() {
		System.out.println("This is my default constructor :");
	}
	public static void main(String args[]) {
		Constractor obj=new Constractor();
	}
}
