package Codes;

public class Recursive {
	public static void main(String args[]) {
		int result=sum(10);
		
		System.out.println("The value is "+result);
	}

	public static int sum(int i) {
		if(i>0) {
			return i + sum(i-1);
		}else {
			return 0;
		}
		
	
	}
}
