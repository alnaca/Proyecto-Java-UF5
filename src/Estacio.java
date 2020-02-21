import java.util.HashSet;
import java.util.Objects;

public class Estacio {
    private String nom;
    //private HashSet<Linia> linia;

    public Estacio(String nom){
        this.nom=nom;
        //this.linia.add(linia);
    }

    @Override
    public boolean equals(Object o) {
        Estacio estacio = (Estacio) o;
        if (this.nom == ((Estacio) o).getNom()) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(nom, estacio.nom);
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
