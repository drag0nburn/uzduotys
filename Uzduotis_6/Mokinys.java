package Uzduotis_6;

public class Mokinys {
    String vardas;
    String pavarde;
    int klase;
    int[] pazymiai;

    Mokinys(String vardas, String pavarde, int klase, int[] pazymiai){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.pazymiai = pazymiai;
    }

    double vidurkis(){
        double suma=0;
        for(int i : this.pazymiai){
            suma+=i;
        }
        return suma / this.pazymiai.length;




    }
}
