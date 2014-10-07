/***********************************************************************************************************************************************
 * @author Michael Sorenson
 * October 2, 2014
 * Lab6WordSplitter.java
 * Splits a word and prints each letter on a separate line
 ***********************************************************************************************************************************************/
package Lab6Package;

import java.util.Scanner;

public class Lab6WordSplitter {

	public static void main (String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a word to print each letter on a new line:");
		String str = scan.nextLine();
		int length = str.length();
		int index = 0;
		while (index < length)
		{
			System.out.println(str.charAt(index));
			index = index + 1;
		}
	}
}