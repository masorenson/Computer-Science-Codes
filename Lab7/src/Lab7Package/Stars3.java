/* @author Michael Sorenson
 * Stars4.class
 * Precondition: none
 * Postcondition: none
 * prints stars in a triangle
 */
package Lab7Package;

public class Stars3
{
	public static void main (String[] args)
	{
		final int max = 10;
		
		for (int line = 1; line <= max; line++)
		{
			for (int space = 1; space <= line - 1; space++)
			{
				System.out.print (" ");
			}
			for (int star = 1; star <= (max - line + 1); star++)
			{
				System.out.print ("*");
			}
			System.out.println();
		}
	}
}