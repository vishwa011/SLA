package Tasks;

import java.util.Scanner;
//doubt this object creation correct or not the another 
public class EmpDetails {
	public static void main(String args[]) {
		String Name;
		int Id,age,phone;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Details Name :");
		Name=obj.nextLine();
		System.out.println("Enter the Id :");
		Id=obj.nextInt();
		System.out.println("Enter the Age :");
		age=obj.nextInt();
		System.out.println("Enter the phone :");
		phone=obj.nextInt();
		
		if(age>90) {
			System.out.println("You Are not eligible in this company");
		}
		else {
			System.out.println("You are eligible this company");
			
			obj.close();
		}
	}
}
