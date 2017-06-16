package pirmaPaskaita;

/**
 *     Parašyti metodą kuris suskaičiuoja
 *     kiek per parametrus paduotame žodyje yra raidžių “a”.
 *     Prieš atliekant veiksmus patikrinti ar paduotas žodis yra tinkamas, jei ne,
 *     grąžinti 0.

 */
public class MainApp19 {
    public static void main(String[] args) {
        String zodis = "Java";
        System.out.println(skaiciuojaAraides(zodis));

    }

    private static int skaiciuojaAraides(String zodis){
        int skaicius =0;
        Character temp;
        for (int i =0; i<zodis.length();i++){
            temp = zodis.charAt(i);
            if (temp == 'a'){

                skaicius ++;
            }

        }

        return skaicius;
    }

}
