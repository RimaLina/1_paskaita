package studentuApskaitosSistema;

import utils.JdbsUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by RimaLinaburgyte on 6/14/2017.
 */
public class CreateNewAddress {
    private Scanner scanner;

    public CreateNewAddress(Scanner scanner) {
        this.scanner = scanner;
    }

    public void createNewAddress(){
        System.out.println("IVESKITE STUDENTO VARDA:");
        String name = scanner.next();
        System.out.println("IVESKITE STUDENTO PAVARDE:");
        String surname = scanner.next();

        Connection connection = JdbsUtils.getConnection();
        ResultSet resultSet = JdbsUtils.getResultSet(connection,"select * from students where name= '" +name+"' and surname= '"+surname+"'");
        try {
            if (resultSet.next()){
                System.out.println("Toks vartotojas jau egzistuoja");
                System.out.println("IVESKITE SALI:");
                String country = scanner.next();
                System.out.println("IVESKITE MIESTA:");
                String city = scanner.next();
                System.out.println("IVESKITE GATVE:");
                String street = scanner.next();
                System.out.println("IVESKITE PASTO KODA:");
                String post_code = scanner.next();
                int id = resultSet.getInt("id");

                String query = "INSERT INTO student_adress(student_id,country,city,street,post_code)values('"+id+"','"+country+"','"+city+"','"+street+"','"+post_code+"')";
                JdbsUtils.updatedResultSet(connection, query);

            }
            else{
                System.out.println("nera, sukurk");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
