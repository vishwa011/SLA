package Codes;

import java.util.Scanner;

public class Weekdays {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number :");
		int day=obj.nextInt();
		
		System.out.println(getDayName(day));
	}
	public static String getDayName(int day) {
		String dayName = "";
		switch(day){
		case 1:dayName="Monday";
		break;
		case 2:dayName="Tuesday";
		break;
		case 3:dayName="Wednesday";
		break;
		case 4:dayName="Thursday";
		break;
		case 5:dayName="friday";
		break;
		case 6:dayName="Saturday";
		break;
		case 7:dayName="Sunday";
		default:dayName="Invalid Name";
		}
		return dayName;
		
		
	}
}
