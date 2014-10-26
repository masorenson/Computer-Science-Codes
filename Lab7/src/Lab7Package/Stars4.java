/* @author Michael Sorenson
 * Stars4.class
 * Precondition: none
 * Postcondition: none
 * prints stars in a diamond
 */
package Lab7Package;

public class Stars4
{
	public static void main (String[] args)
	{
		final int max = 10;
		
		// prints top half of the diamond
		for (int line = 1; line <= (max / 2); line++)
		{
		for (int space = 1; space <= ((max / 2) - line); space++)
			System.out.print (" ");
		for (int star = 1; star <= ((line * 2) - 1); star++)
			System.out.print ("*");
		System.out.println();
		}
		
		// prints bottom half of diamond
		for (int line = 1; line <= (max / 2); line++)
		{
		for (int space = 1; space <= (line - 1); space++)
			System.out.print (" ");
		for (int star = 1; star <= (max - (line * 2) + 1); star++)
			System.out.print ("*");
		System.out.println();
		}
	}
}