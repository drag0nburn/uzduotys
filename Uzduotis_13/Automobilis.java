package Uzduotis_13;

public class Automobilis {

    private String numeris;
    private String make;
    private Owner owner;

    public Automobilis(String numeris, String make, String name, String surname) {
        this.numeris = numeris;
        this.make = make;
        this.owner = new Automobilis.Owner();
        this.owner.name = name;
        this.owner.surname = surname;

    }
    @Override
    public String toString() {
        return "Automobilis{" +
                "numeris='" + numeris + '\'' +
                ", marke='" + make + '\'' +
                ", savininkas=" + owner +
                '}';
    }


    public int compareTo(Object o) {
        Automobilis temp = (Automobilis) o;
        int res = 0;
        res = this.owner.surname.compareTo(temp.owner.surname);
        res = res == 0 ? this.owner.name.compareTo(temp.owner.name):res;
        res = res == 0 ? this.getNumeris().compareTo(temp.getNumeris()):res;
        return res;

    }

    public String getNumeris(){
        return numeris;
    }

    public void setNumeris(String numeris){
        this.numeris = numeris;
    }


    private static class Owner{

        String name;
        String surname;

        public String toString() {
            return "Savininkas{" +
                    "vardas='" + name + '\'' +
                    ", pavarde='" + surname + '\'' +
                    '}';
        }



    }


}
