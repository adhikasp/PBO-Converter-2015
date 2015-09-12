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
        final float rasio_inchi = 39.3700787f;
        final float rasio_kaki  = 3.2808399f;
        final float rasio_km    = 1000f;
        final float rasio_cm    = (float) 1/100;

        float jarak_awal;
        float rasio;
        float jarak_akhir;

        int pilihan_menu;
        Scanner iniscanner = new Scanner(System.in);

        run_program:
        while (true) {
            System.out.println("Mengkonversi Meter ke berbagai satuan\n");
            menu();

            try {
                System.out.print("\nPilih menu : ");
                pilihan_menu = iniscanner.nextInt();
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("Pilihan Salah");
                iniscanner.nextLine();
                continue;
            }
            if (pilihan_menu < 0 || pilihan_menu > 4) {
                System.out.println("Menu tidak ada");
                continue;
            }

            switch (pilihan_menu) {
                case 0:
                    break run_program;
                case 1:
                    rasio = rasio_inchi;
                    break;
                case 2:
                    rasio = rasio_kaki;
                    break;
                case 3:
                    rasio = rasio_km;
                    break;
                case 4:
                    rasio = rasio_cm;
                    break;
                default:
                    rasio = 1;
            }

            /*Meminta input dari user*/
            System.out.print("Masukkan jarak dalam meter : ");
            jarak_awal = iniscanner.nextFloat();

            /*Rumus*/
            jarak_akhir = (float) jarak_awal * rasio;

            /*Menampilkan Hasil Perhitungan*/
            System.out.println("Jarak akhir = " + jarak_akhir);

            System.out.println("\n");
        }
    }

    private static void menu()
    {
        System.out.println("1. Ke Inchi");
        System.out.println("2. Ke kaki (feet)");
        System.out.println("3. Ke Kilometer");
        System.out.println("4. Ke Centimeter");
        System.out.println("0. Keluar");
    }

    public void execute()
    {
        RangeConverter.main(null);
    }
}