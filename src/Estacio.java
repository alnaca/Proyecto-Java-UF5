import java.util.HashSet;

public class Estacio {
    private String nom;
    //private HashSet<Linia> linia;

    public Estacio(String nom){
        this.nom=nom;
        //this.linia.add(linia);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /*public HashSet<Linia> getLinia() {
        return linia;
    }

    public void setLinia(HashSet<Linia> linia) {
        this.linia = linia;
    }*/
}
