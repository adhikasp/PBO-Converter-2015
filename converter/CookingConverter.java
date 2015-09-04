/**
 * Konversi berbagai satuan volume yand digunakan ketika memasak.
 * @author Anif Nur Mustaqim
 * @NIM 14/366010/TK/42086
 *
 */

package converter;

import java.util.Scanner;

public class CookingConverter implements Converter
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("convert from (teaspoon, tablespoon, or cup): ");
		String fromUnit = in.nextLine();

		System.out.print ("Convert to (teaspoon, tablespoon, or cup) : ");
		String toUnit = in.nextLine();

		CookingCalculator from = new CookingCalculator(fromUnit);
		CookingCalculator to = new CookingCalculator(toUnit);

		System.out.print("value: ");
		double val = in.nextDouble();

		double ml = from.toMl(val);
		double converted = to.fromMl(ml);

		System.out.println(val + " " + fromUnit + " = " + converted + " " + toUnit);
	}

	public void execute()
	{
		CookingConverter.main(null);
	}
}
