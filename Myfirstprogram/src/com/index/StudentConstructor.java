package com.index;

public class StudentConstructor {
	int id;
	String Name;
	public StudentConstructor(int i,String n) {
		id=i;
		Name=n;
	}
	void display() {
		System.out.println(id+" "+Name);
	}
	public static void main(String args[]) {
		StudentConstructor sc=new StudentConstructor(101,"Kumar");
		StudentConstructor sc1=new StudentConstructor(102,"Kannan");
		StudentConstructor sc2=new StudentConstructor(103,"vishwa");
		
		sc.display();
		sc1.display();
		sc2.display();
	}
}
