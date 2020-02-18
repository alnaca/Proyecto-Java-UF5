import java.util.ArrayList;

public class Cotxera {
    private String identificador;//c1,c2,c3,enum?
    private ArrayList<Tren> trens;

    public Cotxera(String id, Tren tren){
        identificador=id;
        trens.add(tren);
    }

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
}
