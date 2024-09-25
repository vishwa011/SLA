package com.index;
//25.09.2024

public class Singleton {
	private String Name;
	private int Age;
	private String department;
	
	//Used this for accessing current object
	
	private Singleton(String Name,int Age, String department) {
		//this will refer current object of the data filed
		
		this.Name=Name;
		this.Age=Age;
		this.department=department;
	}
	
	//factory method to create Employee objects
	private static Singleton createSingleton(String Name,int Age, String department) {
		return new Singleton(Name,Age,department);
	}
	public static void main(String args[]) {
		//create Employee object using the factory method 
		Singleton Employee1 = Singleton.createSingleton("vishwa", 25, "HR");
		Singleton Employee2 = Singleton.createSingleton("Basith", 30, "HR");
		
		System.out.println("Employee Name :"+Employee1.Name+"Age :"+Employee1.Age+"department :"+Employee1.department);
		System.out.println("Empolyee Name :"+Employee2.Name+"Age :"+Employee2.Age+"department :"+Employee2.department);
		}
	
	
}
