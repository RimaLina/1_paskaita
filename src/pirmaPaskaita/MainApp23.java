package pirmaPaskaita;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by RimaLinaburgyte on 6/9/2017.
 */
public class MainApp23 {
    public static void main(String[] args) {


        try{
            BufferedReader br = new BufferedReader(new FileReader(new File("vardai.txt")));
            String vardas = "";
            while((vardas = br.readLine())!=null){
                if (vardas.charAt(0)!='A'){
                    System.out.println(vardas);
                }
            }
        } catch (java.io.IOException e) {
            System.out.println("nepavyko");
        }
    }
}
