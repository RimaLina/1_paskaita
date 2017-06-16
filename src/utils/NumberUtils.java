package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RimaLinaburgyte on 6/7/2017.
 */
public class NumberUtils {
    public static int getNumber(Scanner sc){

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

    public static int teigiamas(Scanner sc)
    {
        int skaicius = 0;

        while(true){
            skaicius = getNumber(sc);
            if (skaicius > 0){
                break;
            }
            else{
                System.out.println("sakiau ivesti teigiama");
            }

        }
        return skaicius;


    }

}
