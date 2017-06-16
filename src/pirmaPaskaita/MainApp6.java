package pirmaPaskaita;

import java.util.Scanner;

/**
 * Created by RimaLinaburgyte on 6/7/2017.
 */
public class MainApp6 {

    public static void main(String[] args) {
        String[] words = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite 5 zodzius");

        for (int i=0; i<5; i++){
            words[i] = sc.next();
        }

        for (String w : words){
            System.out.println(w);
        }

    }



}
