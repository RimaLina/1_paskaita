package pirmaPaskaita;

import utils.NumberUtils;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Created by RimaLinaburgyte on 6/7/2017.
 */
public class MainApp15 {
    public static void main(String[] args) {

        Boolean atsakymas;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Iveskite skaiciu: ");
            int n = NumberUtils.teigiamas(sc);
            System.out.println("Iveskite operacijos koda (1/2):");
            int kodas = sc.nextInt();
            ats(kodas, n);
            System.out.println("Ar norite kartoti? (true/false)");
            atsakymas = atsakymoTikrinimas(sc);
        } while (atsakymas);

    }
    private static void ats(int kodas, int n) {

        if (kodas == 1) {
            int suma = 0;
            for (int i = 1; i <= n; i++) {

                suma += i;
            }

            System.out.println("Suma: " + suma);

        } else if (kodas == 2) {
            int sandauga = 1;
            for (int i = 1; i <= n; i++) {

                sandauga *= i;
            }


            System.out.println("Sandauga: " + sandauga);
        }
    }


    private static boolean atsakymoTikrinimas(Scanner scanner) {

        boolean atsakymas;

        while (true) {
            try {
                atsakymas = scanner.nextBoolean();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas atsakymas, pakartokite");
                scanner.nextLine();
            }

        }
        return atsakymas;
    }
}
