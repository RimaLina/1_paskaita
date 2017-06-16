package pirmaPaskaita;

/**
 * Created by RimaLinaburgyte on 6/7/2017.
 */
public class MainApp17 {
    public static void main(String[] args) {
        int[] mas ={1,2,3,4};
        System.out.println(maziausias(mas));
    }

    private static int maziausias(int[] mas){

        int maziausias = mas[0];

        for(Integer m : mas){
            if(m<maziausias){

                maziausias = m;
            }
        }

        return maziausias;
    }

}
