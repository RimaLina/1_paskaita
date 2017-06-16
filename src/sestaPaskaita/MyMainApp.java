package sestaPaskaita;

import utils.JdbsUtils;

import java.sql.*;

/**
 * Created by RimaLinaburgyte on 6/13/2017.
 */
public class MyMainApp {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbsUtils.getConnection();
        ResultSet resultSet = JdbsUtils.getResultSet(connection,"select * from students");
        if (resultSet!=null){
            try{while (resultSet.next())

               {
                    StringBuilder sb = new StringBuilder();
                    sb.append("id=").append(resultSet.getInt("id")).
                    append(", name=").append(resultSet.getString("name")).append(", surname=").
                    append(resultSet.getString(3)).append(", phone=").append(resultSet.getString("phone")).
                    append(", email =").append(resultSet.getString("email"));
                   System.out.println(sb.toString());
                }
        }catch (SQLException e){
                e.printStackTrace();
            }
        }

//        try{
//            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kcs","root", ""); //prisijungiam prie duombazes, paduodant url ir credentials
//        }catch (SQLException e){
//            System.out.println("prisijungti nepavyko");
//        }

//        if (connection!=null){ //jei pavyko prisijungti
//            try {
//                Statement st = connection.createStatement(); //kad vykdyti uzklausa i duombaze, is connection sukuriam statementa
//                ResultSet resultSet = st.executeQuery("select * from students"); // vykdant uzklausa grazina rezultata
//                while (resultSet.next())
//                {
//                    StringBuilder sb = new StringBuilder();
//                    sb.append("id=").append(resultSet.getInt("id")).
//                    append(", name=").append(resultSet.getString("name")).append(", surname=").
//                    append(resultSet.getString(3)).append(", phone=").append(resultSet.getString("phone")).
//                    append(", email =").append(resultSet.getString("email"));
//                    System.out.println(sb.toString());
//
//                }
//            }catch (SQLException e){
//                e.printStackTrace(); //informacija jei ivyksta exeptionas
//            }
//        }



    }
}
