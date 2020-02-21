public abstract class Treballador {

    protected String nom;
    protected String dni;
    protected int edat;
    protected Linia linia;


    public Treballador(String nom, String dni, int edat, Linia linia) {
        this.nom = nom;
        this.dni = dni;
        this.edat = edat;
        this.linia = linia;

    }





    public String getNom() {
        return nom;
    }

    public String getDni() {
        return dni;
    }

    public int getEdat() {
        return edat;
    }

    public Linia getLinia() {
        return linia;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }


    public void setLinia(Linia linia) {
        this.linia = linia;
    }
}

