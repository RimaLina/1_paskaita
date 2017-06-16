package pirmaPaskaita;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by RimaLinaburgyte on 6/6/2017.
 */
public class MainApp5 {
    public static void main(String[] args) {
        int[] mas = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<5; i++)
        {
            System.out.println("Iveskite skaiciu:");
            mas[i] = sc.nextInt();
        }

        for (int m : mas
             ) {
            System.out.println(m);
        }
        System.out.println(IntStream.of(mas).sum());

    }
}
