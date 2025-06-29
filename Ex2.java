package exception;

import java.util.Scanner;

//	MULTIPLE CATCH BLOCK OR NESTED CATCH BLOCK

public class Ex2 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first No:");
			int num = sc.nextInt();
			System.out.println("Enter second no:");
			int den = sc.nextInt();
			
			int result = num/den;
			System.out.println("Answer: "+result);
						
		}
		
		catch(ArithmeticException ref)
		{
			System.out.println("Don't divide with 0");
		}
		
		catch(ClassCastException ref)
		{
			System.out.println("Class Caste Exception");
		}
		
		catch(NullPointerException ref)
		{
			System.out.println("Null Pointer Exception");
		}
		
		catch(Exception ref)
		{
			System.out.println("Exception");
		}
		
		catch(Throwable ref)
		{
			System.out.println("Throwable");
		}
		
		System.out.println("Thank You");
	}
}
