import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class main {

    public static void main(String[] args) {

        //IMPORTANTE MODIFICAR RUTA DEL FICHERO!!! (LINEA 386)
        String linea;
        String opcio;
        ArrayList<Tren> trenes = new ArrayList<>();
        ArrayList<Cotxera> cotxeras = new ArrayList<>();
        HashMap<String, Linia> linias = new HashMap();
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
        linias.put("l1",l1);
        linias.put("l2",l2);
        linias.put("l3",l3);
        linias.put("l4",l4);
        linias.put("l5",l5);

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


        Tmb tr1 = new Tmb("Marc","11111111M",30,l1,11);
        Tmb tr2 = new Tmb("Quim","22222222M",20,l1,22);
        Tmb tr3 = new Tmb("Joan","33333333M",50,l2,33);
        Tmb tr4 = new Tmb("Manel","44444444M",38,l2,44);
        Tmb tr5 = new Tmb("Lluis","55555555M",25,l1,55);

        Seguridad se1 = new Seguridad("Albert","12121212M",31,l1,"11/02/2020",123);
        Seguridad se2 = new Seguridad("Pepe","13131313M",42,l1,"12/02/2020",234);
        Seguridad se3 = new Seguridad("Marcos","14141414M",22,l2,"13/02/2020",456);
        Seguridad se4 = new Seguridad("Patricia","15151515M",54,l2,"14/02/2020",567);

        Mantenimiento ma1 = new Mantenimiento("Lucia","78787878M",31,l1,"11/05/2015", true, true);
        Mantenimiento ma2 = new Mantenimiento("Lucas","78787800M",50,l1,"18/05/2015", true, false);
        Mantenimiento ma3 = new Mantenimiento("Otger","78787811M",36,l2,"15/05/2015", false, true);
        Mantenimiento ma4 = new Mantenimiento("Carles","78787822M",22,l2,"13/05/2015", false, false);

        ma1.AssignarTorn(ETorn.MATI);
        ma2.AssignarTorn(ETorn.MATI);
        ma3.AssignarTorn(ETorn.MATI);
        ma4.AssignarTorn(ETorn.MATI);

        System.out.println("Trenes dentro de cochera c1:");



        do {
            Scanner entrada = new Scanner (System.in);

            System.out.println("Escull una opcio:");
            System.out.println("1. Veure estacions de una linea");
            System.out.println("2. Veure trens de una linea");
            System.out.println("3. Veure quins trens hi ha en una cotxera");
            System.out.println("4. Afegir estacio");
            System.out.println("5. Canviar tren de linea");
            System.out.println("6. Crear fitxer amb informacio de una linea");
            System.out.println("7. Veure treballadors d'una linia ");
            System.out.println("8. Provar mètode clone");
            System.out.println("9. Provar mètode compareTo");
            System.out.println("10. Reassignar linia a treballador:");
            System.out.println("11. Reassignar torn a treballador:");
            System.out.println("0. Sortir");
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
                    int id_tren,num_tren=-1;
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
                        System.out.println("El tren es troba en la linea " + trenes.get(num_tren).getLinia().getIdentificadorLinia());
                        System.out.println("En quina linea vols posar el tren?");
                        linia_tren_String=entrada.nextLine();
                        linia_tren_String=entrada.nextLine();
                        linia_tren_Linia = linias.get(linia_tren_String);
                        trenes.get(num_tren).setLinia(linia_tren_Linia);
                        System.out.println("El tren es troba en la inea "+trenes.get(num_tren).getLinia().getIdentificadorLinia());
                    }else{
                        System.out.println("El tren no existeix");
                    }
                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    //System.out.println("UNDER CONSTRUCTION");
                    break;

                case "6":
                    System.out.println("Escull una linea (l1, l2, l3, l4, l5)");
                    linea = entrada.nextLine();
                    try {
                        //Marc
                        FileWriter f = new FileWriter("C:\\Users\\marcg\\IdeaProjects\\Proyecto-Java-UF5\\Linea.txt");
                        //Roger
                        //FileWriter f = new FileWriter("C:\\Users\\roger\\Documents\\GRADO SUPERIOR\\DAW2\\Programacio orientat a objectes (m03uf456)\\ESTELA\\UF5\\PROYECTO\\Linea.txt");
                        f.write("ID Linia: "+linias.get(linea).getIdentificadorLinia());
                        f.write("\nLes estacions de la linea son: ");
                        Iterator<Estacio> it_linea = linias.get(linea).getEstacions().iterator();
                        while (it_linea.hasNext()){
                            f.write(it_linea.next().getNom()+", ");
                        }
                        f.write("\n Els treballadors de la linea son: ");
                        for (int i=0;i<linias.get(linea).getTreballadors().size();i++) {
                            f.write(linias.get(linea).getTreballadors().get(i).getNom() + ", ");
                        }
                        f.write("\n");
                        f.write("Els trens de la linea son: ");
                        for (int i=0; i<trenes.size();i++){
                            if (trenes.get(i).getLinia().getIdentificadorLinia().equals(linea)){
                                f.write(trenes.get(i).getIdentificadorTren()+", ");
                            }
                        }
                        f.write("\n");
                        f.close();
                        System.out.println("Fitxer creat");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;


                case "7":
                    System.out.println("Escull una linea (l1, l2, l3, l4, l5)");
                    linea = entrada.nextLine();
                    switch (linea){
                        case "l1":
                            l1.getTreballadors().forEach((t) -> System.out.println(t.getNom()+" "+t.getClass()));
                            break;

                        case "l2":
                            l2.getTreballadors().forEach((t) -> System.out.println(t.getNom()+" "+t.getClass()));
                            break;

                        case "l3":
                            l3.getTreballadors().forEach((t) -> System.out.println(t.getNom()+" "+t.getClass()));
                            break;

                        case "l4":
                            l4.getTreballadors().forEach((t) -> System.out.println(t.getNom()+" "+t.getClass()));
                            break;

                        case "l5":
                            l5.getTreballadors().forEach((t) -> System.out.println(t.getNom()+" "+t.getClass()));
                            break;
                    }

                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;


                case "8":
                    System.out.println("Clonant...");
                    Tmb tr11 = (Tmb) tr1.clone();
                    Tmb tr12 = (Tmb) tr2.clone();
                    System.out.println("TREBALLADORS LINIA 1:");
                    l1.getTreballadors().forEach((t) -> System.out.println(t.getNom()+" "+t.getClass()));
                    System.out.println("************************************************");
                    tr11.setNom("CLONAT1");
                    tr12.setNom("CLONAT2");
                    System.out.println("TREBALLADORS LINIA 1 despres de canviar noms als clonats:");
                    l1.getTreballadors().forEach((t) -> System.out.println(t.getNom()+" "+t.getClass()));
                    System.out.println("************************************************");

                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;

                case "9":
                    System.out.println("Comparar seguretat segons tip:");
                    System.out.println("tip 1: "+ se1.getTip()+" "+se1.getNom());
                    System.out.println("tip 2: "+ se2.getTip()+" "+se2.getNom());
                    if (se1.compareTo(se2) < 0 ) {
                        System.out.println(se2.getNom()+" amb tip: "+se2.getTip()+" es major");
                    }else if (se1.compareTo(se2) > 0 ) {
                        System.out.println(se1.getNom()+" amb tip: "+se1.getTip()+" es major");
                    }else {
                        System.out.println (se1.getNom()+" i "+se2.getNom()+" son iguals");
                    }

                    System.out.println("************************************************");

                    System.out.println("Canviant tip a Pepe per 123 i comparant:");
                    se2.setTip(123);
                    System.out.println("tip 1: "+ se1.getTip()+" "+se1.getNom());
                    System.out.println("tip 2: "+ se2.getTip()+" "+se2.getNom());
                    if (se1.compareTo(se2) < 0 ) {
                        System.out.println(se2.getNom()+" amb tip: "+se2.getTip()+" es major");
                    }else if (se1.compareTo(se2) > 0 ) {
                        System.out.println(se1.getNom()+" amb tip: "+se1.getTip()+" es major");
                    }else {
                        System.out.println (se1.getNom()+" i "+se2.getNom()+" son iguals");
                    }

                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;


                case "10":
                    System.out.println("Introduiu linia nova per a treballador: "+ma1.getNom());

                    linea = entrada.nextLine();
                    switch (linea){
                        case "l1":
                            ma1.AssignarLinia(l1);
                            break;

                        case "l2":
                            ma1.AssignarLinia(l2);
                            break;

                        case "l3":
                            ma1.AssignarLinia(l3);
                            break;

                        case "l4":
                            ma1.AssignarLinia(l4);
                            break;

                        case "l5":
                            ma1.AssignarLinia(l5);
                            break;
                    }

                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;

                case "11":
                    System.out.println("treballador: "+ma1.getNom()+" torn: "+ma1.getTorn());
                    System.out.println("treballador: "+ma2.getNom()+" torn: "+ma2.getTorn());
                    System.out.println(" ");
                    System.out.println("Assignant torn de TARDA per a treballador: "+ma1.getNom());
                    ma1.AssignarTorn(ETorn.TARDA);
                    System.out.println("treballador: "+ma1.getNom()+" torn: "+ma1.getTorn());
                    System.out.println(" ");
                    System.out.println("Assignant torn de NIT per a treballador: "+ma2.getNom());
                    ma2.AssignarTorn(ETorn.NIT);
                    System.out.println("treballador: "+ma2.getNom()+" torn: "+ma2.getTorn());
                    System.out.println(" ");
                    //System.out.println("Assignant torn de PATATA per a treballador: "+ma2.getNom());
                    //ma2.AssignarTorn(PATATA);
                    System.out.println(" ");

                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;

                /*case "12":
                    System.out.println("Buscar estacions de transbordament a la linia 1:");

                    l1.getEstacions().forEach((e) -> if (e1.getNom().equals(e)));


                    System.out.println("Vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;
                */

                case "0":
                    System.out.println("Segur que vols sortir (S/N)");
                    opcio = entrada.nextLine();
                    break;

                default:
                    System.out.println("Has de escollir una opcio valida");
                    break;
            }

        }while (opcio.equals("n"));
    }
}
