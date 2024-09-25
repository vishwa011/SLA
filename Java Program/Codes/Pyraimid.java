package Codes;

import java.util.Scanner;

public class Pyraimid {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count :");
		int row=sc.nextInt();
		
		int rowCount=1;
		
		for(int i=row;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=rowCount;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
			rowCount++;
		}
	}
}
