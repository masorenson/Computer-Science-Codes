/************************************************************************************************************************************************
 * @author Michael
 * September 23 2014
 * Lab4Distance.class
 * 
 ***********************************************************************************************************************************************/
package Lab4Package;

import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Lab4Distance {

	public static void main (String[] args)
	{
	//creates scanner and prompts user for lower and upper bound
	Scanner scan = new Scanner (System.in);
		int lowerBound;
		int upperBound;
	System.out.println("Enter an integer:");
		lowerBound = scan.nextInt();
	System.out.println("Enter another integer:");
		upperBound = scan.nextInt();
	//creates the range for the random choice of numbers in the range
		int range = upperBound - lowerBound + 1;
	Random generator = new Random();
		int x1 = generator.nextInt(range) + lowerBound;
		int x2 = generator.nextInt(range) + lowerBound;
		int y1 = generator.nextInt(range) + lowerBound;
		int y2 = generator.nextInt(range) + lowerBound;
		double distance = Math.sqrt((double)((x2-x1)^2) + (double)((y2 - y1)^2));
		double slope = (double)(x2 - x1)/(double)(y2 - y1);
	System.out.println("Point 1:     |(" + x1 + ", " + y1 + ")");
	System.out.println("Point 2:     |(" + x2 + ", " + y2 + ")");
	System.out.println("Distance:    |" + distance);
	System.out.println("Slope:       |" + slope);
	}
	
}
