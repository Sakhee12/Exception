package exception;

public class Testcase2 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			String s = null; 
			try
			{
				System.out.println(s.length());
							
			}
			catch(NullPointerException ref)
			{
				System.out.println("Catch in Catch");
			}
			System.out.println("Hello");
		}
		finally
		{
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Last Catch");
			}
		}
	}
}
