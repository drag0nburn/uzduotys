package Uzduotis_8;

public class Apskritimas extends Figura{

    Apskritimas(){
        setFigureName("Apskritimas");
    }
    @Override
    public double Perimeter(double area) {
        double radius = Math.sqrt(area / Math.PI);
        return 2 * Math.PI * radius ;
    }

    @Override
    public double Area(double perimeter) {
        double radius = perimeter / (2 * Math.PI);
        return Math.PI * radius * radius;
    }
}
