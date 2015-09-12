/**
* Program untuk mengkonversikan luas area
* Created by:
* @author Maria Ana Megasari
* @NIM 14/364598/TK/41980
*/
package converter;

import java.util.*; /* Digunakan untuk menggambi salag satu fungsi pada java yaitu scanner agar dapat memberikan input */

public class AreaConverter implements Converter {
    public static void main(String[] args) {
        float km, hektar, dam, dm, cm, mm, panjang, lebar, luas; /*mendeskripsikan tipe data vaiabel yang ada*/
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan panjang area (dalam meter) :"); /* Menampilkan Output */
        panjang = keyboard.nextInt(); /* Menscan/membaca nilai yang yang dinputkan untuk di proses */
        System.out.print("Masukkan lebar area (dalam meter) :");
        lebar = keyboard.nextInt();

        luas = (panjang*lebar);/* Operasi untuk mencari luas area yang ingin dikonversikan*/
        System.out.println("Luas area tersebut adalah (dalam m^2) :" +luas); /*menampilkan output luas area yang ingin dikonversikan*/

        km = luas/1000000;
        System.out.println("Luas area dalam km^2 :" +km ); /*menampilkan output hasil konversi ke km^2 */

        hektar = luas/10000;
        System.out.println("Luas area dalam hektar :" +hektar); /*menampilkan output hasil konversi ke hektar */

        dam =  luas/100;
        System.out.println("Luas area dalam dam^2 :" +dam); /*menampilkan output hasil konversi ke dam^2 */

        dm = luas*100;
        System.out.println("Luas area dalam dm^2 :" +dm); /*menampilkan output hasil konversi ke dm^2 */

        cm = luas*10000;
        System.out.println("Luas area dalam cm^2 :" +cm); /*menampilkan output hasil konversi ke cm^2 */

        mm = luas*1000000;
        System.out.println("Luas area dalam mm^2 :" +mm); /*menampilkan output hasil konversi ke mm^2 */
    }

    public void execute()
    {
        AreaConverter.main(null);
    }
}
