package Uzduotis_8;

public class Kvadratas extends Figura {

    Kvadratas(){

        setFigureName("Kvadratas");}

    @Override
    public double Perimeter(double area) {
        return 4 * Math.sqrt(area);
    }

    @Override
    public double Area(double perimeter) {
        return (perimeter / 4) * (perimeter / 4);
    }
}
