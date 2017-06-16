package pirmaPaskaita;

/**
 * Created by RimaLinaburgyte on 6/7/2017.
 */
public class MainApp16 {
    public static void main(String[] args) {
        int[] mas ={1,2,3,4};
        System.out.println(didziausias(mas));
    }

    private static int didziausias(int[] mas){

        int didziausias = mas[0];

        for(Integer m : mas){
            if(m>didziausias){

                didziausias = m;
            }
        }

        return didziausias;
    }

}
