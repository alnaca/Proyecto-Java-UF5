


public class Seguridad extends Subcontrata implements Comparable<Seguridad>{
    private int tip;
    private int num_equip;//numero de linea + numero de equipo , ej linea 9 equipo 930


    public Seguridad(String nom, String dni, int edat, Linia linia, String DataInici, int tip, int num_equip){
        super(nom, dni, edat, linia, DataInici);
        this.tip=tip;
        this.num_equip=num_equip;
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



    @Override
    public int compareTo(Seguridad ob) {
        int resultado = 0;
        if (this.tip > ob.tip) {resultado = 1;}
        else if (this.tip < ob.tip) {resultado = -1;}
        return resultado;
    }

    @Override
    public void AssignarTorn(ETorn torn) {
        this.torn = torn;
    }
}
