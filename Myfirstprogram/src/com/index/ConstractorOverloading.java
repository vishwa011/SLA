package com.index;
//constractor does not return any value
// is invoke inplicisityliy
// state of the object
// constractor is a same name as a class name

//method is return the value
//is invoke explicitly
//method is a behiviar of object 

public class ConstractorOverloading {
	int id;
	String Name;
	int age;
	
	ConstractorOverloading(int i,String n)
	{
		id=i;
		Name=n;
	}
	ConstractorOverloading(int i,String n,int a)
	{
		id=i;
		Name=n;
		age=a;
		
	}
	void display()
	{
		System.out.println(id+""+Name+""+age);
	}
	public static void main(String args[]) {
		
		ConstractorOverloading sc=new ConstractorOverloading(101,"vishwa" ,20);
		ConstractorOverloading sc1=new ConstractorOverloading(102,"santhos",22);
		ConstractorOverloading sc2=new ConstractorOverloading(103,"bhuvi",22);
		
		sc.display();
		sc1.display();
		sc2.display();
	}

}
