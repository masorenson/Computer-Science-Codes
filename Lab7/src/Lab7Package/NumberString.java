package Lab7Package;

import java.util.*;
/* @author Michael Sorenson
 * NumberString.class
 * Precondition: String entered is entered correctly
 * Postcondition: none
 * takes a string with three number and reprints it as the numbers in order
 */
public class NumberString
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers with spaces in between each number (e.g. \"1 7 3\").");
		String num = scan.nextLine();
		String int1Str = num.substring(0, 1);
		String int2Str = num.substring(2, 3);
		String int3Str = num.substring(4, 5);

		String first = "";
		String middle = "";
		String last = "";

		int int1 = num.charAt(0);
		int int2 = num.charAt(2);
		int int3 = num.charAt(4);

		//figures out where int1 is in the order
		if((int1 > int2) && (int1 > int3))
			last = int1Str;
		else if((int1 < int2) && (int1 < int3))
			first = int1Str;
		else
			middle = int1Str;

		//figures out where int2 is in the order
		if((int2 > int1) && (int2 > int3))
			last = int2Str;
		else if((int2 < int1) && (int2 < int3))
			first = int2Str;
		else
			middle = int2Str;

		//figures out where int3 is in the order
		if((int3 > int2) && (int3 > int1))
			last = int3Str;
		else if((int3 < int2) && (int3 < int1))
			first = int3Str;
		else
			middle = int3Str;

		//prints numbers in correct order
		String numStr = first + " " + middle + " " + last;
		System.out.println(numStr);
	}
}