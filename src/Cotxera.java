import java.util.ArrayList;

public class Cotxera {
    private String identificador;//c1,c2,c3,enum?
    //------------POR REVISAR------------
    //private ArrayList<Tren> trens;
    //private Linia linia;//Pasar linia a Cotxera, asi decimos que cotxera con ke trenes i en ke linia esta
    //-----------------------------------


    public Cotxera(String id){
        identificador=id;
        //this.linia=linia;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    //------------POR REVISAR------------
    /*public ArrayList<Tren> getTrens() {
        return trens;
    }

    public void setTrens(ArrayList<Tren> trens) {
        this.trens = trens;
    }*/

    //-----------------------------------
}
