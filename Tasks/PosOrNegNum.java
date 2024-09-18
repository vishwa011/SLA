package Tasks;

import java.util.Scanner;
public class PosOrNegNum {
	public static void main(String args[]) {
		int a;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number :");
		a=obj.nextInt();
		
		if(a>0) {
			System.out.println("positive number");		
		}
		else if(a==0){
			System.out.println("Print 0");
		}
		else if(a<0){
			System.out.println("Negative number");
		}
		
	}
}
