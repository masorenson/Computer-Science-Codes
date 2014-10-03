/************************************************************************************************************************************************
 * @author Michael
 * September 22 2014
 * Lab4Average.java
 * asks for test scores and finds the average, printing all information to the console
 ***********************************************************************************************************************************************/

package Lab4Package;

import java.util.Scanner;

public class Lab4Average {

	public static void main (String[] args){

		//Test 1 numerator as t1n, Test 1 denominator as t1d
	double t1n;
	double t1d;
	Scanner scan = new Scanner(System.in);
	System.out.println("How many points did you get on Test1?");
	t1n = scan.nextDouble();
	System.out.println("How many points was Test1 out of?");
	t1d = scan.nextDouble();
		//Test 2 numerator as t2n, Test 2 denominator as t2d
	double t2n;
	double t2d;
	System.out.println("How many points did you get on Test2?");
	t2n = scan.nextDouble();
	System.out.println("How many points was Test2 out of?");
	t2d = scan.nextDouble();
		//Test 3 numerator as t3n, Test 3 denominator as t3d
	double t3n;
	double t3d;
	System.out.println("How many points did you get on Test3?");
	t3n = scan.nextDouble();
	System.out.println("How many points was Test3 out of?");
	t3d = scan.nextDouble();
		//Exam numerator as examn, Test 1 denominator as examd
	double examn;
	double examd;
	System.out.println("How many points did you get on the Exam?");
	examn = scan.nextDouble();
	System.out.println("How many points was the Exam out of?");
	examd = scan.nextDouble();
		//Average calculated from the numerators and denominators
	double aven = t1n + t2n + t3n + examn;
	double aved = t1d + t2d + t3d + examd;
		//Prints Test Scores and Average
	System.out.println("Test 1  " + "   " + t1n + "/" + t1d + "   " + (100 * (t1n/t1d)) + "%");
	System.out.println("Test 2  " + "   " + t2n + "/" + t2d + "   " + (100 * (t2n/t2d)) + "%");
	System.out.println("Test 3  " + "   " + t3n + "/" + t3d + "   " + (100 * (t3n/t3d)) + "%");
	System.out.println("Exam  " + "     " + examn + "/" + examd + "   " + (100 * (examn/examd)) + "%");
	System.out.println("Average " + "   " + aven + "/" + aved + "   " + (100 * (aven/aved)) + "%");
	}
	
}
