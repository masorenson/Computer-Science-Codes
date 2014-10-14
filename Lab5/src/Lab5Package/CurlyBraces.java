/* @author Michael Sorenson
 * October 13, 2014
 * finds if a String's beginning and ending curly braces match
 */
package Lab5Package;

import java.util.*;

public class CurlyBraces {
	
	public static void main(String[] args) 
	{
//initializing variables and defining them
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String with curly braces:");   
		String str = scan.nextLine();
		int position = 0;
		String bracesString="";
		int beginningCurlyCounter = 0;
		int endingCurlyCounter = 0;
		boolean correct = true;
//while statement to add curly braces to the curly brace string
		while (position <= str.length() - 1) 
		{
			if (str.charAt(position) == '{') 
			{
				bracesString = bracesString + '{'; 
			}
			else if (str.charAt(position) == '}') 
			{
				bracesString = bracesString + '}';
			}
			position ++ ; 
		}
//if curly brace string is odd, then there cannot be equal beginning and ending curly braces
		if (bracesString.length() % 2 != 0)
		{
			correct = false;
		}
		else
		{
			position = 0;
//counts beginning and ending curly braces
			while (position<= bracesString.length() - 1) 
			{
				if (bracesString.charAt(position) == '{')
				{
					beginningCurlyCounter ++ ;
				}
				else
				{
					endingCurlyCounter ++ ;
				}
				position ++ ; 
			}
//if there are not equal beginning and ending curly braces, string doesn't have matching braces
			if (beginningCurlyCounter != endingCurlyCounter)
			{
				correct = false;
			}
			else
			{
//finds if String is correct if and only if beginning brace is beginning and ending brace is ending
				if ((bracesString.charAt(0) == '{') && (bracesString.charAt(bracesString.length() - 1) == '}'))
				{
					position = 0;
					beginningCurlyCounter = 0;
					endingCurlyCounter = 0;
//next two while statements find if the beginning and ending curly braces are in correct order
					while (position < (bracesString.length() / 2)) 
					{
						if (bracesString.charAt(position) == '}') 
						{
							endingCurlyCounter ++ ;
						}
						position ++ ;
					}
					while (position < bracesString.length()) 
					{
						if (bracesString.charAt(position) == '{') 
						{
							beginningCurlyCounter ++ ;
						}
						position ++ ; 
					}
//determines if String is correct
					if (bracesString.length() / 4 < endingCurlyCounter)
					{
						correct = false;
					}
					if (bracesString.length() / 4 < beginningCurlyCounter) 
					{
						correct = true; 
					}
				} 
//if first curly brace is not beginning or last curly brace is not ending, curly braces don't match
				else 
					correct = false; 
			}
		}
//cascading if to print whether the braces are matching or not matching
		if (correct == true)
		{
			System.out.println("The String's curly braces match!");
		}
		else
		{
			System.out.println("The String's curly braces don't match :(");
		}
	}
}