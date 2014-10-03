/************************************************************************************************************************************************
 * @author Michael
 * September 22 2014
 * Lab4RockPaperScissors.java
 * Rock Paper Scissors game
 ***********************************************************************************************************************************************/
package Lab5Package;
 
import java.util.Scanner;
import java.util.Random;
public class Lab5RockPaperScissors {
 
	public static void main(String[] args){
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Choose Rock, Paper, or Scissors(Type \"Rock\" \"Paper\" or \"Scissors\":");
	String playerStrChoice = scan.nextLine();
	int playerIntChoice = 0;
	if(playerStrChoice.equalsIgnoreCase("Rock"))
	{
		playerIntChoice = 1;
	}
	else if(playerStrChoice.equalsIgnoreCase("Paper"))
	{
		playerIntChoice = 2;
	}
	else if(playerStrChoice.equalsIgnoreCase("Scissors"))
	{
		playerIntChoice = 3;
	}
	else
		System.out.println("Error: You didn't choose Rock, Paper, or Scissors. Re-run the code");
	Random generator = new Random();
	int computerChoice = generator.nextInt(3) + 1;
	if(playerIntChoice == 1)
	{
		if(computerChoice == 1)
			System.out.println("Computer chose Rock, you chose Rock: You tied!");
		else if(computerChoice == 2)
			System.out.println("Computer chose Paper, you chose Rock: You lose!");
		else if(computerChoice == 3)
			System.out.println("Computer chose Scissors, you chose Rock: You win!");
	}
	else if(playerIntChoice == 2)
	{
		if(computerChoice == 1)
			System.out.println("Computer chose Rock, you chose Paper: You win!");
		else if(computerChoice == 2)
			System.out.println("Computer chose Paper, you chose Paper: You tied!");
		else if(computerChoice == 3)
			System.out.println("Computer chose Scissors, you chose Paper: You lose!");
	}
	else if(playerIntChoice == 3)
	{
		if(computerChoice == 1)
			System.out.println("Computer chose Rock, you chose Scissors: You lose!");
		else if(computerChoice == 2)
			System.out.println("Computer chose Paper, you chose Scissors: You win!");
		else if(computerChoice == 3)
			System.out.println("Computer chose Scissors, you chose Scissors: You tied!");
	
	}
}
 
}