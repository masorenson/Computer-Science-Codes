/* @author Michael Sorenson
 * Stars3.class
 * Precondition: none
 * Postcondition: none
 * prints stars in a triangle
 */
package Lab7Package;

public class Stars2
{
	public static void main (String[] args)
	{
		final int max = 10;
		for (int line = 1; line <= max; line++)
		{
			for (int space = 1; space <= (max - line); space++)
			{
			System.out.print (" ");
			}
			for (int star = 1; star <= line; star++)
			{
			System.out.print ("*");
			}
			System.out.println();
		}
	}
}