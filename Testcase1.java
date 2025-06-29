package exception;
  

//SQUENCE SHOULD BE TRY-CATCH-FINALLY


public class Testcase1 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);
		}
		
		finally
		{
			System.out.println("hhhhheeeeeeeeeeeeeeeee");
		}
		
		catch(ArithmeticException ref)
		{
			System.out.println(rrrrrrrrrrrrrrrrrrrrrrrr);
		}
	}
}
