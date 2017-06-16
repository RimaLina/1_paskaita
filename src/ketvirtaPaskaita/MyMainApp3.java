package ketvirtaPaskaita;

import java.util.*;

/**
 * Created by RimaLinaburgyte on 6/9/2017.
 */
public class MyMainApp3 {
    public static void main(String[] args) {
        List<Vartotojas> vartotojai = new ArrayList<>();

        vartotojai.add(new Vartotojas("Marius", "Sakalauskas", 23, "Jonava"));
        vartotojai.add(new Vartotojas("Marija", "Kibildiene", 25, "Kaunas"));
        vartotojai.add(new Vartotojas("Odeta", "Rugiene", 67, "Vilnius"));

        Collections.sort(vartotojai, new Comparator<Vartotojas>() {
            @Override
            public int compare(Vartotojas o1, Vartotojas o2) {
                return o2.getVardas().compareTo(o1.getVardas());
            }
        });
        for (Vartotojas vartotojas : vartotojai){
            System.out.println(vartotojas);
        }

    }
}
