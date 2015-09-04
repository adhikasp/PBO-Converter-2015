/**
* Konversi Meter -> Inchi dan Kaki
* Created by:
* @author Elisabeth Diana Kartika S
* @NIM 14/365265/TK/42067
*/

package converter;
import java.util.Scanner;

public class RangeConverter implements Converter
{
    public static void main (String[] args){
        /*Ini bagian deklarasi variabel*/
        float jarak_meter;
        float jarak_inchi;
        float jarak_kaki;
        Scanner iniscanner = new Scanner(System.in);

        System.out.println("Mengkonversi Meter ke Inci dan Kaki");

        /*Meminta input dari user*/
        System.out.print("Masukkan jarak dalam meter : ");
        jarak_meter = iniscanner.nextFloat();

        /*Rumus*/
        jarak_inchi = (float) jarak_meter * 39.3700787f;
        jarak_kaki  = (float) jarak_meter * 3.2808399f;

        /*Menampilkan Hasil Perhitungan*/
        System.out.println("Jarak dalam Inci: " + jarak_inchi);
        System.out.println("Jarak dalam Kaki: " + jarak_kaki);
    }

    public void execute()
    {
        RangeConverter.main(null);
    }
}