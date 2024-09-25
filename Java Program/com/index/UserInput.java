package com.index;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String args[]) {
		
		Scanner myobj=new Scanner(System.in);
		
		System.out.println("Enter the number a :");
		String a1=myobj.nextLine();
		System.out.println("The String is :"+a1);
		
		System.out.println("Enter the String a1 :");
		int a=myobj.nextInt();
		System.out.println("Enter the number a:"+a);
	}

}
