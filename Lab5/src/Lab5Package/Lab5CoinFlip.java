/************************************************************************************************************************************************
 * @author Michael
 * September 22 2014
 * Lab4CoinFlip.java
 * Heads or Tails game
 ***********************************************************************************************************************************************/
package Lab5Package;
 
import java.util.Scanner;
import java.util.Random;
 
public class Lab5CoinFlip {
 
	public static void main(String[] args)
	{
		//Scan for name and choice
	Scanner scan = new Scanner (System.in);
	System.out.println("What is your name?");
	String name = scan.nextLine();
	System.out.println("Heads or Tails?");
	String choiceStr = scan.nextLine();
		//randomly select result as Heads or Tails, 1 being Heads, 2 being Tails
	Random generator = new Random();
	int result = generator.nextInt(2) + 1;
	String resultStr = "Tails";
	if (result == 1)
		resultStr = "Heads";
	else if (result == 2)
		resultStr = "Tails";
	int choiceInt = 0;
		//Convert player's choice to 1 or 2 so it can compare the result to the choice easily
	if (choiceStr.equalsIgnoreCase("Heads"))
	{
		choiceInt = 1;
	}
	else if (choiceStr.equalsIgnoreCase("Tails"))
	{
		choiceInt = 2;
	}
	else
		System.out.println("Error, rerun code, make sure to type \"Heads\" or \"Tails\"");
		//compares choice to result, 
	if(choiceInt == result)
		System.out.println("Nice job, " + name + ", you win! The coin flip was " + resultStr + ". You picked " + choiceStr + ".");
	else
		System.out.println("I'm Sorry, " + name + ", you lost. The coin flip was " + resultStr + ". You picked " + choiceStr + ".");
	}
}