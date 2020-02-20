import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        ArrayList<Tren> trenes = new ArrayList<>();
        ArrayList<Cotxera> cotxeras = new ArrayList<>();
        ArrayList<Linia> linias = new ArrayList<>();
        HashSet<Estacio> estacions_l1 = new HashSet<>();
        ArrayList<HashSet> estacions = new ArrayList<>();

        Estacio e1 = new Estacio("Clot");
        Estacio e2 = new Estacio("Navas");
        Estacio e3 = new Estacio("Sagrera");
        estacions_l1.add(e1);
        estacions_l1.add(e2);
        estacions_l1.add(e3);
        estacions.add(estacions_l1);
        Linia l1 = new Linia("l1", estacions_l1);
        Cotxera c1 = new Cotxera("c1");
        Tren t1 = new Tren(1,c1, l1);
        Tren t2 = new Tren(2,c1, l1);
        Tren t3 = new Tren(3,c1, l1);
        Tren t4 = new Tren(4,c1, l1);
        trenes.add(t1);
        trenes.add(t2);
        trenes.add(t3);
        trenes.add(t4);

        System.out.println("Estaciones de la l1:");
        System.out.println(l1.getEstacions());
        System.out.println("Trenes dentro de cochera c1:");
        //Iterator
        System.out.println();
    }
}
