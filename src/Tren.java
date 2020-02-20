import java.util.ArrayList;

public class Tren {
    private int identificadorTren;
    //------------POR REVISAR------------
    private Cotxera cotxera;
    private Linia linia;
    //-----------------------------------

    public Tren(int id, Cotxera cotxera, Linia linia){
        identificadorTren=id;
        this.cotxera=cotxera;
        this.linia=linia;
    }

    public int getIdentificadorTren() {
        return identificadorTren;
    }

    public void setIdentificadorTren(int identificadorTren) {
        this.identificadorTren = identificadorTren;
    }

    public Cotxera getCotxera() {
        return cotxera;
    }

    public void setCotxera(Cotxera cotxera) {
        this.cotxera = cotxera;
    }

    public Linia getLinia() {
        return linia;
    }

    public void setLinia(Linia linia) {
        this.linia = linia;
    }
}
