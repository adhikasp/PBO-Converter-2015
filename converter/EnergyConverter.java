/**
 * Konversi kalori <-> joule
 * @author Shalahudin Al Ayyub
 * @NIM 14/369676/TK/42655
 *
 */
package converter;
import java.util.Scanner;

public class EnergyConverter implements Converter {
    public static void main(String[] args) {
        float joule;
        float kalori;
        byte pilihan;
        Scanner nginput;
        nginput = new Scanner(System.in);
        System.out.println("Pilih Konversi: 1->Joule ke kalori | 2->kalori ke Joule");
        pilihan=nginput.nextByte();

        if(pilihan==1){
             System.out.println("Konversi Joule ke kalori");
             System.out.println("Masukkan Nilai dalam Joule : ");
             joule=nginput.nextInt();
             kalori=(float) (joule*0.24);
             System.out.println("Hasil konversi : " + kalori + " kalori");
        }else if(pilihan==2){
             System.out.println("Konversi kalori ke Joule");
             System.out.println("Masukkan Nilai dalam kalori : ");
             kalori=nginput.nextInt();
             joule=(float) (kalori*4.2);
             System.out.println("Hasil konversi : " + joule + " Joule");
        }else{
             System.out.println("Pilihan Salah");
        }
    }

    public void execute()
    {
        EnergyConverter.main(null);
    }
}