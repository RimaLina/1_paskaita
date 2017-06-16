package pirmaPaskaita;

import utils.NumberUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RimaLinaburgyte on 6/7/2017.
 */
public class MainApp13 {
    public static void main(String[] args) {
        Boolean atsakymas;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Iveskite du skaicius:");
            int pirmas = NumberUtils.getNumber(sc);
            int antras = NumberUtils.getNumber(sc);
            System.out.println("Iveskite operacijos koda:");
            int kodas = sc.nextInt();

            if (kodas == 1){
                int suma = pirmas + antras;
                System.out.println(suma);
            }
            else if (kodas == 2){

                int skirtumas = pirmas - antras;
                System.out.println(skirtumas);
            }
            else if (kodas == 3){
                int sandauga = pirmas * antras;
                System.out.println(sandauga);
            }
            System.out.println("Ar norite kartoti? (true/false)");
            atsakymas = atsakymoTikrinimas(sc);

        }while(atsakymas);

    }
    private static boolean atsakymoTikrinimas(Scanner scanner){

        boolean atsakymas;

        while(true) {
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
