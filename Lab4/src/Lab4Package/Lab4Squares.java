/************************************************************************************************************************************************
 * @author Michael
 * September 22 2014
 * Lab4Squares.java
 * creates a square out of a number and scans for name, quest, favorite color
 ***********************************************************************************************************************************************/

package Lab4Package;

import java.util.Scanner;

public class Lab4Squares {

	public static void main (String[] args){
	String name;
	String quest;
	String favorite_color;
	int favorite_number;
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your name?");
	name = scan.nextLine();
	System.out.println("What is you quest?");
	quest = scan.nextLine();
	System.out.println("What is your favorite color?");
	favorite_color = scan.nextLine();
	System.out.println("What is your favorite number?");
	favorite_number = scan.nextInt();
	System.out.println("Hi " + name + ", the square of your favorite number is " + (favorite_number * favorite_number));
	System.out.println("I hope you do well on your quest to " + quest + " and I'm pleased to say my favorite color is also " + favorite_color + ".");
	}
}
