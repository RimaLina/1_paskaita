package utils;

/**
 * Created by RimaLinaburgyte on 6/14/2017.
 */
public class StringUtils {
    public static boolean isNotBlank(String value){
        boolean isNotBlank = false;
        if(value!=null && !value.equals("")){
            isNotBlank = true;
        }
        return isNotBlank;
    }
}
