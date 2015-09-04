/**
 * Konversi berbagai satuan volume yand digunakan ketika memasak.
 * @author Anif Nur Mustaqim
 * @NIM 14/366010/TK/42086
 *
 */


package converter;

class CookingCalculator
{

	final private double TES_TO_ML = 4.928922;
	final private double TAS_TO_ML = 14.786765;
	final private double CUP_TO_ML = 250;

	private double factor;


	public CookingCalculator (String unit)
	{
		if (unit.equals("teaspoon"))
		{
			factor = TES_TO_ML;
		}
		else if (unit.equals("tablespoon"))
		{
			factor = TAS_TO_ML;
		}
		else if (unit.equals("cup"))
		{
			factor = CUP_TO_ML;
		}
	}

	public double toMl(double measurement)
	{
		return (measurement * factor);
	}
	public double fromMl(double measurement)
	{
		return (measurement / factor);
	}
}
