import java.util.ArrayList;
import java.util.HashSet;

public class Linia {
    private String identificadorLinia;//l1,l2,l3, enum?
    private HashSet<Estacio> estacions;
    private ArrayList<Treballador> treballadors = new ArrayList<>();

    //------------POR REVISAR----------------
    //private Cotxera cotxera;//objeti cotxera de tipo Cotxera
    //----------------------------------------

    public Linia (String id, HashSet<Estacio> estacions/*, Cotxera cotxera*/){
        identificadorLinia=id;
        this.estacions=estacions;
        //this.cotxera=cotxera;
    }

    public String getIdentificadorLinia() {
        return identificadorLinia;
    }

    public void setIdentificadorLinia(String identificadorLinia) {
        this.identificadorLinia = identificadorLinia;
    }

    public HashSet<Estacio> getEstacions() {
        return estacions;
    }

    public void setEstacions(HashSet<Estacio> estacions) {
        this.estacions = estacions;
    }

    public ArrayList<Treballador> getTreballadors() {
        return treballadors;
    }

    public void afegirTreballador(Treballador treballador){
        this.treballadors.add(treballador);
    }
    public void esborrarTreballador(Treballador treballador){
        this.treballadors.remove(treballador);
    }


    /*
    public void setTreballadors(ArrayList<Treballador> treballadors) {
        this.treballadors = treballadors;
    }
*/
    /*public Cotxera getCotxera() {
        return cotxera;
    }

    public void setCotxera(Cotxera cotxera) {
        this.cotxera = cotxera;
    }*/


}