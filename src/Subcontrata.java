

public abstract class Subcontrata extends Treballador implements IAssignarLinia, Cloneable {

    protected String DataInici;
    protected ETorn torn;

    public Subcontrata(String nom, String dni, int edat, Linia linia, String DataInici){
        super(nom, dni, edat, linia);
        this.DataInici = DataInici;
        linia.afegirTreballador(this);
        
    }

    public abstract Subcontrata clone() throws CloneNotSupportedException;

    @Override
    public void AssignarLinia(Linia liniaNova) {
        this.linia.esborrarTreballador(this);
        liniaNova.afegirTreballador(this);
        this.linia = liniaNova;
    }


    public abstract void AssignarTorn(ETorn torn);


}
