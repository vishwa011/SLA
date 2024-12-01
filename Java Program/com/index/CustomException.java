package NewOne;
import java.util.*;
//custom exception user define exception it used to define which are basically drive classes of exception
//
public class CustomException extends Exception {
	private static int accno[] = {1001,1002,1004,1005};
	private static String name[] = {"Ram","Prasun","Sam","Buddha"};
	private static double balanc[] =  {100000.00,123333.00,999,678997.00};
	
	public CustomException() {}
	public CustomException(String str)
	{
		super(str);
	}
	public static void main(String[] args) {
		try
		{
			System.out.println("ACCNO"+"\t"+"NAME"+"\t"+"BALANCE");
			for(int i=0;i<5;i++) {
				System.out.println(accno[i]+"\t"+name[i]+"\t"+balanc[i]);
				if(balanc[i]<1000) {
					CustomException me=new CustomException("Balance is less than 1000");
					throw me;
				}
			}
		}
		catch(CustomException e)
		{
			e.printStackTrace();
		}
	}
}
