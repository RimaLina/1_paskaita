package pirmaPaskaita;

import utils.NumberUtils;

import java.util.Scanner;

/**
 * Created by RimaLinaburgyte on 6/7/2017.
 */
public class MainApp12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu:");
        int x = NumberUtils.getNumber(scanner);
        int y;
        if (x > 0) {
            System.out.println(jeiTeigiamas(x));
        } else {
            System.out.println(jeiNeigiamas(x));
        }
    }

        private static int jeiTeigiamas(int x){
         int y= 2*x+8;
         return y;
    }
        private static int jeiNeigiamas(int x){
            int y=21-7*x;
            return y;
        }
}

