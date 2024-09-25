package com.index;

import java.util.Scanner;

public class NestedIf {
	public static void main(String args[]) {
		int age;
		int weight;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number :");
		age=obj.nextInt();
		weight=obj.nextInt();
		
		if(age>20){
			if(weight>50) {
				System.out.println("You are eligible to denote blood");
			}
			else {
				System.out.println("You Are must more then 20");
			}
		}
		else {
			System.out.println("You are not eligible");
			
			obj.close();
		}
		
	}
}
