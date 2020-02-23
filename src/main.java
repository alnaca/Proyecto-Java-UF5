import java.util.*;

public class main {
    public static void main(String[] args) {

        String linea;
        String opcio;
        ArrayList<Tren> trenes = new ArrayList<>();
        ArrayList<Cotxera> cotxeras = new ArrayList<>();
        TreeMap linias = new TreeMap();
        HashSet<Estacio> estacions_l1 = new HashSet<>();
        HashSet<Estacio> estacions_l2 = new HashSet<>();
        HashSet<Estacio> estacions_l3 = new HashSet<>();
        HashSet<Estacio> estacions_l4 = new HashSet<>();
        HashSet<Estacio> estacions_l5 = new HashSet<>();
        LinkedList<HashSet> estacions = new LinkedList<>();


        //Creem les estacions
        Estacio e1 = new Estacio("Clot");//l1+l2
        Estacio e2 = new Estacio("Navas");//l1
        Estacio e3 = new Estacio("Sagrera");//l1+l5
        Estacio e4 = new Estacio("Catalunya");//l1+l3
        Estacio e5 = new Estacio("Rocafort");//l1
        Estacio e6 = new Estacio("La Pau");//l2+l4
        Estacio e7 = new Estacio("Sagrada Familia");//l2+l5
        Estacio e8 = new Estacio("Sant Marti");//l2
        Estacio e9 = new Estacio("Passeig de Gracio");//l2+l3+l4
        Estacio e10 = new Estacio("Diagonal");//l3+l5
        Estacio e11 = new Estacio("Fontana");//l3
        Estacio e12 = new Estacio("Lesseps");//l3
        Estacio e13 = new Estacio("Besos");//l4
        Estacio e14 = new Estacio("Alfons X");//l4
        Estacio e15 = new Estacio("Joanic");//l4
        Estacio e16 = new Estacio("Entença");//l5
        Estacio e17 = new Estacio("Congres");//l5

        //Afegim les estacions a un array per afegir en el constructor
        estacions_l1.add(e1);
        estacions_l1.add(e2);
        estacions_l1.add(e3);
        estacions_l1.add(e4);
        estacions_l1.add(e5);
        estacions_l2.add(e1);
        estacions_l2.add(e6);
        estacions_l2.add(e7);
        estacions_l2.add(e8);
        estacions_l2.add(e9);
        estacions_l3.add(e4);
        estacions_l3.add(e9);
        estacions_l3.add(e10);
        estacions_l3.add(e11);
        estacions_l3.add(e12);
        estacions_l4.add(e6);
        estacions_l4.add(e9);
        estacions_l4.add(e13);
        estacions_l4.add(e14);
        estacions_l4.add(e15);
        estacions_l5.add(e3);
        estacions_l5.add(e7);
        estacions_l5.add(e10);
        estacions_l5.add(e16);
        estacions_l5.add(e17);

        //Afegim les estacions de cada linea en un array per tenir una estructura
        estacions.add(estacions_l1);
        estacions.add(estacions_l2);
        estacions.add(estacions_l3);
        estacions.add(estacions_l4);
        estacions.add(estacions_l5);

        //Creem les linies amb les estacions
        Linia l1 = new Linia("l1", estacions_l1);
        Linia l2 = new Linia("l2", estacions_l2);
        Linia l3 = new Linia("l3", estacions_l3);
        Linia l4 = new Linia("l4", estacions_l4);
        Linia l5 = new Linia("l5", estacions_l5);

        //Afegim les linies en un treemap
        /*linias.entrySet(l1);
        linias.keySet(l2);
        linias.keySet(l3);
        linias.keySet(l4);
        linias.keySet(l5);*/

        //Creem les cotxeres de cada linea
        Cotxera c1 = new Cotxera("c1");
        Cotxera c2 = new Cotxera("c2");
        Cotxera c3 = new Cotxera("c3");
        Cotxera c4 = new Cotxera("c4");
        Cotxera c5 = new Cotxera("c5");

        //Creem els trens
        Tren t1 = new Tren(1,c1, l1);
        Tren t2 = new Tren(2,c1, l1);
        Tren t3 = new Tren(3,c1, l1);
        Tren t4 = new Tren(4,c1, l1);
        Tren t5 = new Tren(5,c2, l2);
        Tren t6 = new Tren(6,c2, l2);
        Tren t7 = new Tren(7,c2, l2);
        Tren t8 = new Tren(8,c2, l2);
        Tren t9 = new Tren(9,c3, l3);
        Tren t10 = new Tren(10,c3, l3);
        Tren t11 = new Tren(11,c3, l3);
        Tren t12 = new Tren(12,c3, l3);
        Tren t13 = new Tren(13,c4, l4);
        Tren t14 = new Tren(14,c4, l4);
        Tren t15 = new Tren(15,c4, l4);
        Tren t16 = new Tren(16,c4, l4);
        Tren t17 = new Tren(17,c5, l5);
        Tren t18 = new Tren(18,c5, l5);
        Tren t19 = new Tren(19,c5, l5);
        Tren t20 = new Tren(20,c5, l5);

        //Afegim els trens en un array per tenir una estructura
        trenes.add(t1);
        trenes.add(t2);
        trenes.add(t3);
        trenes.add(t4);
        trenes.add(t5);
        trenes.add(t6);
        trenes.add(t7);
        trenes.add(t8);
        trenes.add(t9);
        trenes.add(t10);
        trenes.add(t11);
        trenes.add(t12);
        trenes.add(t13);
        trenes.add(t14);
        trenes.add(t15);
        trenes.add(t16);
        trenes.add(t17);
        trenes.add(t18);
        trenes.add(t19);
        trenes.add(t20);









        System.out.println("Trenes dentro de cochera c1:");



        do {
            Scanner entrada = new Scanner (System.in);

            System.out.println("Escull una opcio:");
            System.out.println("1. Veure estacions de una linea");
            System.out.println("2. Veure trens de una linea");
            System.out.println("3. Veure quins trens hi ha en una cotxera");
            System.out.println("4. Afegir estacio");
            System.out.println("5. Canviar tren de linea");
            System.out.println("6. Sortir");
            opcio=entrada.nextLine();

            switch (opcio){
                case "1":
                    System.out.println("Escull una linea (l1, l2, l3, l4, l5)");
                    linea = entrada.nextLine();
                    switch (linea){
                        case "l1":
                            System.out.println("Estaciones de la l1:");
                            Iterator<Estacio> it1 = l1.getEstacions().iterator();
                            while (it1.hasNext()){
                                System.out.println(it1.next().getNom());
                            }
                            break;

                        case "l2":
                            System.out.println("Estaciones de la l2:");
                            Iterator<Estacio> it2 = l2.getEstacions().iterator();
                            while (it2.hasNext()){
                                System.out.println(it2.next().getNom());
                            }
                            break;

                        case "l3":
                            System.out.println("Estaciones de la l3:");
                            Iterator<Estacio> it3 = l3.getEstacions().iterator();
                            while (it3.hasNext()){
                                System.out.println(it3.next().getNom());
                            }
                            break;

                        case "l4":
                            System.out.println("Estaciones de la l4:");
                            Iterator<Estacio> it4 = l4.getEstacions().iterator();
                            while (it4.hasNext()){
                                System.out.println(it4.next().getNom());
                            }
                            break;

                        case "l5":
                            System.out.println("Estaciones de la l5:");
                            Iterator<Estacio> it5 = l5.getEstacions().iterator();
                            while (it5.hasNext()){
                                System.out.println(it5.next().getNom());
                            }
                            break;
                    }
                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;

                case "2":
                    System.out.println("Escull una linea (l1, l2, l3, l4, l5)");
                    linea = entrada.nextLine();
                    switch (linea){
                        case "l1":
                            for (int i=0; i<trenes.size();i++){
                                if (trenes.get(i).getLinia()==l1){
                                    System.out.println(trenes.get(i).getIdentificadorTren());
                                }
                            }
                            break;

                        case "l2":
                            for (int i=0; i<trenes.size();i++){
                                if (trenes.get(i).getLinia()==l2){
                                    System.out.println(trenes.get(i).getIdentificadorTren());
                                }
                            }
                            break;

                        case "l3":
                            for (int i=0; i<trenes.size();i++){
                                if (trenes.get(i).getLinia()==l3){
                                    System.out.println(trenes.get(i).getIdentificadorTren());
                                }
                            }
                            break;

                        case "l4":
                            for (int i=0; i<trenes.size();i++){
                                if (trenes.get(i).getLinia()==l4){
                                    System.out.println(trenes.get(i).getIdentificadorTren());
                                }
                            }
                            break;

                        case "l5":
                            for (int i=0; i<trenes.size();i++){
                                if (trenes.get(i).getLinia()==l5){
                                    System.out.println(trenes.get(i).getIdentificadorTren());
                                }
                            }
                            break;
                    }

                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;

                case "3":
                    System.out.println("Escull una cochera (c1, c2, c3, c4, c5)");
                    linea = entrada.nextLine();
                    switch (linea){
                        case "c1":
                            for (int i=0; i<trenes.size(); i++){
                                if (trenes.get(i).getCotxera()==c1){
                                    System.out.println(trenes.get(i).getIdentificadorTren());
                                }
                            }
                            break;

                        case "c2":
                            for (int i=0; i<trenes.size(); i++){
                                if (trenes.get(i).getCotxera()==c2){
                                    System.out.println(trenes.get(i).getIdentificadorTren());
                                }
                            }
                            break;

                        case "c3":
                            for (int i=0; i<trenes.size(); i++){
                                if (trenes.get(i).getCotxera()==c3){
                                    System.out.println(trenes.get(i).getIdentificadorTren());
                                }
                            }
                            break;

                        case "c4":
                            for (int i=0; i<trenes.size(); i++){
                                if (trenes.get(i).getCotxera()==c4){
                                    System.out.println(trenes.get(i).getIdentificadorTren());
                                }
                            }
                            break;

                        case "c5":
                            for (int i=0; i<trenes.size(); i++){
                                if (trenes.get(i).getCotxera()==c5){
                                    System.out.println(trenes.get(i).getIdentificadorTren());
                                }
                            }
                            break;
                    }
                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;

                case "4":
                    String nom_estacio, nom_linia="0";
                    int num_linies;
                    System.out.println("Indica el nom de la estacio");
                    nom_estacio=entrada.nextLine();
                    try {
                        Estacio e18 = new Estacio(nom_estacio);
                        System.out.println("Quantes linies paren en la estacio?");
                        num_linies = entrada.nextInt();
                        for (int i = 0; i < num_linies; i++) {
                                nom_linia=entrada.nextLine();
                            System.out.println("Introdueix el nom de una de les linies");
                            nom_linia = entrada.nextLine();
                            switch (nom_linia) {
                                case "l1":
                                    estacions_l1.add(e18);
                                    break;
                                case "l2":
                                    estacions_l2.add(e18);
                                    break;
                                case "l3":
                                    estacions_l3.add(e18);
                                    break;
                                case "l4":
                                    estacions_l4.add(e18);
                                    break;
                                case "l5":
                                    estacions_l5.add(e18);
                                    break;
                                default:
                                    System.out.println("La linea no existeix");
                                    break;
                            }
                        }
                    }
                    catch (Exception e){
                        System.out.println("Error al afegir la estacio");
                        System.out.println("Vols sortir (S/N)");
                        opcio = entrada.nextLine();
                    }
                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;

                case "5":
                    /*int id_tren,num_tren=-1;
                    String linia_tren_String;
                    Linia linia_tren_Linia;
                    System.out.println("Indica el tren que vols canviar de linea");
                    id_tren=entrada.nextInt();
                    for (int i=0;i<trenes.size();i++){
                        if (trenes.get(i).getIdentificadorTren() == id_tren){
                            num_tren=i;
                        }
                    }
                    if (num_tren>-1) {
                        System.out.println("El tren es troba en la linea" + trenes.get(num_tren).getLinia());
                        System.out.println("En quina linea vols posar el tren?");
                        linia_tren_String=entrada.nextLine();
                        for (int i=0; i<linias.size();i++){
                            if (linias.)
                        }
                        trenes.get(num_tren).setLinia(linia_tren);
                    }else{
                        System.out.println("El tren no existeix");
                    }
                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();*/
                    System.out.println("UNDER CONSTRUCTION");
                    break;
                case "6":
                    System.out.println("Segur que vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;

                default:
                    System.out.println("Has de escollir una opcio valida");
                    break;
            }

        }while (opcio=="n");
    }
}
