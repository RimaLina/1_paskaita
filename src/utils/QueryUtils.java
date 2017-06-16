package utils;

import java.sql.*;
import java.util.Collection;

/**
 * Created by RimaLinaburgyte on 6/13/2017.
 */
public class QueryUtils {
    public static boolean existTable(Connection connection, String tableName){
        boolean exists = false;
        if(connection!=null && StringUtils.isNotBlank(tableName)){
            try {
                //Statement st = connection.createStatement();
                DatabaseMetaData metadata = connection.getMetaData(); //gauti info, kas yra duombazeje
                ResultSet table = metadata.getTables(null, null, tableName, null);
                exists = table.next(); //next() grazina true, jei kazkas rasta
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return exists;
    }
}
