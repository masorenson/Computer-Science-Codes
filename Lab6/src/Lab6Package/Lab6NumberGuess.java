package Lab6Package;

import java.util.Scanner;
import java.util.Random;

public class Lab6NumberGuess {
	
public static void main (String[] args)
{
	boolean gameover = false;
	int userGuess = 0;
	String response = "x";
	Scanner scan = new Scanner (System.in);
	Random generator = new Random();
	int num = generator.nextInt(100);
//-------------------------------------------------------------------------------------------------------------------------------
	while (gameover == false)
	{
		System.out.println("What is your guess?");
		userGuess = scan.nextInt();
		if (userGuess < num)
			System.out.println("Higher! Try again.");
			
		else if (userGuess > num)
			System.out.println("Lower! Try again.");
			
		else if (userGuess == num)
		{
			System.out.println("You got it! The number was " + num + ". Play again?");
			gameover = true;
			response = scan.nextLine();
			
			if (response.equalsIgnoreCase("Y"))
			{
				gameover = false;
				num = generator.nextInt(100);
			}
		}
	}	
}
}
