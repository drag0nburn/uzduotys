package Uzduotis_7;

public class Mokinys {

    static int [] kiekis = new int [12];

    String vardas;
    String pavarde;
    int klase;
    int[] pazymiai;

    Mokinys(String vardas, String pavarde, int klase, int[] pazymiai){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.pazymiai = pazymiai;

        if(this.klase==1){
            kiekis[0]=1;
        }

        if(this.klase==2){
            kiekis[1]++;
        }
        if(this.klase==3){
            kiekis[2]++;
        }
        if(this.klase==4){
            kiekis[3]++;
        }
        if(this.klase==5){
            kiekis[4]++;
        }
        if(this.klase==6){
            kiekis[5]++;
        }
        if(this.klase==7){
            kiekis[6]++;
        }
        if(this.klase==8){
            kiekis[7]++;
        }
        if(this.klase==9){
            kiekis[8]++;
        }
        if(this.klase==10){
            kiekis[9]++;
        }
        if(this.klase==11){
            kiekis[10]++;
        }
        if(this.klase==12){
            kiekis[11]++;
        }
    }

    double vidurkis(){
        double suma=0;
        for(int i : this.pazymiai){
            suma+=i;
        }
        return suma / this.pazymiai.length;






    }
}
