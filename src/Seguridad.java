


public class Seguridad extends Subcontrata {
    private int tip;
    private int num_equip;//numero de linea + numero de equipo , ej linea 9 equipo 930
    private Linia linia;

    public Seguridad(String nombre, int tip, int num_equip, Linia linia){
        super(nombre);
        this.tip=tip;
        this.num_equip=num_equip;
        this.linia=linia;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public int getNum_equip() {
        return num_equip;
    }

    public void setNum_equip(int num_equip) {
        this.num_equip = num_equip;
    }

    public Linia getLinia() {
        return linia;
    }

    public void setLinia(Linia linia) {
        this.linia = linia;
    }
}
