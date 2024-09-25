package Tasks;
//Constructor Overloading
//Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:

public class ConstrectorTask3 {
	String Book;
	String tittle;
	String author;
	
	public ConstrectorTask3(String B,String T,String A ){
		Book=B;
		tittle=T;
		author=A;
		
		System.out.println(Book+""+tittle+""+author);
	}
	public static void main(String args[]) {
		
		ConstrectorTask3 obj=new ConstrectorTask3("HARRY POTTER","Philosopher's Stone","J. K. Rowling");
		}
}
