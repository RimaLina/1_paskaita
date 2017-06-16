package sestaPaskaita;

import utils.JdbsUtils;
import utils.QueryUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by RimaLinaburgyte on 6/14/2017.
 */
public class MyMainApp3 {
    public static void main(String[] args) {
       Connection connection = JdbsUtils.getConnection();
       String query = "CREATE TABLE students";
       checkTableExistence(connection,"students", query);
       String query2 = "CREATE TABLE student_adress";
       checkTableExistence(connection,"student_adress", query2);
       String query3 = "CREATE TABLE student_marks";
       checkTableExistence(connection, "student_marks", query3);


        String query4 = "CREATE TABLE student_modules(" +
                "id int not null auto_increment," +
                "title varchar(255) not null," +
                "code varchar(255)," +
                "Primary key (id)" +
                ");";

        checkTableExistence(connection, "student_modules", query4);
    }

    private static void checkTableExistence(Connection connection, String tableName, String query){
        if (QueryUtils.existTable(connection, tableName)){
            ResultSet resultSet = JdbsUtils.getResultSet(connection, "select * from "+ tableName);
            JdbsUtils.printResultSet(resultSet);
        }
        else{
            JdbsUtils.updatedResultSet(connection, query);
        }
    }
}
