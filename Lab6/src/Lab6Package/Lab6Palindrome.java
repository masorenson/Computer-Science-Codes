/***********************************************************************************************************************************************
 * @author Michael Sorenson
 * October 5, 2014
 * Lab6Palindrome.java
 * Tests words to see if they are palindromes
 ***********************************************************************************************************************************************/
package Lab6Package;
 
import java.util.*;
 
public class Lab6Palindrome {
 
	public static void main(String[] args) {
		boolean playing = true;
		boolean newGame = true;
		int counter = 0;
		int letterCounter = 0;
		int lengthWord = 0;
		int lengthBackwardsWord = 0;
		int index = 100;
		String word = "";
		String backwardsWord = "";
		String character = "";
		Scanner scan = new Scanner(System.in);
		//-------------------------------------------------------------------------------------------------------------------------------
		while (playing == true)
		{
			//-------------------------------------------------------------------------------------------------------------------------------
			while (newGame == true)
			{
				if (counter == 0)
				{
					System.out.println("Type a word to check if it is a palindrome");
					word = scan.nextLine();
					newGame = false;
					lengthWord = word.length();
					index = word.length();
				}
				else
				{
					newGame = false;
					lengthWord = word.length();
					index = word.length();
				}
			}
			//-------------------------------------------------------------------------------------------------------------------------------
			if (!(lengthWord == lengthBackwardsWord))
			{
				if (letterCounter == 0)
				{
					character = word.substring(index - 1);
					backwardsWord = character;
				}
				else if (letterCounter > 0)
				{
					character = word.substring(index - 1);
					backwardsWord = backwardsWord + character;
				}
				else
					lengthBackwardsWord = backwardsWord.length();
				index = index - 1;
				letterCounter = letterCounter + 1;
			}
			else if ((lengthWord == lengthBackwardsWord) && (!(word == backwardsWord)))
			{
				System.out.println("Not a palindrome. Type a word to check again or type \"Quit\" to quit.");
				word = scan.nextLine();
				if (word.equalsIgnoreCase("Quit"))
				{
					playing = false;
					System.out.println( "Have a nice day.");
				}
				else
				{
					newGame = true;
					counter = counter + 1;
				}
			}
			else if ((lengthWord == lengthBackwardsWord) && (word == backwardsWord))
			{
				System.out.println( "It is a palindrome! Type a word to check again or type \"Quit\" to quit.");
				word = scan.nextLine();
				if (word.equalsIgnoreCase("Quit"))
				{
					playing = false;
					System.out.println( "Have a nice day.");
				}
				else
				{
					newGame = true;
					counter = counter + 1;
				}
			}
		}
	}
}