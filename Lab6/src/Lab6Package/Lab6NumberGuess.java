package Lab6Package;

import java.util.Scanner;
import java.util.Random;

public class Lab6NumberGuess {

	public static void main (String[] args)
	{
		boolean gameover = false;
		boolean responding = false;
		int userGuess = 0;
		String response = "";
		Scanner scan = new Scanner (System.in);
		Random generator = new Random();
		int num = generator.nextInt(101);
		//-------------------------------------------------------------------------------------------------------------------------------
		while (gameover == false)
		{
			System.out.println("What is your guess?");
			userGuess = scan.nextInt();
			if (userGuess < num)
				System.out.println("Higher!");

			else if (userGuess > num)
				System.out.println("Lower!");

			else if (userGuess == num)
			{
				System.out.println("You got it! The number was " + num + ". Play again? Type \"Y\" to keep going and \"N\" to stop.");
				responding = true;
			}
			while (responding == true)
			{
				response = scan.nextLine();
				if (response.equalsIgnoreCase("Y"))
				{
					gameover = false;
					num = generator.nextInt(101);
					responding = false;
				}
				else if (response.equalsIgnoreCase("N"))
				{
					gameover = true;
					System.out.println("Game Over.");
					responding = false;
				}
			}
		}
	}	
}