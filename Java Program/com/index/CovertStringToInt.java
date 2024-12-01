package NewOne;

public class CovertStringToInt {
	public static void main(String[] args)
	{
		String s="200";
		
		int i=Integer.parseInt(s);
		System.out.println("Strint to Integer:"+i);
		
		int in=200;
		
		String st=String.valueOf(in);
		System.out.println("Integer to String:"+st);
	}
}
