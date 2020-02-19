

public class Tmb extends Trabajador {
    private int num_empleat;
    private Linia linia;

    public Tmb(int num_empleat, Linia linia){
        this.num_empleat=num_empleat;
        this.linia=linia;
    }

    public int getNum_empleat() {
        return num_empleat;
    }

    public void setNum_empleat(int num_empleat) {
        this.num_empleat = num_empleat;
    }

    public Linia getLinia() {
        return linia;
    }

    public void setLinia(Linia linia) {
        this.linia = linia;
    }
}
