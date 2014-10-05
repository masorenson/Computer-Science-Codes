/***********************************************************************************************************************************************
 * @author Michael Sorenson
 * October 4, 2014
 * Lab6NumberGuessExtension.java
 * Number Guess Game with a selected range
 ***********************************************************************************************************************************************/
package Lab6Package;
 
import java.util.*;
 
public class Lab6NumberGuessExtension {
 
public static void main (String[] args)
{
int lower = 0;
int upper = 0;
int guessesLeft = 0;
int userGuess = 0;
int num = 0;
int selection = 0;
String response = "";
boolean newGame = true;
boolean gameover = false;
boolean responding = false;
Scanner scan = new Scanner(System.in);
Random generator = new Random();
//while statement for the game
while (gameover == false)
{
	//while statement to initialize game when the game is not over and newGame is set to true
	while (newGame == true)
	{
		System.out.println("Please select the range you want to play with (enter 1, 2, 3, or 4):");
		System.out.println("1. 0 - 10");
		System.out.println("2. 0 - 100");
		System.out.println("3. 0 - 500");
		System.out.println("4. 0 - 1000");
		selection = scan.nextInt();
		
		if (selection == 1)
		{
			upper = 10;
			guessesLeft = 4;
			newGame = false;
		}
		
		
		else if (selection == 2)
		{
			upper = 100;
			guessesLeft = 7;
			newGame = false;
		}
		
		
		else if (selection == 3)
		{
			upper = 500;
			guessesLeft = 9;
			newGame = false;
		}
		
		
		else if (selection == 4)
		{
			upper = 1000;
			guessesLeft = 10;
			newGame = false;
		}
		num = generator.nextInt(upper + 1);
	}
//ask for guess when game isn't over
	System.out.println("What is your guess?");
	userGuess = scan.nextInt();
//deals with the guess being lower than the actual number
	if (userGuess < num)
	{
		if (guessesLeft > 1)
			System.out.println("Higher! you have " + guessesLeft + " guesses left.");
			
		else if (guessesLeft == 1)
			System.out.println("Higher! you have 1 guess left.");
			
		else if (guessesLeft == 0)
			System.out.println("You lose! You have no guesses left. If you want to keep guessing, keep going.");
			
		else if (guessesLeft < 0)
			System.out.println("Higher! You already ran out of guesses!");
			
		guessesLeft = guessesLeft - 1;
	}	
	
	//deals with the guess being higher than the actual number
	else if (userGuess > num)
	{
		if (guessesLeft > 1)
			System.out.println("Lower! you have " + guessesLeft + " guesses left.");
			
		else if (guessesLeft == 1)
			System.out.println("Lower! you have 1 guess left.");
			
		else if (guessesLeft == 0)
			System.out.println("Lower! You have no guesses left but if you want to keep guessing, keep going.");
			
		else if (guessesLeft < 0)
			System.out.println("Lower! You already ran out of guesses!");
			
		guessesLeft = guessesLeft - 1;
	}	
	
	//deals with the guess being equal to the actual number
	else if (userGuess == num)
	{
		System.out.println("You got it! The number was " + num);
		responding = true;
	}
	while (responding)
	{
		System.out.println("Play again? Type \"Y\" to keep going and \"N\" to stop.");
		response = scan.nextLine();
		if (response.equalsIgnoreCase("Y"))
		{
			newGame = true;
			responding = false;
		}

		else if (response.equalsIgnoreCase("N"))
		{
			gameover = true;
			responding = false;
			System.out.println("Game Over");
		}
	}
}
}
}