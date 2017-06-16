package pirmaPaskaita;

import java.util.Scanner;

/**
 * Created by RimaLinaburgyte on 6/6/2017.
 */
public class MainApp2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String zodis = null;
       do
       {
           System.out.println("Iveskite zodi:");

           zodis = sc.nextLine();

       }while(!zodis.equals("pabaiga"));

    }
}
