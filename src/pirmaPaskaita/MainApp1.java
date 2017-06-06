package pirmaPaskaita;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RimaLinaburgyte on 6/6/2017.
 */
public class MainApp1 {


    public static final String NELYGINIS = "Nelyginis";

    public static void main(String[] args) {
        System.out.println("Iveskite skaiciu:");
        Scanner sc = new Scanner(System.in);
        try {
            int val = sc.nextInt();
            spausdinti(val);

        } catch (InputMismatchException e) {

            System.out.println("Iveskite skaiciu");
        }
    }

        private static void spausdinti(int number){

            String message = NELYGINIS;

        if (number % 2 == 0) {
                System.out.println("Lyginis");

            }
                System.out.println(message);

    }



    }


