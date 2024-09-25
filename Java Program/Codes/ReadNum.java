package Test;

import java.util.Scanner;

public class ReadNum {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 0 to 1000 :");
		
		int num,digit,sum=0;
		
		num=sc.nextInt();
		
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("Sum digit :"+sum);
	}
}
