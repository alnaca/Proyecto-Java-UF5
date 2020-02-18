public class Linia {
    private String identificarorLinia;//l1,l2,l3, enum?
    private Cotxera cotxera;//objeti cotxera de tipo Cotxera

    public Linia (String id, Cotxera cotxera){
        identificarorLinia=id;
        this.cotxera=cotxera;
    }

    public String getIdentificarorLinia() {
        return identificarorLinia;
    }

    public void setIdentificarorLinia(String identificarorLinia) {
        this.identificarorLinia = identificarorLinia;
    }

    public Cotxera getCotxera() {
        return cotxera;
    }

    public void setCotxera(Cotxera cotxera) {
        this.cotxera = cotxera;
    }
}