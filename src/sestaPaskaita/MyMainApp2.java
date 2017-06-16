package sestaPaskaita;
import utils.JdbsUtils;
import utils.QueryUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by RimaLinaburgyte on 6/13/2017.
 */
public class MyMainApp2 {
    public static void main(String[] args) {
        Connection connection = JdbsUtils.getConnection();
        //ResultSet resultSet = JdbsUtils.getResultSet(connection,"select * from students");
        if (QueryUtils.existTable(connection, "students")){
            System.out.println("Students lentele yra sukurta");
        }
        JdbsUtils.updatedResultSet(connection,"UPDATE students set name ='Andrius' where id = 1");

        ResultSet resultSet1 = JdbsUtils.getResultSet(connection,"select * from students");
        if (resultSet1!=null){
            try{while (resultSet1.next())
            {
                JdbsUtils.printResultSet(resultSet1);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        ResultSet resultSet2 = JdbsUtils.getResultSet(connection,"SELECT students.name, students.surname, student_marks.mark\n" +
                "from students \n" +
                "INNER JOIN student_marks on students.ID = student_marks.student_id\n" +
                "WHERE mark < 5");

        if (resultSet1!=null){
            try{while (resultSet1.next())
            {
                JdbsUtils.printResultSet(resultSet2);
            }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
