package pirmaPaskaita;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RimaLinaburgyte on 6/6/2017.
 */
public class MainApp34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int suma = 0;

        do
        {
            System.out.println("Iveskite skaiciu:");

                number = getGoodNumber(sc);
                suma += number;
        }while(number != 0 );


        System.out.println("Suma: " + suma);

    }

    private static int getGoodNumber(Scanner sc)
    {
       int number =0;
       while(true){

           try{
               number = sc.nextInt();
               break;

           }catch (InputMismatchException e){
               System.out.println("sakiau ivesk skaiciu");
               sc.nextLine();
           }
       }

    return number;

    }


}
