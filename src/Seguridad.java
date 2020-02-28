


public class Seguridad extends Subcontrata implements Comparable<Seguridad>{
    private int tip;


    public Seguridad(String nom, String dni, int edat, Linia linia, String DataInici, int tip){
        super(nom, dni, edat, linia, DataInici);
        this.tip=tip;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    @Override
    public int compareTo(Seguridad ob) {
        int resultado = 0;
        if (this.tip > ob.tip) {resultado = 1;}
        else if (this.tip < ob.tip) {resultado = -1;}
        return resultado;
    }

    @Override
    public Subcontrata clone() {

        Subcontrata clon = new Seguridad(this.nom, this.dni, this.edat, this.linia, this.DataInici, this.tip);
        return clon;
    }

    @Override
    public void AssignarTorn(ETorn torn) {
        this.torn = torn;
    }
}
