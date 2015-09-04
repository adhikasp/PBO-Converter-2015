/**
* Konversi Fahrenheit -> Celcius
* Created by:
* @author Syuhada Sipayung
* @NIM 14/363614/TK/41701
*/

package converter;
import java.util.Scanner;

public class TemperatureConverter implements Converter
{
   public static void main (String[] args) {
      float temperature;
      Scanner in = new Scanner(System.in);

      System.out.print("Masukkan suhu Fahrenheit : ");

      temperature = in.nextInt ();

      temperature = ((temperature - 32)*5)/9;

      System.out.println("Suhu Celcius =" + temperature);
     }

    public void execute()
    {
        TemperatureConverter.main(null);
    }
}