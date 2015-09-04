/**
* Program untuk mengkonversikan luas area dalam meter kubik menjadi hektar
* Created by:
* @author Maria Ana Megasari
* @NIM 14/364598/TK/41980
*/
package converter;

import java.util.*; /* Digunakan untuk menggambi salag satu fungsi pada java yaitu scanner agar dapat memberikan input */

public class AreaConverter implements Converter {
    public static void main(String[] args) {
        float area; /* Mendeklarasikan variabel area yang bertipe data float */
        Scanner luas = new Scanner(System.in); /* mendiskripsikan variabel scanner (luas) */

        System.out.println("Masukkan Luas Dalam Meter Kubik"); /* Menampilkan Output */
        area = luas.nextInt(); /* Menscan/membaca nilai yang yang dinputkan untuk di proses */

        area = area / 10000; /* Operasi pengkonversian nilai yang diinputkan ke hektar*/
        System.out.println("Luas Dalam Hektar = " + area); /*Menampilkan Output*/
    }

    public void execute()
    {
        AreaConverter.main(null);
    }
}
