package com.index;
import java.util.Scanner;
//if(Condition){Statement;}
//else if(Condition2){Statement;}
//else if(COndition3){Statement;}
//else if(Condition n){statement;}
//else{statement;} if condition is false
public class ControlFlowIfelseif {
	
	public static void main(String args[]) {
		int avg;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number :");
		avg=obj.nextInt();
		
		if(avg<=50) {
			System.out.println("you are fail");
		}
		else if((avg>50 && avg<=60)) {
			System.out.println("you are D Grade");
		}
		else if((avg>60 && avg<=70)) {
			System.out.println("you are C Grade");
		}
		else if((avg>70 && avg<=80)) {
			System.out.println("you are B Grade");
		}
		else if((avg>80 && avg<=90)) {
			System.out.println("you are A Grade");
		}
		else {
			System.out.println("you are fail");
		
		obj.close();}
	}
	
}
