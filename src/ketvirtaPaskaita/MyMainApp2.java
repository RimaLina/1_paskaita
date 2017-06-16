package ketvirtaPaskaita;

import com.sun.org.apache.xpath.internal.SourceTree;
import utils.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RimaLinaburgyte on 6/9/2017.
 */
public class MyMainApp2 {
    public static void main(String[] args) {
        List<String> vardai = new ArrayList<>();
        vardai.add("Ona");
        vardai.add("Jonas");
        vardai.add("Petras");
        vardai.add("Antanas");
        vardai.add("Simas");

        for (String vardas : vardai){

         if (vardas.length()>6){
            System.out.println(vardas);

         }
        }
        System.out.println("Pirmas");
        System.out.println(CollectionUtils.getFirstElement(vardai));
        System.out.println("Paskutinis:");
        System.out.println(CollectionUtils.getLastElement(vardai));
    }


}
