package pirmaPaskaita;

/**
 * Created by RimaLinaburgyte on 6/9/2017.
 */
public class MainApp21 {
    public static void main(String[] args) {
        String sakinys = "KOL EINU ŠUNIE LOK";
        String sakinysParusotas = sakinys.replaceAll("\\s+","");
        System.out.println(sakinysParusotas);
        System.out.println(tikrinti(sakinysParusotas));
    }

    private static boolean tikrinti(String sakinysParusotas){
        boolean atsakymas = false;
        for (int i = 0; i<sakinysParusotas.length() ; i++){
            if(sakinysParusotas.charAt(i)==sakinysParusotas.charAt(sakinysParusotas.length()-1-i)){
                atsakymas = true;
            }

        }
        return atsakymas;
    }
}
