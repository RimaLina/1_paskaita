package pirmaPaskaita;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RimaLinaburgyte on 6/7/2017.
 */
public class MainApp7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek skaiciu ketinate ivesti:");
        int count = gautiSkaiciu(sc);
        int[] skaiciai = new int[count];
        int index = 1;
        for (int i = 0; i < count; i++) {

            System.out.println("Iveskite " + index + " skaiciu");
            skaiciai[i] = gautiSkaiciu(sc);;

        }

        atspausdinti(skaiciai);

    }


        private static void atspausdinti(int[] skaiciai) {
        for (int sk : skaiciai) {

            if (sk > 100) {

                System.out.println(sk);

            }

        }
        }

        private static int gautiSkaiciu(Scanner sc){

            int atsakymas = 0;

            while(true) {
                try {
                    atsakymas = sc.nextInt();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Blogai ivestas skaicius, pakartokite");
                    sc.nextLine();
                }

            }
            return atsakymas;


        }

}




