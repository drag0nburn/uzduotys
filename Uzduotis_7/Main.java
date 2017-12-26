package Uzduotis_7;

public class Main {
    public static void main(String[] args){
        Mokinys[] a = new Mokinys[10]; // Sukuriame masyva

        Mokinys Viktoras = new Mokinys("Viktoras", "Peledzius", 7, new int[] {7, 8}); // Sukuriame mokinius
        Mokinys Jonas = new Mokinys("Jonas", "Jonaitis", 9, new int[] {1, 2, 3, 9, 6});
        Mokinys Petras = new Mokinys("Petras", "Petraitis", 5, new int[] {1, 2, 3, 10, 7});
        Mokinys Matas = new Mokinys("Matas", "Vasiliauskas", 1, new int[] {1, 2, 3, 7, 4});
        Mokinys Lukas = new Mokinys("Lukas", "Vasiliauskas", 4, new int[] {1, 2, 3, 7, 4});
        Mokinys Vidas = new Mokinys("Vidas", "Kaluzevičius", 3, new int[] {1, 2, 3, 2, 9});
        Mokinys Mantas = new Mokinys("Mantas", "Geležinis", 6, new int[] {1, 2, 3});
        Mokinys Karolis = new Mokinys("Karolis", "Bružas", 4, new int[] {1, 2, 3, 7, 8, 1});
        Mokinys Tadas = new Mokinys("Tadas", "Kairys", 7, new int[] {1, 2, 3, 4});
        Mokinys Arunas = new Mokinys("Arūnas", "Baranauskas", 5, new int[] {1, 2, 3, 4, 8, 10, 10, 8});

        // Uzpildome masyva

        a[0]= Viktoras;
        a[1]= Jonas;
        a[2]= Petras;
        a[3]= Matas;
        a[4]= Lukas;
        a[5]= Vidas;
        a[6]= Mantas;
        a[7]= Karolis;
        a[8]= Tadas;
        a[9]= Arunas;



        //Klasių vidurkiai

        double[] vidurkiai = new double[12];

        for(Mokinys mokinys : a){
            vidurkiai[mokinys.getClassNumber()-1] += mokinys.getAverage();
        }

        for(int i = 0; i < 12; i++){

            if(Mokinys.getCountClasses(i) > 0){
                vidurkiai[i] /= Mokinys.getCountClasses(i);
            }
        }

        for(int i = 0; i < 12; i++){

            System.out.println(i + 1 + " " + "klasės vidurkis yra " + vidurkiai[i]);
        }

        System.out.println("-----------------------------------------------------");




        Mokinys temp;
        boolean sorted = false;

        while(sorted == false) {
            sorted = true;

            for(int i=0; i<a.length-1; i++){

                if(a[i].getAverage()<a[i+1].getAverage()){

                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    sorted = false;
                }
            }
        }

        for (Mokinys anA : a) {
            System.out.println("Mokinio vardas " + anA.getName() + " mokini pavardė " + anA.getSurname() + " ir jo vidurkis " + anA.getAverage());
        }







    }



}
//[1,2,3,4,5]