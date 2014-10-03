/************************************************************************************************************************************************
 * @author Michael
 * September 22 2014
 * Lab4StringAnalyzer.java
 * analyzes 2 strings
 ***********************************************************************************************************************************************/
package Lab4Package;

import java.util.Scanner;

public class Lab4StringAnalyzer {

	public static void main(String[] args){
	//scans for two words
		String word1;
		String word2;
		Scanner scan = new Scanner (System.in);
	System.out.println ("Enter a word in the next line:");
		word1 = scan.nextLine();
	System.out.println ("Enter another word in the next line:");
		word2 = scan.nextLine();
	
	//finds the word length and the first letter of the words
		int word1Length = word1.length();
		int word2Length = word2.length();
		char firstLetter1 = word1.charAt(0);
		char firstLetter2 = word2.charAt(0);
	//prints the words and their above values
	System.out.println("");
	System.out.println("Your first word is " + word1 + "\nThe length of this word is " + word1Length + " characters\nThe first letter of this word is "
					   + firstLetter1 + "\n");
	System.out.println("Your second word is " + word2 + "\nThe length of this word is " + word2Length + " characters\nThe first letter of this word is "
			   		   + firstLetter2 + "\n");
	
	//creats a new word that combines both of the above words
		String combinedWord = word1 + word2;
	//finds the length of the combined word and prints the word and its length
		int combinedLength = word1Length + word2Length;
	System.out.println("Both words combined is " + combinedWord + "\nThe length of the combined word is " + combinedLength + " characters");
	
	}
}