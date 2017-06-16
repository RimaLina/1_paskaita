package ketvirtaPaskaita;

/**
 * Created by RimaLinaburgyte on 6/9/2017.
 */
public class Vartotojas{
    private String vardas;
    private String pavarde;
    private int amzius;
    private String miestas;

    public Vartotojas(String vardas, String pavarde, int amzius, String miestas) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.miestas = miestas;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public int getAmzius() {
        return amzius;
    }

    public String getMiestas() {
        return miestas;
    }

    @Override
    public String toString() {
        return "Vartotojas{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", amzius=" + amzius +
                ", miestas='" + miestas + '\'' +
                '}';
    }



}
