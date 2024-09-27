package com.index;

interface One1{
	public void printone();
}
interface Two2{
	public void printTwo();
}
interface Three3 extends One1,Two2{
	public void printThree();
}
class Child implements Three3{
	public void printone() {
		System.out.println("Print one from class one");
	}
	public void printTwo() {
		System.out.println("Print two from class Two");
	}
	public void printThree() {
		System.out.println("Print Three from class Three11");
	}
}
public class MultipleInharitance {
	public static void main(String args) {
		Child C=new Child();
		
//		C.printone();
//		C.printTwo();
		C.printThree();
	}
}
