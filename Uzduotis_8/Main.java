package Uzduotis_8;

public class Main {

    public static void Perimeter(double area, Figura fig1, Figura fig2, Figura fig3){

        System.out.println("Perimetrai su plotu " + area + ":");
        System.out.println(fig1.getFigureName() + ":" + fig1.Perimeter(area));
        System.out.println(fig2.getFigureName() + ":" + fig2.Perimeter(area));
        System.out.println(fig3.getFigureName() + ":" + fig3.Perimeter(area));
        System.out.println("---------------------------------------------------");
    }

    public static void Area(double perimter, Figura fig1, Figura fig2, Figura fig3){

        System.out.println("---------------------------------------------------");
        System.out.println("Plotai su perimetru " + perimter + ":");
        System.out.println(fig1.getFigureName() + ":" + fig1.Perimeter(perimter));
        System.out.println(fig2.getFigureName() + ":" + fig2.Perimeter(perimter));
        System.out.println(fig3.getFigureName() + ":" + fig3.Perimeter(perimter));
        System.out.println("---------------------------------------------------");
    }

    public static void main(String [] args){
        Figura apskritimas = new Apskritimas();
        Figura kvadratas = new Kvadratas();
        Figura trikampis = new Trikampis();

        Perimeter(100, kvadratas, trikampis, apskritimas);
        Area(100, kvadratas, trikampis, apskritimas);
    }
}
