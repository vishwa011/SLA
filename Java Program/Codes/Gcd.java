package Codes;

import java.util.Scanner;

public class Gcd {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :");
		int gcd=sc.nextInt();
		System.out.println("Enter the X :");
		int x=sc.nextInt();
		System.out.println("Enter the Y:");
		int y=sc.nextInt();
		
//		int x=24, y=8, gcd=1;
		
		for(int i=1;i<=x && i<=y;i++) {
			if(x%i==0 && y%i==0) 
				gcd=i;
		}
		System.out.println("GCD of %d and %d is:"+ gcd);
	}
}
