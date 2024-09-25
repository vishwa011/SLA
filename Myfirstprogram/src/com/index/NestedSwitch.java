//19-09-2024(Thursday)
package com.index;

public class NestedSwitch {
	public static void main(String args[]) {
		char branch='C';
		int collegeYear=3;
		
		
		switch(collegeYear) {
		case 1:
			System.out.println("English,Maths,Science");
			break;
		case 2:
			switch(branch) {
			case 'C':
			System.out.println("Operating system,java,Data Stucture");
			break;
			}
			
		case 'E':
			System.out.println("Microproccer,logic switching");
			break;
		case 'M':
			System.out.println("Manufacturing Machine");
			break;
			
		case 3:
			switch(branch) {
			case 'C':
				System.out.println("Computer Organization");
				break;
			case 'M':
				System.out.println("Electronic & Embedded Enginerring");
				break;
			case 'D':
				System.out.println("Mechanical Enginerring");
			};
			System.out.println("The branch is :"+branch);
		};
			
	}
	
}
