/************************************************************************************************************************************************
 * @author Michael
 * September 22 2014
 * Lab4GradeAssigner.java
 * Tells user their grade based on the percent
 ***********************************************************************************************************************************************/
package Lab5Package;
 
import java.util.Scanner;
 
public class Lab5GradeAssigner {
 
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("What Percent did you get?");
		double percent = scan.nextDouble();
		char letterGrade = 'Z';
		if (percent >= (double)90)
		{
			letterGrade = 'A';
		}
		else if ((percent >= (double)80) && (percent < (double) 90))
		{
			letterGrade = 'B';
		}
		else if ((percent >= (double)70) && (percent < (double)80))
		{
			letterGrade = 'C';
		}
		else if ((percent >= (double)(60)) && (percent < (double)70))
		{
			letterGrade = 'D';
		}
		else
		{
			letterGrade = 'F';
		}
		System.out.println("Your letter grade is " + letterGrade + ".");
	}
}