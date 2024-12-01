package NewOne;

 class InvalidAge extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAge(String str) {
		super(str);
		}
	}
	public class TestCustomExcep{
		static void validate(int age)throws InvalidAge{
			if(age<18) {
				throw new InvalidAge("Age is not valid to vote");
			}
			else
			{
				System.out.println("Welcome to vote ");
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate(23);
		}
		catch(InvalidAge ex)
		{
			System.out.println("caught the Exception :");
			System.out.println("Excepion Accure"+ex);
		}
		System.out.println("Rest in code");
		}
	}