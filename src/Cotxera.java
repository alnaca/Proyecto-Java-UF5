import java.util.ArrayList;

public class Cotxera {
    private String identificador;//c1,c2,c3,enum?
    private ArrayList<Tren> trens;

    //------------POR REVISAR------------
    private Linia linia;//Pasar linia a Cotxera, asi decimos que cotxera con ke trenes i en ke linia esta
    //-----------------------------------

    public Cotxera(String id, Tren tren, Linia linia){
        identificador=id;
        trens.add(tren);
        this.linia=linia;
    }

    //------------POR REVISAR------------
    public Cotxera(String id, ArrayList<Tren> trenes, Linia linia){//Inicializar cotxera con mas un array de trenes
        identificador=id;
        trens=trenes;
        this.linia=linia;
    }
    //-----------------------------------

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public ArrayList<Tren> getTrens() {
        return trens;
    }

    public void setTrens(ArrayList<Tren> trens) {
        this.trens = trens;
    }

    //------------POR REVISAR------------

    public Linia getLinia() {
        return linia;
    }

    public void setLinia(Linia linia) {
        this.linia = linia;
    }

    //-----------------------------------
}
