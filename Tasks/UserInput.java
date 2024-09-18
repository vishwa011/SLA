package Tasks;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String args[]) {
		 
		Scanner input=new Scanner(System.in);
		
		System.out.println("Ente the name :");
		String name=input.nextLine();
		System.out.println("Employname name is :"+name);
		
		System.out.println("Ente the id :");
		int id=input.nextInt();
		System.out.println("Employname id is :"+id);
		
		System.out.println("Ente the salary :");
		int salary=input.nextInt();
		System.out.println("Employname salary is :"+salary);
				
		System.out.println("Ente the pincode :");
		int pincode=input.nextInt();
		System.out.println("Employname pincode is :"+pincode);
		
		System.out.println("Ente the Addres :");
		String address=input.nextLine();
		System.out.println("Employname Addres is :"+address);
		
	}
}
