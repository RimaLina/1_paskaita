package ketvirtaPaskaita;
import utils.NumberUtils;
import java.util.Scanner;

public class testinis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double y = 0;
        System.out.println("Iveskite pirma skaiciu");
        double x = NumberUtils.getNumber(scanner);
        do {
            System.out.println("Iveskite antra skaiciu");
            y = NumberUtils.getNumber(scanner);
        }while(y==0);
        System.out.println(division(x,y));
    }
    private static double division(double x, double y){
        double result = x/y;
        return result;
    }
}
