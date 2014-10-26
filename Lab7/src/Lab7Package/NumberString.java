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
		int first = 0;
		int middle = 0;
		int last = 0;
		
		int int1 = num.charAt(0);
		int int2 = num.charAt(2);
		int int3 = num.charAt(4);
		
		//figures out where int1 is in the order
		if((int1 > int2) && (int1 > int3))
			first = int1;
		else if((int1 < int2) && (int1 < int3))
			last = int1;
		else
			middle = int1;
			
		//figures out where int2 is in the order
		if((int2 > int1) && (int2 > int3))
			first = int2;
		else if((int2 < int1) && (int2 < int3))
			last = int2;
		else
			middle = int2;
			
		//figures out where int3 is in the order
		if((int3 > int2) && (int3 > int1))
			first = int3;
		else if((int3 < int2) && (int3 < int1))
			last = int3;
		else
			middle = int3;
			
		//prints numbers in correct order
		String firstStr = "" + first;
		String middleStr = "" + middle;
		String lastStr = "" + last;
		String numStr = first + " " + middle + " " + last;
	}
}