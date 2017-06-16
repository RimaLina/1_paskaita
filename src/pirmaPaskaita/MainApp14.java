package pirmaPaskaita;

import utils.NumberUtils;

import java.util.Scanner;

/**
 * Created by RimaLinaburgyte on 6/7/2017.
 */
public class MainApp14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int n = NumberUtils.teigiamas(sc);
        int suma = 0;

        for (int i = 1; i <= n; i++) {

                suma += i;
            }

        System.out.println(suma);
    }
}
