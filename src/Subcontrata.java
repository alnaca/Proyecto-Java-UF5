

public class Subcontrata extends Treballador implements IAssignarLinia {

    private String DataInici;

    public Subcontrata(String nom, String dni, int edat, Linia linia, String DataInici){
        super(nom, dni, edat, linia);
        this.DataInici = DataInici;
        
    }

    @Override
    public void AssignarLinia(Linia liniaNova) {
        this.linia.esborrarTreballador(this);
        liniaNova.afegirTreballador(this);
        this.linia = liniaNova;
    }
}
