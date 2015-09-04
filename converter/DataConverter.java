/**
 * Program untuk menampilkan hasil
 * @author Edward
 * @NIM 14/366059/TK/42095
 *
 */

package converter;
import java.util.Scanner;


public class DataConverter implements Converter {

	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Program pengkonversi satuan data terabyte(tb)/gigabyte(gb)/megabyte(mb)/kilobyte(kb)/byte(b)");

		System.out.print("Silahkan masukkan unit (tb/gb/mb/kb/b): ");
		String fromByte = in.nextLine();

		System.out.print("Konversi ke (tb/gb/mb/kb/b) : ");
		String toByte = in.nextLine();

		DataCalculator from = new DataCalculator(fromByte);
		DataCalculator to   = new DataCalculator(toByte);

		System.out.print("Nilai: ");
		double val = in.nextDouble();

		double unit = from.toByte(val);
		double converted = to.fromByte(unit);

		System.out.println(val + " " + fromByte + " = " + converted + " " + toByte);
	}

	public void execute()
	{
		DataConverter.main(null);
	}
}
