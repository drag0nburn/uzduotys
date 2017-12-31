package Uzduotis_8;

public class Trikampis extends Figura {

    Trikampis(){
        setFigureName("Trikampis");
    }
    @Override
    public double Perimeter(double area) {

        double side = Math.sqrt(4 * area / Math.sqrt(3));

        return side * 3;
    }

    @Override
    public double Area(double perimeter) {

        double side = perimeter / 3;
        return side * side * Math.sqrt(3) / 4;
    }
}
