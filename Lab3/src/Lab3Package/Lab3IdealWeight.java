/* author Michael Sorenson
 * Calculates the Ideal Weight of a person based on their height and sex
 * uses if, else if, else statements 
 */
package Lab3Package;

public class Lab3IdealWeight {
	/*Sorry Ms. Boyko, I made this more complex than it needed to be and only prints 
	 * the male ideal weight if you are male and female ideal weight if female.
	 */

	public static void main(String[] args) {
		//must plug in a number for Feet (e.g. 5' 3": put 5 for feet and 3 for inches)
		int feet = 5;
		int inches = 5;
		//make this boolean false  if you are female 
		boolean male = true;
		int differenceFromFiveFeet = ((feet * 12) + inches) - 60;
		//initializes two variables which vary depending on whether the person is male or female
		int startingWeight;
		int idealWeight;
		double idealRange;
			if (male == true) {
				startingWeight = 106;
				idealWeight = startingWeight + 6 * (differenceFromFiveFeet);
				idealRange = .15 * (double)idealWeight;
				System.out.println("The Ideal Weight for a male who is " + feet + " feet and " + inches + " inches tall is at least " + (idealWeight - idealRange) + " pounds and no greater than " + (idealWeight + idealRange) + " pounds.");
			}
			else if (male == false) {
				startingWeight = 100;
				idealWeight = startingWeight + 5 * (differenceFromFiveFeet);
				idealRange = .15 * (double)idealWeight;
				System.out.println("The Ideal Weight for a female who is " + feet + " feet and " + inches + "inches tall is at least " + (idealWeight - idealRange) + " pounds and no greater than " + (idealWeight + idealRange) + " pounds.");
			}
			
	}

}
