package Uzduotis_7;

public class Mokinys extends Zmogus {

    private static int [] countClasses = new int [12];
    private int [] grades;
    private double average;
    private int classNumber;


    Mokinys (String name, String surname, int classNumber) {

        super(name, surname);
        this.classNumber = classNumber;
    }

    Mokinys (String name, String surname, int classNumber, int[] grades){
        this(name, surname, classNumber);
        this.grades = grades;
    }

    public void calculateAverage(){

        int sum = 0;
        for(int grade : this.grades){
            sum += grade;
        }

        this.average = (double)sum/this.grades.length;
    }

    public void setClassNumber(int classNumber){

        countClasses[this.classNumber - 1] --;
        this.classNumber = classNumber;
        countClasses[this.classNumber - 1]++;
    }

    public static int getCountClasses(int classNumber){

        return countClasses[classNumber];
    }

    public static int[] getCountClasses() {
        return countClasses;
    }

    public double getAverage() {
        this.calculateAverage();
        return average;
    }

    public int getClassNumber() {
        return classNumber;
    }
}


    

