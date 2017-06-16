package studentuApskaitosSistema;


import utils.NumberUtils;

import java.util.Scanner;

/**
 * Created by RimaLinaburgyte on 6/14/2017.
 */
public class MyMainApp4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb = 0;

        do{
            StringBuilder sb = new StringBuilder();
                  sb.append("|----------------------|\n")
                    .append("| 1. IVESTI VARTOTOJA  |\n")
                    .append("| 0. PROGRAMOS PABAIGA |\n")
                    .append("|----------------------|\n");
            System.out.println(sb.toString());
            System.out.println("Iveskite savo pasirinkima");
            numb = NumberUtils.getNumber(scanner);

            switch (numb){
                case 1:
                    System.out.println("IVESKITE VARTOTOJA:");
                    CreateNewStudent student = new CreateNewStudent(scanner);
                    student.createNewStudent();
                    break;
                case 0:
                    System.out.println("PROGRAMA BAIGIA DARBA");
                    break;
                case 2:
                    System.out.println("IVESKITE ADRESA:");
                    CreateNewAddress address = new CreateNewAddress(scanner);
                    address.createNewAddress();
                default:
                    System.out.println("TOKIO MENU PUNKTO NERA");
                    break;
            }

        }while(numb!=0);
    }
}
