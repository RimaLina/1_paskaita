package pirmaPaskaita;

import java.io.Console;

/**
 * Created by RimaLinaburgyte on 6/7/2017.
 */
public class MainApp18 {
    public static void main(String[] args) {
        int[] mas = {1, 2, 3, 4, 5};
        int[] mas2 = masyvoApvertimas(mas);
        spausdinti(mas2);
    }


    private static int[] masyvoApvertimas(int[] mas){

        int[] mas2 = new int[5];

        for (int i = 0; i < mas.length; i++) {
            mas2[i] = mas[(mas.length-1) - i];
        }
        return mas2;

    }

    private static void spausdinti(int[] mas2){
        for(Integer m:mas2){
            System.out.println(m);
        }
    }
}
