


public class Seguridad extends Subcontrata {
    private int tip;
    private int num_equip;//numero de linea + numero de equipo , ej linea 9 equipo 930
    private Linia linia;

    public Seguridad(int nombre, int tip, int num_equip, Linia linia){
        super(nombre);
        this.tip=tip;
        this.num_equip=num_equip;
        this.linia=linia;
    }
}
