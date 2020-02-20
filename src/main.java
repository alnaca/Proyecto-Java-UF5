import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Tren> trenes = new ArrayList<>();
        ArrayList<Cotxera> cotxeras = new ArrayList<>();
        ArrayList<Linia> linias = new ArrayList<>();
        ArrayList<Estacio> estacions_l1 = new ArrayList<>();
        ArrayList<ArrayList> estacions = new ArrayList<>();

        Estacio e1 = new Estacio("Clot");
        Estacio e2 = new Estacio("Navas");
        Estacio e3 = new Estacio("Sagrera");
        estacions_l1.add(e1);
        estacions_l1.add(e2);
        estacions_l1.add(e3);
        estacions.add(estacions_l1);
        //Linia l1 = new Linia("l1", estacions_l1);
        Cotxera c1 = new Cotxera("c1");
        //Tren t1 = new Tren(1, Cotxera cotxera, Linia linia);

    }
}
