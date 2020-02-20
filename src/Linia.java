public class Linia {
    private String identificadorLinia;//l1,l2,l3, enum?

    //------------POR REVISAR----------------
    //private Cotxera cotxera;//objeti cotxera de tipo Cotxera
    //----------------------------------------

    public Linia (String id/*, Cotxera cotxera*/){
        identificadorLinia=id;
        //this.cotxera=cotxera;
    }

    public String getidentificadorLinia() {
        return identificadorLinia;
    }

    public void setidentificadorLinia(String identificadorLinia) {
        this.identificadorLinia = identificadorLinia;
    }

    /*public Cotxera getCotxera() {
        return cotxera;
    }

    public void setCotxera(Cotxera cotxera) {
        this.cotxera = cotxera;
    }*/
}