package studentuApskaitosSistema;

import utils.JdbsUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by RimaLinaburgyte on 6/14/2017.
 */
public class CreateNewStudent {
    private Scanner scanner;

    CreateNewStudent(Scanner scanner){
        this.scanner = scanner;
    }

    public void createNewStudent(){
        System.out.println("IVESKITE STUDENTO VARDA:");
        String name = scanner.next();
        System.out.println("IVESKITE STUDENTO PAVARDE");
        String surname = scanner.next();
        System.out.println("IVESKITE STUDENTO TEL.");
        String phone = scanner.next();
        System.out.println("IVESKITE STUDENTO EL.PAŠTO ADRESĄ");
        String email = scanner.next();
       // boolean exist = false;

        Connection connection = JdbsUtils.getConnection();
        ResultSet resultSet = JdbsUtils.getResultSet(connection,"select * from students where name= '" +name+"' and surname= '"+surname+"' and phone= '" +phone+ "' and email='"+email+"'");
        try {
            if (resultSet.next()){
                System.out.println("Toks vartotojas jau egzistuoja");

            }
            else{
                String query = "INSERT INTO students(name,surname,phone,email)values('"+name+"','"+surname+"','"+phone+"','"+email+"')";
                JdbsUtils.updatedResultSet(connection, query);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
