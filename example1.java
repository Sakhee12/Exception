package exception;
import java.util.Scanner;

public class example1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Second Number:");
		int num2 = sc.nextInt();
		
		try
		{
			int den=num1/num2;
			System.out.println(den);
		}
		catch(ArithmeticException ref)
		{
			System.out.println("Don't divide with zero");
		}
		
		
	}
}
