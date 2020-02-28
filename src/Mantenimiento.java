

public class Mantenimiento extends Subcontrata {
    private boolean ascensores;
    private boolean escaleras;

    public Mantenimiento(String nom, String dni, int edat, Linia linia, String DataInici, boolean ascensores, boolean escaleras){
        super(nom, dni, edat, linia, DataInici);
        this.ascensores=ascensores;
        this.escaleras=escaleras;
    }

    public boolean isAscensores() {
        return ascensores;
    }

    public void setAscensores(boolean ascensores) {
        this.ascensores = ascensores;
    }

    public boolean isEscaleras() {
        return escaleras;
    }

    public void setEscaleras(boolean escaleras) {
        this.escaleras = escaleras;
    }

    public ETorn getTorn() {
        return torn;
    }


    @Override
    public void AssignarTorn(ETorn torn) {
        this.torn = torn;
    }

    @Override
    public Subcontrata clone() {

        Subcontrata clon = new Mantenimiento(this.nom, this.dni, this.edat, this.linia, this.DataInici,this.ascensores,this.escaleras);
        return clon;
    }

}