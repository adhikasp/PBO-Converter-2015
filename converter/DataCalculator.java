/**
 * Program untuk mengkonversi data
 * @author Edward
 * @NIM 14/366059/TK/42095
 *
 */
package converter;

public class DataCalculator {

	/**
	 * Menentukan faktor pengali
	 */

	final private double terabyte_byte = 1099511628;
	final private double gigabyte_byte = 1073741824;
	final private double megabyte_byte = 1048576;
	final private double kilobyte_byte = 1024;
	final private double byte_byte = 1;

	private double x;

	/**
	 * Menentukan jenis faktor
	 * @param unit
	 */

	public DataCalculator (String unit)
	{
		if (unit.equals("tb"))
		{
			x= terabyte_byte;
		}
		else if (unit.equals("gb"))
		{
			x = gigabyte_byte;
		}
		else if (unit.equals("mb"))
		{
			x = megabyte_byte;
		}
		else if (unit.equals("kb"))
		{
			x = kilobyte_byte;
		}
		else if (unit.equals("b"))
		{
			x = byte_byte;
		}
	}

	/**
	 * Mengkonversi satuan yang diinginkan ke Byte
	 * @param unit
	 * @return
	 */
	public double toByte(double unit)
	{
		return (unit * x);
	}

	/**
	 * Mengkonversi Byte ke satuan yang diinginkan
	 * @param unit
	 * @return
	 */
	public double fromByte(double unit)
	{
		return (unit / x);
	}


}