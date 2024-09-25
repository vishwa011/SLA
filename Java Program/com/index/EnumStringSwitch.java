//19-09-2024(Thursday)
package com.index;
enum Bikes{Honda,Hero,Yamaha,Java,Bajaj,Bmw,Suzuki,Tvs}
public class EnumStringSwitch {
	public static void main(String args[]) {
		Bikes b;
		b=Bikes.Tvs;
		switch(b) {
		case Honda:
			System.out.println("Hurray! You have chosen Yamaha!");
			break;
		case Hero:
			System.out.println("Hurray! You have chosen Hero!");
			break;
		case Yamaha:
			System.out.println("Hurray! You have chosen Yamaha!");
			break;
		case Java:
			System.out.println("Hurray! You have chosen Java!");
			break;
		case Bajaj:
			System.out.println("Hurray! You have chosen Bajaj!");
			break;
		case Suzuki:
			System.out.println("Hurray! You have chosen Suzuki!");
			break;
		case Tvs:
			System.out.println("Hurray! You have chosen Tvs!");
			break;
		default:
			System.out.println("Hurray! You are chosen this list !");
			break;
		}
	}
}
