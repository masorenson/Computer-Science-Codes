/* author Michael Sorenson
 * 12 Sept 2014
 * convert celsius to fahrenheit and visa versa
 * type casting and parsing
 */
package Lab3Package;

public class CelciusToFahrenheit {
	public static void main (String [] args){
		int /*making it an integer*/ celsius = 20;
		System.out.println ("");
		
		//explicit
		System.out.println ("celsius = " + celsius);
		System.out.println ("celsius = " + (double)celsius);
		System.out.println ("celsius = " + celsius + celsius); //will be 2020, because celsius + celsius is a String when concatenated onto the "celsius = " because the "celsius = " is a String
		System.out.println ("celsius = " + (celsius + celsius));
		System.out.println (celsius + celsius + " is celsius temp.");
		
		//implicit
		double cel = 30; // although assigned an integer to a double, it prints as 20.0 (a double)
		System.out.println (cel);
		System.out.println (cel + celsius);
		//int answer = cel + celsius;
		
		
		double fahrRet = calculate(celsius);
		System.out.println(celsius + " degrees Celsius = " + fahrRet + " degrees fahrenheit.");
	}
	public static double calculate (int celsius){
	double fahrenheit = 32.0 + (1.8) * (celsius);
	return fahrenheit;
	}
}


