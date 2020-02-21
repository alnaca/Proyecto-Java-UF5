

public class Tmb extends Treballador implements Cloneable {
    private int num_empleat;

    public Tmb(String nom, String dni, int edat, Linia linia, int num_empleat){
        super(nom, dni, edat, linia);
        this.num_empleat = num_empleat;
    }

    public Tmb clone() {
        Tmb clon = new Tmb(this.nom,this.dni,this.edat,this.linia,this.num_empleat);
        return clon;
    }

    public int getNum_empleat() {
        return num_empleat;
    }

    public void setNum_empleat(int num_empleat) {
        this.num_empleat = num_empleat;
    }


}
