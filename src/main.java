import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Tren t1= new Tren(1);
        Tren t2= new Tren(2);
        Tren t3= new Tren(3);
        Tren t4= new Tren(4);
        Tren t5= new Tren(5);
        Tren t6= new Tren(6);
        ArrayList<Tren> trenes = new ArrayList<>();
        trenes.add(t1);
        trenes.add(t2);
        trenes.add(t3);
        trenes.add(t4);
        trenes.add(t5);
        trenes.add(t6);
        Linia l1 = new Linia("l1");
        Cotxera c1 = new Cotxera("c1",t1,l1);

    }
}
