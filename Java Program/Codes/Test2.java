package Test;

import java.util.Scanner;

public class Test2 {
	public static void main(String args[]) {
		String Name;
		int RollNum;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Name :");
		Name=obj.next();
		System.out.println("Enter the number :");
		RollNum=obj.nextInt();
		System.out.println("Enter the M1 :");
		int M1=obj.nextInt();
		System.out.println("Enter the M2 :");
		int M2=obj.nextInt();
		System.out.println("Enter the M3 :");
		int M3=obj.nextInt();
		System.out.println("Enter the M4 :");
		int M4=obj.nextInt();
		
		System.out.println("Sum of Marks :");
		int sum=(M1+M2+M3+M4);
		System.out.println(sum);
		
		System.out.println("Average :");
		double Avg=(sum/5);
		System.out.println(Avg);
		
		
	}
}