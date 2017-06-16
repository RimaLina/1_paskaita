package ketvirtaPaskaita;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * Created by RimaLinaburgyte on 6/9/2017.
 */
public class MyMainApp1 {
    public static void main(String[] args) {
        listExample();
        setExample();
        mapExample();
    }

    private static void mapExample(){
        Map<Integer, String> maps = new HashMap<>();
        maps.put(1,"Lukas");
        maps.put(2,"Rima");
        maps.put(3, "Benas");
        maps.put(4, "Andrius");
        maps.put(5, "Andrius");
        maps.put(2, "Rima2");  // key turi buti unikalus, jei pasikartoja tai uzraso nauja reiksme

        for (Map.Entry<Integer, String> map : maps.entrySet()){

            System.out.println("key >" + map.getKey() + "val ->" + map.getValue());

        }

        for (Integer map : maps.keySet()){

            System.out.println("key ->" + map + "val -> " + maps.get(map));
        }

    }

    private static void listExample(){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Petras");
        arrayList.add("Antanas");
        arrayList.add("Benas");

        Collections.sort(arrayList);
        for (String name: arrayList){
            System.out.println(name);
        }

        System.out.println(arrayList.size());
    }

    private static void setExample(){
        Set<Integer> setExample = new TreeSet<>();
        setExample.add(3);
        setExample.add(34);
        setExample.add(2);
        setExample.add(22);
        setExample.add(34);

        for (Integer val : setExample){
            System.out.println(val);

        }
        System.out.println("set with own object");

        Set<Cat> cats = new TreeSet<>();
        cats.add(new Cat("Pukis", 7, "Persas"));
        cats.add(new Cat("Benas", 6, "Egzotas"));
        cats.add(new Cat("Lukas", 2, "Rainas"));
        cats.add(new Cat("Rima", 2, "Persas"));
        cats.add(new Cat("Andrius", 1, "Persas"));
        cats.add(new Cat("Benas", 6, "Egzotas"));

        for (Cat cat : cats){
            System.out.println(cat);

        }
    }
}
