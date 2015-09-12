/**
 * Main file untuk aplikasi PboConverter
 * @author Adhika Setya Pramudita <hello@adhikasetyap.me>
 * @NIM 14/365240/TK/42058
 *
 * @description
 * Program untuk mengkonversi beberapa jenis satuan
 * yang sering dijumpai dalam kehidupan sehari-hari.
 *
 * @instruction to run:
 * Compile and run this file
 * in *nix --> java PboConverter.java && javac PboConverter
 *
 * @ourTeamMember:
 * Adhika Setya Pramudita    (14/365240/TK/42058)
 * Anif Nur Mustaqim         (14/366010/TK/42086)
 * Edward                    (14/366059/TK/42095)
 * Elisabeth Diana Kartika S (14/365265/TK/42067)
 * Maria Ana Megasari        (14/364598/TK/41980)
 * Shalahudin Al Ayyub       (14/369676/TK/42655)
 * Syuhada Sipayung          (14/363614/TK/41701)
 */

import java.util.Scanner;
import java.util.HashMap;

import converter.Converter;

/**
 * The main class
 */
class PboConverter {

    private static Scanner scanInput = new Scanner(System.in);
    private static HashMap<Integer,Converter> menuMap = new HashMap<Integer,Converter>();


    public static void main(String[] args)
    {
        int choiceMenu;
        // Outsource data initialization to reduce main function length
        PboConverter.initMenuMap();

        System.out.println("Program Konverter segala jenis satuan");

        while (true) {
            try {
                choiceMenu = menu();

                /* Very short menu selection, thanks to HashMap */
                menuMap.get(choiceMenu).execute();
            }
            catch (java.lang.NullPointerException e)  {
                System.out.println("Maaf, pilihan menu Anda tidak kami kenali.");
            }
            catch (java.util.InputMismatchException e) {
                System.out.println("Maaf, pilih menu menggunakan digit angka.");
                 // flush buffer, avoid infinite loop because of
                 // residual buffer raise InputMismatchException
                 // forever and ever.
                scanInput.nextLine();
            }

            pressEnterToContinue();
            // 80 long separate character between looping
            // 80 is standard width of terminal
            System.out.println("\n===============================================================================\n");
        }
    }

    /**
     * Print list of menu and prompt for user menu choice.
     * If user choose 0, exit the program.
     *
     * @return int code number of menu choice
     */
    private static int menu() throws java.util.InputMismatchException
    {
        int choice;

        System.out.println("1. Konversi area");
        System.out.println("2. Konversi besaran data");
        System.out.println("3. Konversi energi");
        System.out.println("4. Konversi jarak");
        System.out.println("5. Konversi temperatur");
        System.out.println("6. Konversi unit masakan");
        System.out.println("\n0. Keluar Program");
        System.out.print("\nPilih menu: ");

        choice = scanInput.nextInt();

        // Close the program
        if (choice == 0) {
            System.exit(0);
        }

        return choice;
    }

    /**
     * Initialize all of Converter class into a HashMap menuMap,
     * so avoiding use of very long if else/switch block for the
     * menu selection.
     * Credit to my friend, Nizar Akbar for the idea :)
     */
    private static void initMenuMap()
    {
        menuMap.put(1, new converter.AreaConverter());
        menuMap.put(2, new converter.DataConverter());
        menuMap.put(3, new converter.EnergyConverter());
        menuMap.put(4, new converter.RangeConverter());
        menuMap.put(5, new converter.TemperatureConverter());
        menuMap.put(6, new converter.CookingConverter());
    }

    private static void pressEnterToContinue()
    {
        System.out.println("\nTekan tombol enter untuk lanjut...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}