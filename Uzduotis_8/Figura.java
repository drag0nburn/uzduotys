package Uzduotis_8;

public abstract class Figura {

    private String figureName;

    public abstract double Perimeter(double side);
    public abstract double Area(double side);

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }
}
