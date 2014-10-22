package Lab5Package;

import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("How much money do you need to be converted into change (in the form of dollars.cents)?");
		double numDub = scan.nextDouble();
		int num = (int)(numDub * 100);
		int quarterCounter = 0;
		int dimeCounter = 0;
		int nickelCounter = 0;
		int pennyCounter = 0;
		while (num > 0)
		{
			if (num >= 25)
			{
				num = num - 25;
				quarterCounter ++;
			}
			else if (num >= 10)
			{
				num = num - 10;
				dimeCounter ++;
			}
			else if (num >= 5)
			{
				num = num - 5;
				nickelCounter ++;
			}
			else if (num >= 1)
			{
				num = num - 1;
				pennyCounter ++;
			}
		}
		System.out.println("Quarters: " + quarterCounter);
		System.out.println("Dimes: " + dimeCounter);
		System.out.println("Nickels: " + nickelCounter);
		System.out.println("Pennies: " + pennyCounter);
	}
	}
