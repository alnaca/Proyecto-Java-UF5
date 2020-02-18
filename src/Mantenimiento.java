

public class Mantenimiento extends Subcontrata {
    private int identificador;
    private boolean ascensores;
    private boolean escaleras;
    private Linia linia;

    public Mantenimiento(int id, boolean ascensores, boolean escaleras, Linia linia){
        identificador=id;
        this.ascensores=ascensores;
        this.escaleras=escaleras;
        this.linia=linia;
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

    public Linia getLinia() {
        return linia;
    }

    public void setLinia(Linia linia) {
        this.linia = linia;
    }
}
