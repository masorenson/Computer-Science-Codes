/* author Michael Sorenson
 * 12 Sept 2014
 * Find the Volume of a room in Inches and convert to feet cubed and inches cubed
 */
package Lab3Package;

public class Lab3Volume {

	public static void main(String[] args) {
		//assign variables
	String side1Inches = "5";
	String side2Inches = "10";
	String side3Inches = "15";
		//print variable assignments
	System.out.println ("The length of side 1 in inches is " + side1Inches + " inches.");
	System.out.println ("The length of side 2 in inches is " + side2Inches + " inches.");
	System.out.println ("The length of side 3 in inches is " + side3Inches + " inches.");
		//parsing variables into doubles (because the decimal is important)
	Double numSideOneInches = Double.parseDouble (side1Inches);
	Double numSideTwoInches = Double.parseDouble (side2Inches);
	Double numSideThreeInches = Double.parseDouble (side3Inches);
		//calculates volume in inches and feet
	Double VolumeInInches = numSideOneInches * numSideTwoInches * numSideThreeInches;
	Double VolumeInFeet = (numSideOneInches * numSideTwoInches * numSideThreeInches) / 12.0;
		//prints volume in inches and feet
	System.out.println ("The Volume in cubic inches is " + VolumeInInches + " cubic inches");
	System.out.println ("The Volume in cubic feet is " + VolumeInFeet + " cubic feet.");
		//Pretties it up and makes if feet and inches
	Double remainderOfInches = (numSideOneInches * numSideTwoInches * numSideThreeInches) % 12.0;
	int feetWithoutRemainder = (int)(numSideOneInches * numSideTwoInches * numSideThreeInches) / 12;
	System.out.println ("The Volume is " + feetWithoutRemainder + " cubic feet and " + remainderOfInches + " cubic inches.");
	}
}