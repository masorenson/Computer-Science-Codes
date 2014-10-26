package Lab7Package;

import java.util.Scanner;
/* @author Michael Sorenson
 * LeapYear.class
 * Precondition: number entered is an integer
 * Postcondition: none
 * finds if a year inputted by the user is a leap year
 */
public class LeapYear
{
	public static void main (String[] args)
	{
		int year;
		boolean leapYear = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a year to check if it is a leap year:");
		year = scan.nextInt();
		if (year < 1582)
			System.out.println("Error. Gegorian calendar didn't exist before 1582");
		else
		{
			if (year % 4 == 0)
			{
				leapYear = true;
				if ((year % 100 == 0) && (year % 400 != 0))
				{
					leapYear = false;
				}
			}
			if (leapYear == true)
				System.out.println(year + " is a leap year");
			else
				System.out.println(year + " is not a leap year");
		}
	}
}