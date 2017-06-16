package utils;

import java.util.List;

/**
 * Created by RimaLinaburgyte on 6/9/2017.
 */
public class CollectionUtils {
    public static <T> T getFirstElement(List<T> list){

        return list.get(0);
    }

    public static <T> T getLastElement(List<T> list){

        return list.get(list.size()-1);
    }
}
