package utils;

import com.sun.istack.internal.Nullable;

import java.sql.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by RimaLinaburgyte on 6/13/2017.
 */
public class JdbsUtils {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/kcs";
    private static final String NAME = "root";
    private static final String PASSWORD = "";

    @Nullable
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL,NAME,PASSWORD);
        } catch (SQLException e) {
            System.out.println("NEPRIJUNGEM" + e);
        }
        return connection;
    }

    public static ResultSet getResultSet(Connection connection, String query){
        ResultSet resultSet = null;
        if (connection!=null && query!=null){
            try {
                Statement st = connection.createStatement();
                resultSet = st.executeQuery(query);
            } catch (SQLException e) {
                System.out.println("Sukurti STATEMENT nepavyko");

            }

        }
        return resultSet;
    }

    public static void updatedResultSet(Connection connection, String query) {

        if (connection != null && query != null) {
            try {
                Statement st = connection.createStatement();
                st.execute(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printResultSet(ResultSet resultSet){
        try {
            ResultSetMetaData data = resultSet.getMetaData();
            while(resultSet.next()){
                StringBuilder sb = new StringBuilder();
                for(int i=1; i<data.getColumnCount();i++){
                    sb.append(data.getColumnName(i)).append("=").append(resultSet.getObject(i)).append(" ");
                }
                System.out.println(sb.toString());

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
