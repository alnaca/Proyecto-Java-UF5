

public class Mantenimiento extends Subcontrata {
    private int identificador;
    private boolean ascensores;
    private boolean escaleras;

    public Mantenimiento(String nom, String dni, int edat, Linia linia, String DataInici, boolean ascensores, boolean escaleras){
        super(nom, dni, edat, linia, DataInici);
        this.ascensores=ascensores;
        this.escaleras=escaleras;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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

    @Override
    public void AssignarTorn(ETorn torn) {
        this.torn = torn;
    }
}
