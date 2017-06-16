package pirmaPaskaita;

/**
 * Created by RimaLinaburgyte on 6/9/2017.
 */
public class MainApp20 {
    public static void main(String[] args) {
        String zodis = "ba";
        System.out.println(tikrinti(zodis));
    }

    private static int tikrinti(String zodis){
        int kiekis = 0;
        for (int i = 0; i< zodis.length(); i++){
            char temp = zodis.charAt(i);
            if(temp == 'a' && i!=zodis.length()-1){
                char temp2 = zodis.charAt(i+1);
                if (temp2 == 'b'){
                    kiekis ++;
                }
            }

        }
        return kiekis;
    }
}
