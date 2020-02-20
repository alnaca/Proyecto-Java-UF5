

public class Tmb extends Treballador {
    private int num_empleat;

    public Tmb(String nom, String dni, int edat, Linia linia, int num_empleat){
        super(nom, dni, edat, linia);
        this.num_empleat = num_empleat;
    }

    public int getNum_empleat() {
        return num_empleat;
    }

    public void setNum_empleat(int num_empleat) {
        this.num_empleat = num_empleat;
    }


}
