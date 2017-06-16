package ketvirtaPaskaita;

import java.util.EnumSet;

/**
 * Created by RimaLinaburgyte on 6/9/2017.
 */
public enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;



    public static EnumSet<Week> dienos(){
        return EnumSet.allOf(Week.class);

    }
}
