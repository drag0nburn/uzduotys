import java.util.*;
public class Java_OOP_uzduotis
{
    public static void main(String[] args)
    {
        Mokinys a[] = new Mokinys[10];

            Mokinys Viktoras = new Mokinys("Viktoras", "Pelėdžius", 8);
            Mokinys Jonas = new Mokinys("Jonas", "Jonaitis", 9);
            Mokinys Petras = new Mokinys("Petras", "Petraitis", 5);
            Mokinys Matas = new Mokinys("Matas", "Vasiliauskas", 1);
            Mokinys Lukas = new Mokinys("Lukas", "Vasiliauskas", 4);
            Mokinys Vidas = new Mokinys("Vidas", "Kaluzevičius", 3);
            Mokinys Mantas = new Mokinys("Mantas", "Geležinis", 6);
            Mokinys Karolis = new Mokinys("Karolis", "Bružas", 4);
            Mokinys Tadas = new Mokinys("Tadas", "Kairys", 7);
            Mokinys Arunas = new Mokinys("Arūnas", "Baranauskas", 5);
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

            Mokinys temp;
            boolean sorted = false;


        while (sorted == false) {
            sorted = true;


            for (int i = 0; i < a.length - 1; i++) //praeiname kiekvieną masyvo elementą ir palyginame jį su kitu priekyje esančiu, jei jis didesnis sukeičiame vietomis
            {
                if (a[i].klase > a[i + 1].klase)
                {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    sorted = false;

                }
            }

        }


           for(int i=0; i<10; i++)
            {
              System.out.println(a[i].vardas+" "+a[i].pavarde+" "+a[i].klase);
            }

    }

}

class Mokinys
{
    int klase;
    String vardas;
    String pavarde;

    Mokinys(String vardas, String pavarde, int klase)
    {
        this.vardas=vardas;
        this.pavarde=pavarde;
        this.klase=klase;
    }
}
