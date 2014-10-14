package Lab3Package;
import java.util.*;
public class ChangeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
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
		System.out.println("Quarters: " + quarterCounter + "\nDimes: " + dimeCounter + "\nNickels: " + nickelCounter + "\nPennies: " + pennyCounter);
		
	}

}
