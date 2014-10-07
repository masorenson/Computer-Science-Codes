/***********************************************************************************************************************************************
 * @author Michael Sorenson
 * October 2, 2014
 * Lab6Factors.java
 * Prints a number and its prime number factors
 ***********************************************************************************************************************************************/
 
package Lab6Package;
 
import java.util.Scanner;
 
public class Lab6Factors {
 
	public static void main (String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number to see its factors:");
		int num = scan.nextInt();
		int factor = 2;
		System.out.println(num + ": ");
		while (!(num == 1))
		{
			if ((num % factor == 0) && (!((num / factor) == 1)))
			{
				if ((num / factor) % factor == 0)
				{
					System.out.print(factor + " * ");
					num = num / factor;
				}
				else
				{
					System.out.print(factor + " * ");
					num = num / factor;
					factor = factor + 1;
				}
			}
			else if ((num % factor == 0) && (num / factor == 1))
			{
				System.out.print(factor + " * 1");
				num = num / factor;
			}
			else 
				factor = factor + 1;
		}
	}
}