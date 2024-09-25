package com.index;
//19-09-2024(Thursday)
public class SwitchString {
	public static void main(String args[]) {
		String levelString="Expert";
		int level=3;
		//Used String in Expression
		switch(levelString) {
		case "Beginner":level=1;
		break;
		case "Intermediatre":level=2;
		break;
		case "Expert":level=3;
		break;
		default:level=0;
		break;
		}
		System.out.println("Your level is :"+level);
	}
}
