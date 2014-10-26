/* @author Michael Sorenson
 * Stars1.class
 * Precondition: none
 * Postcondition: none
 * prints stars in a triangle
 */
package Lab7Package;

public class Stars1
{
	public static void main (String[] args)
	{
		final int max = 10;
		for (int line = 1; line <= max; line++)
		{
			for (int star = 1; star <= (max - line + 1); star++)
			System.out.print ("*");
			System.out.println();
		}
	}
}