package multiple;

import java.util.Scanner;

public class Multiple 
{
	public static void main (String[]args) 
	{
		@SuppressWarnings("resource")
		Scanner input=new Scanner (System.in);
		int integer1;
		int integer2;
		boolean multiple;
		
		System.out.print("Enter first integer: ");
		integer1 = input.nextInt();
		System.out.print("Enter second integer: ");
		integer2 = input.nextInt();
		
		multiple = isMultiple(integer1, integer2);
		if (multiple == true )
		{
			System.out.print(integer1 + " is a multiple of " + integer2);
		}
		else 
		{
			System.out.print(integer1 + " is not a multiple of " + integer2);
		}
	}
	
	public static boolean isMultiple (int integer1, int integer2)
	{
		return integer2 % integer1 == 0;
	}
}
